/**
* Pintura do Muro
* @autor Micael Levi L. Cavalcante - 21554923
* @date  14 de out de 2016
*/

import java.util.Scanner;
public class PinturaMuro {

	public static void main(String[] args) {
		final byte area = 12*3;
		float material = 100f;
		
		Scanner s = new Scanner(System.in);
		float valorCobrado = s.nextFloat();
		System.out.printf("%.1f\n",valorCobrado*area+material);
	}

}
