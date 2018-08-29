/**
* ASCII Art
* @autor Micael Levi L. Cavalcante - 21554923
* @date  14 de out de 2016
*/

import java.util.Scanner;
public class AsciiArt {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);

		int qtd = s.nextInt();
		if(qtd <= 0) return;
	     
		String linha = new String();
		for(int i=0; i < qtd; ++i) linha += "*";

		
		for(int i=0; i < qtd; ++i){
			String esq = removeFrom(linha, i, (byte) 0);
			String dir = removeFrom(linha, i, (byte) 1);
			System.out.print(esq); System.out.print(dir);
			System.out.println();
		}

		
	}

    private static String replaceCharAt(String s, int i, char c) {
        StringBuffer buf = new StringBuffer(s);
        buf.setCharAt(i, c);
        return buf.toString();
    }
    
  
    private static String removeFrom(String s, int n, byte shift){ // shift = 1 (remove a partir do inicio)
    	if(n > s.length() || n <= 0) return s;
    	
    	String buf = new String(s);
    	
    	int C=0;
    	if(shift != 1){ C=buf.length()-1; shift = -1; }
    	
    	for(int i=0; i < n; ++i, C+=shift) buf = replaceCharAt(buf, C, ' ');
    	
    	return buf;
    }
}
