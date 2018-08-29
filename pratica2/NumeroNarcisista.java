/**
* Números Narcisistas
* @autor Micael Levi L. Cavalcante - 21554923
* @date  14 de out de 2016
*/
import java.util.ArrayList;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class NumeroNarcisista {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String entrada = scan.nextLine();
		int soma=0;

		try{

			Matcher m = Pattern.compile("\\d").matcher(entrada);
			while(m.find()) soma += Math.pow(Integer.parseInt(m.group()), 3);
			System.out.printf("%s\n",(soma == Integer.parseInt(entrada) ? "SIM" : "NAO"));

		}
		catch(NumberFormatException nfe){
			System.out.println(nfe);	
		} 

	}

}

// http://stackoverflow.com/questions/6020384/create-array-of-regex-matches
// http://stackoverflow.com/questions/17969436/java-regex-capturing-groups
