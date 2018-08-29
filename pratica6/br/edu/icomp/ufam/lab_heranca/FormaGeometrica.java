/**
*
* @author Micael Levi &#8212; 21554923 &lt;mllc@icomp.ufam.edu.br&gt;
* @since 5 de nov de 2016
*/

package br.edu.icomp.ufam.lab_heranca;

public abstract class FormaGeometrica {

	int posX;
	int posY;

	FormaGeometrica(int posX, int posY){
		this.posX = posX;
		this.posY = posY;
	}
	
	public String getPosString(){
		return String.format("posição (%d, %d)\n");
	}

	public abstract double getArea();
	public abstract double getPerimetro();

}