/**
* Média de uma Coleção
* @autor Micael Levi L. Cavalcante - 21554923
* @date  14 de out de 2016
*/

import java.util.*;
public class MediaColecao {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int valorCorrente, soma=0, qtd=0;
		for(;(valorCorrente = s.nextInt())!=-1; ++qtd)
			soma += valorCorrente;			
		
		if(qtd > 0) System.out.printf("%.2f\n",soma/(float)qtd);
	}

}
