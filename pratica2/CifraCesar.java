/**
* Cifra de CÃ©sar
* @autor Micael Levi L. Cavalcante - 21554923
* @date  15/10/2016
*/

import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;
public class CifraCesar {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int shift = in.nextInt();
		StringBuilder msg = new StringBuilder(in.nextLine().toUpperCase().trim());
		AtomicInteger i = new AtomicInteger();
//		.filter(c -> Character.isLetter(c)) @TODO: java stream get index char on string foreach filter 
		msg.chars().mapToObj(c -> (char)c).forEach(c -> {
			int idx = i.getAndIncrement();
			if(Character.isLetter(c)){
				char x = (char)(c - 'A');
				x = (char)( (x + shift)%26 ); x+='A';
				msg.setCharAt(idx, x);
			}
		});
		
		System.out.println(msg);
		
		/*
		// JAVA 7	
		int shift = in.nextInt();
		String texto = in.nextLine().trim(); // remove espaços brancos do início e do final.
		
		if(shift > 0) texto = criptografar(texto, shift);
		System.out.println(texto);
		*/
	}

	/*
	// JAVA 7
	public static String criptografar(String msg, int shift){
		StringBuilder buff = new StringBuilder(msg);
		int limite = msg.length();

		for(int i=0; i < limite; ++i){
			char c = Character.toUpperCase( msg.charAt(i) );
			if(!Character.isLetter(c)) continue;
			
			char x = (char)(c - 'A');
			x = (char)( (x + shift)%26 ); x+='A';

			buff.setCharAt(i, x);
		}

		return buff.toString();
	}
	 */
}
