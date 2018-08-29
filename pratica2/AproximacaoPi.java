/**
* Aproximação de
* @autor Micael Levi L. Cavalcante - 21554923
* @date  16/10/2016
*/
import java.util.*;
public class AproximacaoPi {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		if(n < 1) return;

		double pi = 3;

		System.out.printf("%.6f\n",pi);

		if(n > 1){
			byte sinal = 1;
			for(double j=2, i=1; i < n; ++i, j+=2, sinal *= -1){
				pi = pi + termo(j, sinal);
				System.out.printf("%.6f\n",pi);
//				System.out.printf("%c 4 / ( %.0f x %.0f x %.0f )\n", sinal > 0 ? '+':'-', j, j+1, j+2);
			}
		}


	}

	static double termo(double x, byte sinal){
		return sinal * ( 4/(x * (x+1) * (x+2)) );
	}

}
