/**
* Animais nas Cédulas do Real
* @autor Micael Levi L. Cavalcante - 21554923
* @date  14/10/2016
*/
import java.util.*;
public class AnimaisCedulas {

	public static void main(String[] args) {
		
		Hashtable<Integer, String> tabela = new Hashtable<Integer, String>();
		tabela.put(2,"Tartaruga");
		tabela.put(5,"Gar�a");
		tabela.put(10,"Arara");
		tabela.put(20,"Mico-le�o-dourado");
		tabela.put(50,"On�a-pintada");
		tabela.put(100,"Garoupa");
		
		Scanner scan = new Scanner(System.in);
		Integer valor = scan.nextInt();
		String animal;
		if( (animal=tabela.get(valor)) == null ) System.out.println("erro");
		else System.out.println(animal);
	}

}
