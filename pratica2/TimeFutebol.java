/**
* Time de Futebol
* @autor Micael Levi L. Cavalcante - 21554923
* @date  16/10/2016
*/
import java.util.ArrayList;
import java.util.*;

public class TimeFutebol {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		List<Integer> time = preencherVetor(in, Integer.class);
		List<Integer> adv = preencherVetor(in, Integer.class);

//		time.stream().forEach(System.out::println);
//		adv.stream().forEach(System.out::println);
		int vitorias, empates, derrotas;
		vitorias = empates = derrotas = 0;

		if(time.size() != adv.size()) return;

		Iterator<Integer> i = time.iterator(), j = adv.iterator();
		while(i.hasNext()){
//			System.out.println(time.get(i) + " x " + adv.get(i));
			int gols = i.next();
			int golsAdv = j.next();

			if(gols > golsAdv) vitorias++;
			else if(gols < golsAdv) derrotas++;
			else empates++;
		}

		System.out.println(vitorias + " " +  empates + " " + derrotas);
	}

	static <T> List<T> preencherVetor(Scanner in, Class<T> tipo){
		List<T> array = new ArrayList<>();
		int valor;
		if(tipo != Integer.class) return null;
		while((valor = in.nextInt()) != -1) array.add(tipo.cast(valor));
		return array;
	}

}
