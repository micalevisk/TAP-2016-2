package icomp.tap.pratica5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;


/**
* @author Micael Levi &#8212; 21554923 &lt;mllc&#64;icomp.ufam.edu.br&gt;
* @version 5 de nov de 2016
* @see TurmaEmSala
* @since 5.0
*/
public class Ensalamento {

	ArrayList<Sala> salas;
	ArrayList<Turma> turmas;
	ArrayList<TurmaEmSala> ensalamento;
	
	private boolean forcarAlocacao = true;		// (flag) se for 'true' então aloca a turma na sala passada (método 'alocar').
	
	private ArrayList<Sala> consulta_salas;		// salas em ordem decrescente de capcacidade.
	private ArrayList<Turma> consulta_turmas; // turmas em ordem decrescente de número de alunos.

	
	//////////////////////////////////////////////////////////////////////////////////////////////////
	public interface Predicate<T> { boolean test(T o); }
	public static <T> void filtrar(Collection<T> alvo, Collection<T> destino, Predicate<T> predicate){
		if((alvo == null) || (predicate == null) || (destino == null)) return;
	  for(T obj : alvo) 
	  	if(predicate.test(obj)) destino.add(obj);
	}
	//////////////////////////////////////////////////////////////////////////////////////////////////

	
	Ensalamento(){
		this.salas = new ArrayList<>();
		this.turmas = new ArrayList<>();
		this.ensalamento = new ArrayList<>();
		
		this.consulta_salas = new ArrayList<>();
		this.consulta_turmas = new ArrayList<>();
	}
	
	/**
	* Adiciona uma sala na lista de salas (atributo 'salas').
	* @param sala A sala que será adicionada.
	*/
	void addSala(Sala sala){
		this.salas.add(sala);
		this.consulta_salas.add(sala);
	}
	
	/**
	* Adicona uma turma na lista de turmas (atributo 'turmas').
	* @param turma A turma que será adicionada.
	*/
	void addTurma(Turma turma){
		this.turmas.add(turma);
		this.consulta_turmas.add(turma);
	}

	/**
	* Responde "Qual a sala de uma determinada turma?".
	* @param turma A turma que será consultada.
	* @return A sala da turma consultada (se a turma tiver alguma sala).
	*/
	Sala getSala(Turma turma){
		for (TurmaEmSala turmaCorrente : ensalamento) {
			if(turmaCorrente.turma == turma)
				return turmaCorrente.sala;
		}
		return null;
	}
	
	/**
	* Responde "Uma determinada sala está disponível em um determinado horário?".
	* @param sala A sala em questão.
	* @param horario O horário a ser consultado.
	* @return <tt>true</tt> se a sala estiver disponível no horário <tt>horario</tt>.
	*/
	boolean salaDisponivel(Sala sala, int horario){
		for(TurmaEmSala turmaCorrente : ensalamento){
			if(turmaCorrente.sala == sala){
				ArrayList<Integer> horariosNessaTurma = turmaCorrente.turma.horarios;
				if( horariosNessaTurma.contains(horario) ) return false;
			}			
		}
		
		return true;
	}
	
	/**
	* Responde "Uma determinada sala está disponível em todos os horários de uma lista de horários?".
	* @param sala A sala em questão.
	* @param horarios Os horários a serem consultados.
	* @return <tt>true</tt> se a sala estiver disponível em todos os horários da lista <tt>horarios</tt>.
	*/
	boolean salaDisponivel(Sala sala, ArrayList<Integer> horarios){
		for (Integer horario : horarios) {
			if(!salaDisponivel(sala, horario)) return false;	
		}
		return true;
	}
	
