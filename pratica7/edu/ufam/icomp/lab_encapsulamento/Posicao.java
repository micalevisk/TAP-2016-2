/**
*
* @author Micael Levi &#8212; 21554923 &lt;mllc&#64;icomp.ufam.edu.br&gt;
* @since 25 de nov de 2016
*/

package br.edu.ufam.icomp.lab_encapsulamento;

public class Posicao {
	private double latitude;
	private double longitude;
	private double altitude;
	 
	
	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	public double getAltitude() {
		return altitude;
	}

	public void setAltitude(double altitude) {
		this.altitude = altitude;
	}


	@Override
	public String toString(){
		return "Posição: "+ latitude + ", " + longitude + ", " + altitude;
	}


	public Posicao(double latitude, double longitude, double altitude){
		// TODO Auto-generated constructor method.
		this.latitude = latitude;
		this.longitude = longitude;
		this.altitude = altitude;
	}
}
