/**
* Fração Contínua: Raiz Quadrada de Dois
* @autor Micael Levi L. Cavalcante - 21554923
* @date  18/10/2016
*/

import java.util.Scanner;

public class RaizDois {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt(); if(n < 1) return;
		serie(1, n);		
	}
	

	static double serie(double seed, int n){
		if(n < 1) return 1.0;		
		double x = 1/(double)( 2 + serie(seed, n-1) ); // divis�o.
		System.out.printf("%.14f\n",1+x); // soma com o primeiro termo (1).
		return x;
	}

}