	/**
	* Aloca, se for possível, uma determinada turma em uma determinada sala.
	* @param turma A turma a ser alocada.
	* @param sala A sala alvo.
	* @return <tt>true</tt> se a turma foi alocada na sala <tt>sala</tt>.
	*/
	boolean alocar(Turma turma, Sala sala){
		if((turma.acessivel != sala.acessivel) || (turma.numAlunos > sala.capacidade)) return false;
		
		if(salaDisponivel(sala, turma.horarios)){
			if(this.forcarAlocacao)
				this.ensalamento.add( new TurmaEmSala(turma, sala) );
			return true;
		}
		return false;
	}

	
	/**
	 * Verifica se é possível alocar uma determinada turma em uma sala <code>(variáveis: capacidade, acessibilidade e horários)</code>.
	 * @param turma A turma em questão.
	 * @param sala A sala que será consultada.
	 * @return <tt>true</tt> se for possível alocar.
	 */
	private boolean daPraAlocar(Turma turma, Sala sala){ 
		this.forcarAlocacao = false;
		boolean resultado = alocar(turma, sala);
		this.forcarAlocacao = true;
		return resultado;
	}
	
	
	/**
	* <p>Aloca uma sala para todas as turmas da lista <tt>turmas</tt>, caso seja possível.</p>
	* <h1>A ideia utilizada:</h1>
	* <pre>
	* <tt>1)</tt> Ordenam-se em ordem descrescente de <tt>capacidade</tt> ou <tt>numAlunos</tt> as listas {@link #consulta_salas} e {@link #consulta_turmas}, respectivamente;
	* <tt>2)</tt> Para cada turma na lista de turmas que será consultada e procura-se alguma sala (percorrendo em ordem decrescente) na lista de salas em que é possível alocar a turma corrente;
	* <tt>3)</tt> Caso encontre alguma, salva a sala e a turma (correntes) em um buffer, e, ao chegar na última sala da lista, aloca a turma do buffer na sala do buffer. 
	* </pre>
	*/
	void alocarTodas(){
		
		Collections.sort(this.consulta_salas, new CapacidadeComparator());
		Collections.sort(this.consulta_turmas, new NumAlunosComparator());
		
		for(Turma turmaAtual : this.consulta_turmas){
			//System.out.println("======> "+turmaAtual.nome);
			
			Turma turmaPraAlocar = null;
			Sala salaAlvo = null;
			
			for(Sala salaAtual : this.consulta_salas){
				//System.out.println("\t[visitando] sala "+salaAtual.sala);
				
				if(turmaAtual.numAlunos > salaAtual.capacidade) break;
				if(daPraAlocar(turmaAtual, salaAtual)){
					//System.out.println("\t[dá pra alocar] na sala "+salaAtual.sala);
					turmaPraAlocar = turmaAtual;
					salaAlvo = salaAtual;
				}
			}
			if(turmaPraAlocar != null){
				//System.out.println("\t[alocou] na sala "+salaAlvo.sala);
				alocar(turmaPraAlocar, salaAlvo);
			}
			
		}
		
	}
	
	/**
	* Responde "Quantas turmas forma alocadas em um sala com sucesso?".
	* @return O total de turmas alocadas.
	*/
	int getTotalTurmasAlocadas(){
		return this.ensalamento.size();
//		int total = 0;
//		for(TurmaEmSala turmaEmSala : ensalamento)
//			total += (turmaEmSala.sala != null ? 1 : 0);
//		return total;
	}
	
	/**
	* Responde "Qual o total de espacos livres nas salas?".
	* @return A soma de espacos livres de todas as salas (da lista <tt>sala</tt>), i.e., pra cada sala e turma no ensalamento, a soma da diferença <tt>capacidade - numAlunos</tt>.
	*/
	int getTotalEspacoLivre(){
		int total=0;
		for(TurmaEmSala turmaEmSala : ensalamento) {
			Sala salaAtual = turmaEmSala.sala;
			Turma turmaAtual = turmaEmSala.turma;
			total += (salaAtual.capacidade - turmaAtual.numAlunos);
		}
		return total;
	}
	
	/**
	* <p><i>Saída:</i></p>
	* <pre>
	* Total de Salas: <var>a</var>
	* Total de Turmas: <var>b</var>
	* Turmas Alocadas: <var>c</var>
	* Espaços Livres: <var>d</var>
	* </pre>
	* @return Um texto contendo um resumo do ensalamento.
	*/
	String relatorioResumoEnsalamento(){
		return String.format("Total de Salas: %d\nTotal de Turmas: %d\nTurmas Alocadas: %d\nEspaços Livres: %d",
				this.salas.size(), this.turmas.size(),
				getTotalTurmasAlocadas(), getTotalEspacoLivre());
	}
	
	/**
	* <p><i>Exemplo de saída:</i></p>
	* <pre>
	* Total de Salas: <var>a</var>
	* Total de Turmas: <var>b</var>
	* Turmas Alocadas: <var>c</var>
	* Espaços Livres: <var>d</var>
	* 
	* --- Bloco <tt>6</tt>, Sala <tt>101</tt> (<tt>50</tt> lugares, <tt>acessivel</tt>) ---
	* 
	* Turma: <tt>Tecnicas de Programação</tt>
	* Professor: <tt>Horacio Fernandes</tt>
	* Número de Alunos: <tt>50</tt>
	* Horário: <tt>terça 14hs, quinta 14hs, sexta 14hs</tt>
	* Acessível: <tt>nao</tt>
	* 
	* Turma: <tt>nome da turma</tt>
	* Professor: <tt>nome do professor</tt>
	* Número de Alunos: <tt>quantidade de alunos dessa turma</tt>
	* Horário: <tt>horarios dessa turma nessa sala</tt>
	* Acessível: <tt>é acessivel?</tt>
	* 
	* --- Bloco <tt>6</tt>, Sala <tt>203</tt> (<tt>50</tt> lugares, <tt>nao acessivel</tt>) ---
	* 
	* --- Bloco <tt>6</tt>, Sala <tt>204</tt> (<tt>100</tt> lugares, <tt>nao acessivel</tt>) ---
	*  
	* </pre>
	* <p>Ou seja, a primeira linha e o resultado da chamada do {@link #relatorioResumoEnsalamento()}</p>
	* <p>Depois seguem os resultados das chamadas do {@link Sala#getDescricao()}
	* junto com o resultado da chamada do {@link Turma#getDescricao()} sobre todas as turmas alocadas nessa sala.</p>
	* @return O relatório completo das salas com as turmas alocadas,.
	*/
	String relatorioTurmasPorSala(){
		String resultado = relatorioResumoEnsalamento() + "\n\n";
		
		for (Sala salaCorrente : this.salas) {
			resultado += "--- " + salaCorrente.getDescricao().trim() + " ---" + "\n\n";
			for(TurmaEmSala turmaEmSalaAtual : ensalamento){
				if(turmaEmSalaAtual.sala == salaCorrente) 
					resultado += turmaEmSalaAtual.turma.getDescricao() + '\n';
			}
		}
		
		return resultado.trim();
	}
	
