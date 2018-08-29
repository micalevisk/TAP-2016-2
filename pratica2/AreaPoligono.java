/**
* Área do Polígono
* @autor Micael Levi L. Cavalcante - 21554923
* @date  17 de out de 2016
*/
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class AreaPoligono {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		List<Double> xs	= preencherVetor(in, Double.class);
		List<Double> ys	= preencherVetor(in, Double.class);
//		xs.add(xs.size()-1, xs.get(xs.size()-1));
//		ys.add(ys.size()-1, ys.get(ys.size()-1));
//		System.out.println( Arrays.toString(xs.toArray()) );
		
		System.out.printf("%.4f\n", areaPoligono(xs.size(), xs, ys) );
	}
	
	static double areaPoligono(int n, List<Double> abscissas, List<Double> ordenadas){
		double area=0;
		for(int i=0; i <= n-2; ++i){
			double xi = abscissas.get(i);
			double xi2 = abscissas.get(i+1);
			double yi = ordenadas.get(i);
			double yi2 = ordenadas.get(i+1);
			area += (xi2 + xi)*(yi2 - yi);
		}
		return (1/2.0)*Math.abs(area);	
	}
	
	static <T> List<T> preencherVetor(Scanner in, Class<T> tipo){
		List<T> array = new ArrayList<>();
		
		if(tipo == Double.class){
			double valor;
			while((valor = in.nextDouble()) != -1) array.add(tipo.cast(valor));
		}
		else return null;
		
		
		return array;
	}

}
