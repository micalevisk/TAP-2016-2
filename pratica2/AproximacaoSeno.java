/**
* Aproximação do Seno
* @autor Micael Levi L. Cavalcante - 21554923
* @date  15/10/2016
*/
import java.util.Scanner;

public class AproximacaoSeno {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		double angulo = Math.toRadians( in.nextDouble() );
		double k = in.nextInt();

		if(k > 0) sen(angulo, k);
	}

	static void sen(double x, double termos){
		double seno = x;
		System.out.printf("%.10f\n", seno);
		for(int i=3, sinal=-1, j=1; j < termos; i+=2, sinal *=-1, ++j){
			seno += sinal*(double)( Math.pow(x, i)/fatorial(i) );
			System.out.printf("%.10f\n", seno);
		}
	}

	static double fatorial(double n){
		if(n <= 1.0) return 1.0;
		return n * fatorial(n-1);
	}

}
