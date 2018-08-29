/**
*
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

		if(op == 1){
			// calcular volume da calota esférica:
			resultado = (double) ( (Math.PI/3) * Math.pow(x, 2) * (3 * r - x));
		}
		else{
			// calcular o complemento do volume da calota esférica em relação ao volume total da esfera:
			double vTotal = (double) ( (4.0/3.0) * Math.PI * Math.pow(r, 3) );
			double vCalota = (double) ( (Math.PI/3) * Math.pow(x, 2) * (3 * r - x));
			resultado = vTotal - vCalota;
//			System.out.println(vTotal + " " + vCalota);
		}
		System.out.printf("%.4f",resultado);

	}

}
