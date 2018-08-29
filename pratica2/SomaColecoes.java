/**
* Soma de V√°rias Cole√ß√µes
* @autor Micael Levi L. Cavalcante - 21554923
* @date  14/10/2016
*/
import java.util.*;

public class SomaColecoes {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int valor, soma=0;
		/*
		 * zerar soma
		 * empilhar enquanto valor for diferente de -1
		 * desempilhar somando
		 * imprimir soma acumulada
		 * ler e verificar se o proximo valor È igual a -1, 
		 * 	se for: sair do loop
		 * 	sen„o:  empilhar valor lido
		 */
		
			// USANDO UMA PILHA:
			Stack<Integer> pilha = new Stack<Integer>();
			do{
				soma=0;
				while((valor = scan.nextInt())!= -1) pilha.push(valor);
				while(!pilha.empty()) soma += pilha.pop();
				System.out.println(soma);
				
				if((valor = scan.nextInt())!= -1) pilha.push(valor);
				else break;
			}while(true);
		
			// SEM ESTRUTURA AVAN«ADA:
			/*
			boolean fim=false, FIM=false;
			do{
			
				while((valor = scan.nextInt())!= -1) soma += valor;
				fim=true;
				
				if((valor = scan.nextInt()) != -1) fim=false;
				else FIM=true;
				
				System.out.println(soma);
				soma=valor;
				
				if(FIM) break;
				if(fim) soma=0;	
				
			}while(true);
			*/
		
	}	

}
