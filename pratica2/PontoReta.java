/**
* Ponto e Reta
* @autor Micael Levi L. Cavalcante - 21554923
* @date  14/10/2016
*/
import java.util.*;
public class PontoReta {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		float x,y;
		x = scan.nextFloat();
		y = scan.nextFloat();
		
		String resultado = ((2*x+y)==3 ? "pertence":"nao pertence");
		System.out.printf("Ponto (%.1f, %.1f) %s a reta 2x + y = 3.\n",x,y,resultado);
	}

}
