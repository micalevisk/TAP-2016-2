/**
* Palíndromos
* @autor Micael Levi L. Cavalcante - 21554923
* @date  16/10/2016
*/

import java.util.Scanner;
public class Palindromos {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String texto = in.nextLine().toUpperCase().replace(" ", "");

		String buff = new String(texto), aux;
		while( (aux = texto.replaceAll("^(.)(.*)\\1$", "$2")).compareTo(texto) != 0 ) texto = aux;
		System.out.printf("%s %d\n", buff, texto.length() >= 2 ? 0 : 1);
//		
//		do{
//			Pattern expr = Pattern.compile("^(.)(.*)\\1$");
//			Matcher casa = expr.matcher(texto);
//			if(!casa.find()) break;
//			texto = casa.group(2);
//		}while(true);
//		
////		byte ehPalindromo = (byte)(texto.length() >= 2 ? 0 : 1);
//		byte ehPalindromo = (byte)(texto.matches(".{2,}") ? 0 : 1);
//		System.out.println(ehPalindromo);
		
	}


}
//https://www.tutorialspoint.com/java/java_regular_expressions.htm
