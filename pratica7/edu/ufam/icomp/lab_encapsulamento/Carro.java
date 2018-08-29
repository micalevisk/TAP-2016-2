/**
*
* @author Micael Levi &#8212; 21554923 &lt;mllc&#64;icomp.ufam.edu.br&gt;
* @since 25 de nov de 2016
*/
package br.edu.ufam.icomp.lab_encapsulamento;

public class Carro {
	protected String placa;
	 
	public String getPlaca(){
		return this.placa;
	}
	public void setPlaca(String placa){
		this.placa = placa;
	}

	public Carro(String placa){
		setPlaca(placa);
	}
}
