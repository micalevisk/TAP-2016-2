/**
* Folha de Pagamento
* @autor Micael Levi L. Cavalcante - 21554923
* @date  14 de out de 2016
*/

import java.util.Scanner;

public class FolhaPagamento {

	public static void main(String[] args) {
		final float impostos = 0.11f;
		float INSS = 0.08f;
		
		Scanner s = new Scanner(System.in);
		
		double valHora = s.nextDouble();
		int qtdHoras = s.nextInt();
		
		double bruto = valHora*qtdHoras;
		double IR = bruto*impostos;
		double inss = bruto*INSS;
		double descontos = IR+inss;
		System.out.printf("Salario bruto: R$%.2f\n", bruto);
		System.out.printf("IR: R$%.2f\n", IR);
		System.out.printf("INSS: R$%.2f\n", inss);
		System.out.printf("Total de descontos: R$%.2f\n", descontos);
		System.out.printf("Salario liquido: R$%.2f\n", (bruto - descontos));
	}

}
