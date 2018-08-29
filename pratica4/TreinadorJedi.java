/**
*
* @author Micael Levi &#8212; 21554923 &lt;mllc@icomp.ufam.edu.br&gt;
* @since 4 de nov de 2016
*/

public class TreinadorJedi {

	String titulacao;
	String nome;
	
	public TreinadorJedi() {}
	
	String getDescricao(){
		return String.format("%s %s", this.titulacao, this.nome);
	}

	public TreinadorJedi(String titulacao, String nome)
	{	
		// TODO Auto-generated constructor method.
		this.titulacao = titulacao;
		this.nome = nome;
	}
}
