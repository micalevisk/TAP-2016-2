/**
*
* @author Micael Levi &#8212; 21554923 &lt;mllc@icomp.ufam.edu.br&gt;
* @since 4 de nov de 2016
*/
import java.util.ArrayList;
import java.util.Iterator;

public class SessaoJedi {

	String nome;
	TreinadorJedi treinador;
	ArrayList<IniciadoJedi> iniciados;
	
	public SessaoJedi(String nome, TreinadorJedi treinador) {
		this.nome = nome;
		this.treinador = treinador;
		iniciados = new ArrayList<>();
	}
	
	IniciadoJedi getIniciado(String nome){
		Iterator<IniciadoJedi> i = iniciados.iterator();
		while(i.hasNext()){
			IniciadoJedi treinadorAtual = i.next();
			String treinador = treinadorAtual.nome;
			if(treinador == nome) return treinadorAtual;
		}
		return null;
	}
	
	void addIniciado(IniciadoJedi iniciado){
		boolean existe = getIniciado(iniciado.nome) != null;
		if(!existe) iniciados.add(iniciado);
	}
	
	double getMediaAnoNascimento(){
		double media = 0;
		for(IniciadoJedi treinadorAtual : iniciados)
			media += treinadorAtual.anoNascimento;
		
		return media / (double)iniciados.size();
	}
	
	String getDescricao(){
		String saida = String.format("--> SESSÃO %s (Treinador: %s)\n", this.nome, this.treinador.getDescricao());
		
		for(int i=0; i < iniciados.size(); ){
			IniciadoJedi treinadorAtual = iniciados.get(i);
			saida += String.format("  - Iniciado %d: %s \n", ++i, treinadorAtual.getDescricao() );
		}
		return saida;
	}
	

}
