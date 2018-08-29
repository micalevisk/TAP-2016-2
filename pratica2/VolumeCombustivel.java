/**
* Volume de Combustível
* @autor Micael Levi L. Cavalcante - 21554923
* @date  19/10/2016
*/

import java.util.Scanner;
public class VolumeCombustivel {


	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);


		/*
		// JAVA 8:
		double[] dados = {in.nextDouble(), in.nextDouble(), in.nextDouble()};
//		if( Arrays.asList(dados).stream().filter(v -> (v < 0.0)).count() >= 1)
		if( DoubleStream.of(dados).anyMatch(v -> v < 0) ){
			System.out.printf(formatoSaida,-1.0);
			return;
		}
		*/

		double H = in.nextDouble(); // altura do tanque
		double h = in.nextDouble(); // nivel de combustivel no tanque
		double r = in.nextDouble(); // raio dos bojos semi-esfericos
		double volumeCombustivel = -1;

		if(!(H + ":" + h + ":" + r).contains("-")){
			Esfera esfera = new Esfera(r, h);

			if(h < r) volumeCombustivel = esfera.volumeCalota;
			else if(h < H - r) volumeCombustivel = esfera.volume/2.0 + volumeCilindro(r, h-r);
			else if(h <= H)	volumeCombustivel = esfera.volume + volumeCilindro(r, H-2*r) - esfera.volumeCalota(r, H-h);
			else volumeCombustivel = -1;
		}

		System.out.printf("%.3f", volumeCombustivel);

	}

	static double volumeCilindro(double raio, double altura){
		return Math.PI * Math.pow(raio, 2) * altura;
	}


}


class Esfera{
	private static double raio, altura;
	private static final double pi = Math.PI;
	static double volume=0, volumeCalota=0;

	public Esfera(double r, double h){
		raio = r;
		altura = h;
		volume = volumeEsfera();
		volumeCalota = volumeCalota(this.raio, this.altura);
	}

	double volumeEsfera(){
		return (4/3.0) * pi * Math.pow(raio, 3);
	}

	double volumeCalota(double raio, double altura){
		return (pi/3.0) * Math.pow(altura, 2) * (3*raio - altura);
	}


}
