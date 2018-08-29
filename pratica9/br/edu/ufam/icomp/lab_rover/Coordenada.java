/**
*
* @author Micael Levi &#8212; 21554923 &lt;mllc&#64;icomp.ufam.edu.br&gt;
* @since 2 de dez de 2016
*/
package br.edu.ufam.icomp.lab_rover;

public class Coordenada {
	private int posX;
	private int posY;
	private int digito;
	 
	public Coordenada(int posX, int posY, int digito) throws CoordenadaNegativaException, CoordenadaForaDosLimitesException, DigitoInvalidoException {
		this.posX = posX;
		this.posY = posY;
		this.digito = digito;
		
		if(posX < 0 || posY < 0) throw new CoordenadaNegativaException();
		if( !estaEntre(0, 30_000, posX) || !estaEntre(0, 30_000, posY) ) throw new CoordenadaForaDosLimitesException();
		if( (posX + posY) % 10 != digito) throw new DigitoInvalidoException();
	}
	
	public int getPosX(){ return this.posX;	}
	public int getPosY(){ return this.posY; }
	
	public double distancia(Coordenada coordenada){
		return Math.sqrt( Math.pow(this.posX - coordenada.posX,2) + Math.pow(this.posY - coordenada.posY,2) ); 
	}
	
	@Override
	public String toString(){
		return String.format("%d, %d", this.posX, this.posY);
	}
	
	
	private boolean estaEntre(int x, int y, int valor){
		return (valor >= x && valor <= y);
	}
}
