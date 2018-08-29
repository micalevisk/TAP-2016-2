/**
* Desconto
* @autor Micael Levi L. Cavalcante - 21554923
* @date  14/10/2016
*/
import java.util.Scanner;
public class Desconto {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		final float desconto = 5/100.0f;
		double valor = scan.nextDouble();
		
		if(valor >= 200.0) valor = valor - (valor*desconto);
		System.out.printf("%.2f\n",valor);
		
	}

}
