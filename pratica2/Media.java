/**
* Média
* @autor Micael Levi L. Cavalcante - 21554923
* @date  14 de out de 2016
*/

import java.util.Scanner;
public class Media {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		double soma=0;
		for(byte i=0; i<3; ++i) soma += s.nextDouble();
		System.out.printf("%.2f\n", soma/3.0);
		
	}

}
