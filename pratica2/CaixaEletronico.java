/**
* Caixa Eletrônico
* @autor Micael Levi L. Cavalcante - 21554923
* @date  14 de out de 2016
*/
import java.util.*;
import java.util.Scanner;

public class CaixaEletronico {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int dinheiro = s.nextInt();
		
		if((dinheiro % 2) != 0 || (dinheiro < 0)) System.out.println("Valor Invalido");
		else{
			
			int qtd50 = (dinheiro/50); dinheiro -= qtd50*50;
			int qtd10 = (dinheiro/10); dinheiro -= qtd10*10;
			int qtd2 = (dinheiro/2); dinheiro -= qtd2*2;
			
			System.out.printf("%d notas de R$50, %d notas de R$10 e %d notas de R$2\n", qtd50, qtd10, qtd2);
		}	

	}

}
