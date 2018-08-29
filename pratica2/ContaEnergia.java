/**
* Conta de Energia
* @autor Micael Levi L. Cavalcante - 21554923
* @date  14/10/2016
*/

import java.util.Scanner;
public class ContaEnergia {

	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);
		
		float consumo = scan.nextFloat(), preco=-1f;
		char tipo = scan.next().charAt(0);
		
		if(consumo >= 0)
			switch(tipo){
				case 'R':
					preco = ((consumo <= 500) ? 0.4f*consumo : 0.65f*consumo);
					break;
				case 'C':
				case 'I':
					preco = ((consumo <= 1_000) || (consumo <= 5_000) ? 0.55f*consumo : 0.6f*consumo);
					break;
			}
		
		System.out.println(preco);
		
	}

}
