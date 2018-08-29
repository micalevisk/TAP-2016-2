/**
*
* @author Micael Levi &#8212; 21554923 &lt;mllc@icomp.ufam.edu.br&gt;
* @since 4 de nov de 2016
*/

public class IniciadoJedi {
	
	String nome;
	String especie;
	int anoNascimento;
	
	public IniciadoJedi() {
		this("Katooni", "seila", 97);
	}

	public IniciadoJedi(String nome, String especie, int anoNascimento)
	{
		// TODO Auto-generated constructor method.
		this.nome = nome;
		this.especie = especie;
		this.anoNascimento = anoNascimento;
	}
	
	public String getAnoNascimento(){
		return Integer.toString(Math.abs(this.anoNascimento))+" "+ (this.anoNascimento < 0? "ABY":"DBY");
	}

	public String getDescricao(){
		return String.format("%s (especie=%s, nascimento=%s)\n", this.nome, this.especie, getAnoNascimento());
	}

}
