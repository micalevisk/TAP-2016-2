/**
*
* @author Micael Levi &#8212; 21554923 &lt;mllc@icomp.ufam.edu.br&gt;
* @since 5 de nov de 2016
*/

package br.edu.icomp.ufam.lab_heranca;

public class Retangulo extends FormaGeometrica {

	double largura;
	double altura;

	public Retangulo(int posX, int posY, double largura, double altura){
		super(posX, posY);
		this.largura = largura;
		this.altura  = altura;
	}

	public double getArea(){
		return largura * altura;
	}

	public double getPerimetro(){
		return 2 * (largura + altura);
	}

	public String toString(){
		return String.format("Retângulo na posição (%d, %d) com largura de %.1fcm e altura de %.1fcm (área=%.1fcm2, perímetro=%.1fcm)\n", posX, posY, largura, altura, getArea(), getPerimetro());
	}

}