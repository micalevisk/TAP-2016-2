/**
* Temperatura Fahrenheit
* @autor Micael Levi L. Cavalcante - 21554923
* @date  14 de out de 2016
*/
import java.util.Scanner;
public class Fahrenheit {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		float C = s.nextFloat();
		float F = (float) ( (9 * C)/5.0 + 32);
		System.out.printf("%.1f", F);
	}

}
