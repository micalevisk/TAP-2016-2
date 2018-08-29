/**
* Valor do Expoente
* @autor Micael Levi L. Cavalcante - 21554923
* @date  16/10/2016
*/

import java.util.Scanner;
public class ValorExpoente {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int valor = in.nextInt(), k=1;
		for(double curr=Math.pow(2, k); curr <= valor;) curr+=Math.pow(2, ++k);
		System.out.println(k);
	}

}
