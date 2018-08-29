
import java.util.ArrayList;

/**
* @author Micael Levi &#8212; 21554923 &lt;mllc&#64;icomp.ufam.edu.br&gt;
* @version 5 de nov de 2016
* @since 5.0
*/

public class Turma {

	String nome;
	String professor;
	int numAlunos;
	boolean acessivel;
	ArrayList<Integer> horarios;

	Turma(){
		this("Algoritmos e Estrutura de Dados I","Edleno Silva",0,true);
		addHorario(1);
		addHorario(15);
		addHorario(29);
	}


	/**
	* Cria uma turma.
	* @param nome O nome da disciplina.
	* @param professor O nome do professor da turma.
	* @param numAlunos A quantidade de alunos nessa turma.
	* @param acessivel Responde "a turma possui acessibilidade?".
	*/
	public Turma(String nome, String professor, int numAlunos, boolean acessivel){
		// TODO Auto-generated constructor method.
		this.nome = nome;
		this.professor = professor;
		this.numAlunos = numAlunos;
		this.acessivel = acessivel;
		this.horarios = new ArrayList<>();
	}

	/**
	* Adiciona um hor�rio na lista de hor�rios da turma (atributo {@link #horarios}).
	* @param horario O hor�rio que ser� adicionado � lista.
	*/
	void addHorario(int horario){
		horarios.add(horario);
	}

	/**
	* Recupera os hor�rios da turma em formato texto.
	* @return Os hor�rios no formato:<code>[dia da semana] [hora de in�cio]hs</code>.
	*/
	String getHorariosString(){
		String resultado = "";
		for (Integer hora : horarios)
			resultado += parseHora(hora) + ", ";
		return resultado.replaceFirst(", $", "");
	}

	/**
	* <p>Recupera a descri��o completa da turma.</p>
	* <p><i>Exemplo de sa�da:</i></p>
	* <pre>
	* Turma: <tt>Tecnicas de Programacao</tt>
	* Professor: <tt>Horacio Fernandes</tt>
	* N�mero de Alunos: <tt>50</tt>
	* Hor�rio: <tt>ter�a 14hs, quinta 14hs, sexta 14hs</tt>
	* Acess�vel: <tt>n�o</tt>
	* </pre>
	* @return A descri��o com os atributos <tt>nome</tt>, <tt>professor</tt>, <tt>numAlunos</tt> e retorno do m�todo {@link Turma#getHorariosString()} e <tt>acessivel</tt>;
	*/
	String getDescricao(){
		String resultado = "Turma: " + this.nome;
		resultado += "\nProfessor: " + this.professor;
		resultado += "\nN�mero de Alunos: " + this.numAlunos;
		resultado += "\nHor�rio: " + getHorariosString();
		resultado += "\nAcess�vel: " + (this.acessivel ? "sim" : "n�o") + "\n";
		return resultado;
	}



	////////////////////////////////////////////////// [ EXTRA ] //////////////////////////////////////////////////

	/**
	* Para identificar o dia da semana e a carga hor�rio a partir de uma hora passada.
	* @param hora A hora a ser buscada.
	* @return Uma string no formato:<code>[dia da semana] [horas por dia]hs</code>
	*/
	private String parseHora(int hora){
		String diaDaSemana = new String();

		if( estaEntre(hora, 1, 7) ) diaDaSemana = "segunda";
		else if( estaEntre(hora, 8, 14) ) diaDaSemana = "ter�a";
		else if( estaEntre(hora, 15, 21) ) diaDaSemana = "quarta";
		else if( estaEntre(hora, 22, 28) ) diaDaSemana = "quinta";
		else diaDaSemana = "sexta";

		int hsdia = hora%7 - 1;
		if(hsdia < 0) hsdia = 20;
		else hsdia = 8 + (2 * hsdia);
		return String.format("%s %dhs", diaDaSemana, hsdia);
	}

	/**
	* Verifica se um inteiro est� no intervalo fechado <tt>[inicio, fim]</tt>.
	* @param valor O inteiro a ser verificado.
	* @param inicio O interalo inicial.
	* @param fim O intervalo final.
	* @return <tt>true</tt> se <tt>valor</tt> estiver nesse <i>range</i>.
	*/
	private boolean estaEntre(int valor, int inicio, int fim){
		return ((valor >= inicio) && (valor <= fim));
	}

	
	@Override
	public String toString() {
		return String.format("{%s|numAlunos:%d|%s}", nome, numAlunos, acessivel);
	}

}
