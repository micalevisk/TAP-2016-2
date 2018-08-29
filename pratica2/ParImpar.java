/**
* Par/Ímpar
* @autor Micael Levi L. Cavalcante - 21554923
* @date  14 de out de 2016
*/
import java.util.Scanner;
public class ParImpar {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int lido;
		while((lido = s.nextInt()) != -1){
			String saida = "IMPAR";
			if((lido % 2) == 0) saida="PAR";
			System.out.println(saida);
		}
			
	}

}
