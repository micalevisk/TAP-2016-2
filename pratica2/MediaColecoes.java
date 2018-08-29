/**
* Média de Várias Coleções
* @autor Micael Levi L. Cavalcante - 21554923
* @date  15/10/2016
*/
import java.util.*;
public class MediaColecoes {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int valor, soma=0;
		Stack<Integer> pilha = new Stack<Integer>();
		do{
			soma=0;
			while((valor = scan.nextInt())!= -1) pilha.push(valor);
			int qtd=pilha.size();
			while(!pilha.empty()) soma += pilha.pop();
			System.out.printf("%.2f\n",soma/(float)qtd);
			
			if((valor = scan.nextInt())!= -1) pilha.push(valor);
			else break;
		}while(true);
	}

}
