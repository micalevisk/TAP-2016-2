
/**
* @author Micael Levi &#8212; 21554923 &lt;mllc&#64;icomp.ufam.edu.br&gt;
* @version 4 de nov de 2016
* @since 5.0
*/

public class Sala {

	int bloco;
	int sala;
	int capacidade;
	boolean acessivel;

	Sala(){
		this(6, 106, 40, false);
	}

	/**
	* Cria um objeto que abstrai uma sala.
	* @param bloco O local em que a sala está.
	* @param sala O número da sala.
	* @param capacidade A quantidade total de alunos suportados nesta sala.
	* @param acessivel Responde a pergunta "a sala possui acessibilidade?".
	*/
	public Sala(int bloco, int sala, int capacidade, boolean acessivel){
		// TODO Auto-generated constructor method.
		this.bloco = bloco;
		this.sala = sala;
		this.capacidade = capacidade;
		this.acessivel = acessivel;
	}

	/**
	* Para obter uma descrição completa da sala.
	* @return A descricao no formato <u>Bloco <var>x</var>, Sala <var>y</var> (<var>z</var> lugares, [não ]acessível)</u>.
	*/
	String getDescricao(){
		return String.format("Bloco %d, Sala %d (%d lugares, %s acessível)\n", bloco, sala, capacidade, (acessivel ? "" : "não "));
	}


	@Override
	public String toString() {
		return String.format("{%d|capacidade:%d|%s}", sala, capacidade, acessivel);
	}

}
