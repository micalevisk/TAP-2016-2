/**
* Angry Birds
* @autor Micael Levi L. Cavalcante - 21554923
* @date  16/10/2016
*/

import java.util.Scanner;
public class AngryBirds {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		double v0 = in.nextDouble();
		double a = Math.toRadians( in.nextDouble() );
		double D = round( in.nextDouble() , 1 );
		double R = round( alcanceMaximo(v0, a) , 1 );
		System.out.printf("%d\n", (R == D) ? 1 : 0);
	}

	static double alcanceMaximo(double vInicial, double angulo){
		return (Math.pow(vInicial, 2) * Math.sin(2*angulo))/9.8;
	}

	static double round(double value, int places) {
    if(places < 0) throw new IllegalArgumentException();

    long factor = (long) Math.pow(10, places);
    value = value * factor;
    long tmp = Math.round(value);
    return (double) tmp / factor;
	}

}
