/**
* Faltas ao Trabalho
* @autor Micael Levi L. Cavalcante - 21554923
* @date  16/10/2016
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
public class FaltasTrabalho {

	private static Scanner in;

	public static void main(String[] args) {
		in = new Scanner(System.in);

		List<Double> array = new ArrayList<Double>();
		int qtdFaltas=0;
		for(double valor; (valor = in.nextDouble()) != -1; ++qtdFaltas) array.add(valor);

		for(double i=2.0; i < 8; ++i)
			System.out.printf("%.1f%s", (Collections.frequency(array, i)*100.0 / qtdFaltas), (i != 7) ? " " : "\n");
	}

}
