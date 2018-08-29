/**
*
*	@author	Micael Levi - 21554923 <mllc@icomp.ufam.edu.br>
*	@date	21 de out de 2016
*/

public class Mestre {
	
	// ATRIBUTOS DE INSTÂNCIA:
	String nome;
	int anoNascimento;
	String afiliacao;
	String posto;
	
	// CONSTRUTORES:	
	Mestre(){
		this("Micael", 1997, "Cavalcante", "Jedi");
	}
	public Mestre(String nome, int anoNascimento, String afiliacao, String posto){
		this.nome = nome;
		this.anoNascimento = anoNascimento;
		this.afiliacao = afiliacao;
		this.posto = posto;
	}
	
	
	// MÉTODOS:
	int getIdade(int anoReferencia){
		return anoReferencia - anoNascimento;
	}
	String getAnoNascimentoString(){
		String retorno = anoNascimento + (anoNascimento < 0 ? "ABY":"DBY");
		return retorno.replace("-", "");
	}
	boolean possuiForca(){
		return posto.equals("Jedi") || posto.equals("Sith");
	}
	String getDescricao(){
		return String.format("Mestre: nome=%s, anoNascimento=%s, afiliacao=%s, posto=%s, possuiForca=%s.", nome, getAnoNascimentoString(), afiliacao, posto, possuiForca());
	}

}
