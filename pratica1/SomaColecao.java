/**
*
* @autor Micael Levi L. Cavalcante - 21554923
* @date  14 de out de 2016
*/
import java.util.*;
public class SomaColecao {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int valorCorrente, soma=0;
		while((valorCorrente = s.nextInt())!=-1){
			soma += valorCorrente;
		}
		System.out.println(soma);
	}

}
