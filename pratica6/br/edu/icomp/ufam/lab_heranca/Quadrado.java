/**
*
* @author Micael Levi &#8212; 21554923 &lt;mllc@icomp.ufam.edu.br&gt;
* @since 5 de nov de 2016
*/

package br.edu.icomp.ufam.lab_heranca;

public class Quadrado extends Retangulo {

	public Quadrado(int posX, int posY, double lado){
		super(posX, posY, lado, lado);
	}

	public String toString(){
		return String.format("Quadrado na posição (%d, %d) com lado de %.1fcm (área=%.1fcm2, perímetro=%.1fcm)\n", posX, posY, super.largura, super.getArea(), getPerimetro());
	}

}