	/**
	* <p><i>Exemplo de saída:</i></p>
	* <pre>
	* Total de Salas: <tt>4</tt>
	* Total de Turmas: <tt>4</tt>
	* Turmas Alocadas: <tt>3</tt>
	* Espaços Livres: <tt>65</tt>
	* 
	* Turma: <tt>Algoritmos e Estrutura de Dados I</tt>
	* Professor: <tt>Edleno Silva</tt>
	* Número de Alunos: <tt>60</tt>
	* Horário: <tt>segunda 8hs, quarta 8hs, sexta 8hs</tt>
	* Acessível: <tt>nao</tt>
	* Sala: <tt>Bloco 6, Sala 102 (100 lugares, acessivel)</tt>
	* 
	* Turma: <tt>Tecnicas de Programação</tt>
	* Professor: <tt>Horacio Fernandes</tt>
	* Número de Alunos: <tt>50</tt>
	* Horário: <tt>terça 14hs, quinta 14hs, sexta 14hs</tt>
	* Acessível: <tt>nao</tt>
	* Sala: <tt>Bloco 6, Sala 101 (50 lugares, acessivel)</tt>
	* </pre>
	* @return Um relatório completo das turmas alocadas.
	*/
	String relatorioSalasPorTurma(){
		String resultado = relatorioResumoEnsalamento() + "\n\n";
		
		for(Turma turmaCorrente : this.turmas){
			String sala_str = null;
			resultado += turmaCorrente.getDescricao();
			
			for(TurmaEmSala turmaEmSalaAtual : this.ensalamento){
				if(turmaEmSalaAtual.turma == turmaCorrente){
					//sala_str = (turmaEmSalaAtual.sala == null ? "SEM SALA" : turmaEmSalaAtual.sala.getDescricao());
					sala_str = turmaEmSalaAtual.sala.getDescricao();
					break;
				}
			}
			if(sala_str == null) sala_str = "SEM SALA\n";
			resultado += "Sala: " + sala_str + '\n';
		}
		
		return resultado.trim();
	}

}




//////////////////////////////[ EXTRA ] //////////////////////////////
class CapacidadeComparator implements Comparator<Sala> {
	@Override
	public int compare(Sala a, Sala b) {
	return b.capacidade - a.capacidade;
	}
}
class NumAlunosComparator implements Comparator<Turma> {
	@Override
	public int compare(Turma a, Turma b) {
	return b.numAlunos - a.numAlunos;
	}
}


/*
//(c)	http://www.programcreek.com/2013/09/top-10-questions-for-java-collections/
public interface Predicate<T> { boolean test(T o); }
public static <T> void filter(Collection<T> alvo, Collection<T> destino, Predicate<T> predicate){
if(!( (alvo != null) && (predicate != null) )) return;
for(T obj : alvo) if(predicate.test(obj)) destino.add(obj);
}

private ArrayList<Sala> getSalas(boolean acessiveis){
ArrayList<Sala> salasFiltradas = new ArrayList<>();

Predicate<Sala> ehAcessivel = new Predicate<Sala>() {
public boolean test(Sala s) { 
return s.acessivel == true;
}
};
Predicate<Sala> naoAcessivel = new Predicate<Sala>() {
public boolean test(Sala s) { 
return s.acessivel == false;
}
};

filter(this.salas, salasFiltradas, (acessiveis ? ehAcessivel : naoAcessivel));

return salasFiltradas;
}
private ArrayList<Sala> getSalasAcessiveis(){ return getSalas(true); }
private ArrayList<Sala> getSalasNaoAcessiveis(){ return getSalas(false); }

private ArrayList<Turma> getTurmasSemSala(){
ArrayList<Turma> turmasFiltradas = new ArrayList<>();
boolean encontrou;
for(Turma turmaCorrente : this.turmas){
encontrou = false;
for(TurmaEmSala turmaEmSala : this.ensalamento){
if(turmaEmSala.turma == turmaCorrente){
encontrou = true;
if(turmaEmSala.sala == null) {
turmasFiltradas.add(turmaCorrente);
break;
}
}
}
if(!encontrou) turmasFiltradas.add(turmaCorrente);
}

return turmasFiltradas;
}
*/
////////////////////////////////////////////////////////////////////