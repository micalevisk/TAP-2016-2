/**
*
* @author Micael Levi &#8212; 21554923 &lt;mllc@icomp.ufam.edu.br&gt;
* @since 5 de nov de 2016
*/

package br.edu.icomp.ufam.lab_heranca;

public class Circulo extends FormaGeometrica {

	double raio;

	public Circulo(int posX, int posY, double raio){
		super(posX, posY);
		this.raio = raio;
	}

	public double getArea(){ // implementação da super classe
		return Math.PI * Math.pow(this.raio, 2);
	}

	public double getPerimetro(){ // implementação da super classe
		return  2 * Math.PI * this.raio;
	}

	// @Override
	public String toString(){ // sobreposição da super classe
		String s = String.format("Círculo na posição (%d, %d) com raio de %.1fcm (área=", super.posX, super.posY, this.raio);
		s+= getArea() + "cm2, perímetro="+ getPerimetro() +"cm)\n";
		return s;
	}

}