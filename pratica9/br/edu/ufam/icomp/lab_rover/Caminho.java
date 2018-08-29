/**
*
* @author Micael Levi &#8212; 21554923 &lt;mllc&#64;icomp.ufam.edu.br&gt;
* @since 2 de dez de 2016
*/
package br.edu.ufam.icomp.lab_rover;

public class Caminho {

	private Coordenada[] caminho;
	private int tamanho;
	
	private int tamMax; 
	 
	public Caminho(int tamMax){
		this.caminho = new Coordenada[tamMax];
		this.tamanho = 0;
		
		this.tamMax = tamMax;
	}
	
	public int tamanho(){
		return this.tamanho;
	}
	
	public void addCoordenada(Coordenada coordenada) throws TamanhoMaximoExcedidoException, DistanciaEntrePontosExcedidaException {
		if(this.tamanho >= this.caminho.length)
			throw new TamanhoMaximoExcedidoException();
		
		if(this.tamanho > 0){ // tem ao menos 1 elemento
			if(coordenada.distancia(this.caminho[tamanho-1]) > 15) 
				throw new DistanciaEntrePontosExcedidaException();
		}

		this.caminho[tamanho] = coordenada;
		this.tamanho++;
	}
	
	public void reset(){
		this.caminho = new Coordenada[this.tamMax];
		this.tamanho = 0;
	}
	
	@Override
	public String toString(){
		String title = "Dados do caminho:\n";
		String info1 = String.format(" - Quantidade de pontos: %d\n", this.tamanho);
		String info2 = " - Pontos:\n";
		String coords = new String();
		
		for(int i=0; i < this.tamanho; ++i){
			Coordenada coordenada = this.caminho[i];
			coords += "   -> " + coordenada.toString() + "\n"; 
		}
		
		return title + info1 + info2 + coords;
	}
	
}
