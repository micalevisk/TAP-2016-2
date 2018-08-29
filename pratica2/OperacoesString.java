/**
* OperaÃ§Ãµes BÃ¡sicas em uma String
* @autor Micael Levi L. Cavalcante - 21554923
* @date  15/10/2016
*/

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.*;


public class OperacoesString {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String texto = in.nextLine();
		
		if(texto.length() == 0) return;
		
		System.out.println(texto.length());// 1. quantidade de caracteres
		System.out.println(texto.charAt(0));// 2. primeiro caractere
		System.out.println(texto.charAt(texto.length()-1)); // 3. ultimo caractere
		System.out.println(texto.toUpperCase());// 4. conversão para maiúscula
		System.out.println(texto.toLowerCase());// 5. conversão para minúscula
		System.out.println(texto.replace('a', 'e'));// 6. substituição de letras 'a' por 'e'

		/*// 7. impressao dos caracteres com índices pares
		AtomicInteger index = new AtomicInteger();
		texto.chars()
			.mapToObj(c -> (char)c)
				.forEach(c -> {
					if(index.getAndIncrement() %2 == 0) 
						System.out.print(c);
				});
		*/
		// 7. impressao dos caracteres com índices pares
		for(int i=0; i < texto.length(); i+=2) System.out.print(texto.charAt(i));
		
		/*
		// 8. quantidade de vogais
		long qtdVogais = texto.chars()
				.mapToObj(c -> (char)c)
					.filter(c -> isVowel(c))
						.count();
		System.out.println("\n" + qtdVogais);
		*/
		
		// 8. quantidade de vogais
		Pattern padrao = Pattern.compile("(?i)(a|e|i|o|u)");
		Matcher m = padrao.matcher(texto);
		int qtdVogais;
		for(qtdVogais=0; m.find(); ++qtdVogais);
		System.out.println(qtdVogais);		
		
	}
	
	static boolean isVowel(char c){
		return Character.toString(c).matches("(?i)(a|e|i|o|u)");
	}

}
