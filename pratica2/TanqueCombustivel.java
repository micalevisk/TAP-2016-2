/**
* Tanque de Combustível
* @autor Micael Levi L. Cavalcante - 21554923
* @date  14 de out de 2016
*/
import java.util.*;
public class TanqueCombustivel {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		float r = s.nextFloat(); // raio do tanque
		float x = s.nextFloat(); // altura do ar
		byte op = s.nextByte(); // opção para o cálculo
		double resultado=0f;
		
		double vCalota = (double) ( (Math.PI/3) * Math.pow(x, 2) * (3 * r - x));
		double vTotal = (double) ( (4/3.0) * Math.PI * Math.pow(r, 3) ); 
		
		double volume = (op == 1) ? calota : vTotal - vCalota ;
		System.out.printf("%.4f", volume);
	}

}
