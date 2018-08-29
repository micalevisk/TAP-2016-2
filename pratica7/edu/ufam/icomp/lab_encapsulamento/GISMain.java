/**
*
* @author Micael Levi &#8212; 21554923 &lt;mllc&#64;icomp.ufam.edu.br&gt;
* @since 25 de nov de 2016
*/
package br.edu.ufam.icomp.lab_encapsulamento;

public class GISMain {

	public static void main(String[] args) {

		Localizavel[] localizaveis = new Localizavel[2];
		
		localizaveis[0] = new Celular(55, 92, 984455223);
		localizaveis[1] = new CarroLuxuoso("2X43-A");
		
		for (Localizavel localizavel : localizaveis) {
			System.out.println(localizavel.getPosicao());
		}
		
	}

}
