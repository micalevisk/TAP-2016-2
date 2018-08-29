/**
*
* @author Micael Levi &#8212; 21554923 &lt;mllc@icomp.ufam.edu.br&gt;
* @since 5 de nov de 2016
*/

package br.edu.icomp.ufam.lab_heranca;

public class FormasMain {

	public static void main(String[] args){
		FormaGeometrica formas[] = new FormaGeometrica[3];
		formas[0] = new Circulo(1,2,3);
		formas[1] = new Retangulo(1,2,3,4);
		formas[2] = new Quadrado(1,2,3);

		for(FormaGeometrica forma : formas)
			System.out.println(forma);

	}

}