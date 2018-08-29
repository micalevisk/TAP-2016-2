/**
*
* @author Micael Levi &#8212; 21554923 &lt;mllc&#64;icomp.ufam.edu.br&gt;
* @since 25 de nov de 2016
*/
package br.edu.ufam.icomp.lab_encapsulamento;

import java.util.Random;

public class CarroLuxuoso extends Carro implements Localizavel {

	@Override
	public Posicao getPosicao() {
		Random r = new Random();
		double latitude = -3.160000 + (-3.160000 + 3.160000) * r.nextDouble();
		double longitude = -60.120000 + (-59.820000 - -60.120000) * r.nextDouble();
		double altitude = 15.0 + (100.0 - 15.0) * r.nextDouble();
		
		return new Posicao(latitude, longitude, altitude);
	}
	@Override
	public double getErroLocalizacao() {
		return 15.0;
	}
	
	public CarroLuxuoso(String placa){
		super(placa);
	}
}
