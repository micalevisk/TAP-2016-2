/**
* Aprovação em Disciplina
* @autor Micael Levi L. Cavalcante - 21554923
* @date  16/10/2016
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AprovacaoDisciplina {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		List<Double> notas = preencherVetor(in, Double.class);
		List<Integer> frequencia = preencherVetor(in, Integer.class);
		int minPresenca = (int)(in.nextInt() * 0.75);

//		//notas.stream().forEach(System.out::println);
//		//frequencia.forEach(i -> System.out.println("elemento: " + i) );

//		long qtdReprovadosFalta =	frequencia.stream().filter(f -> f > minPresenca).count();
//		long qtdReprovadosNota = notas.stream().mapToDouble(f2 -> (double)f2).filter(f2 -> f2 < 5.0).count();
//		long qtdAprovados = ( notas.stream().filter(nota -> nota >= 5.0).count() ) - (qtdReprovadosFalta + qtdReprovadosNota);
		int qtdReprovadosFalta=0, qtdReprovadosNota=0, qtdAprovados=0;

		while(!notas.isEmpty()){
			double notaAlunoi = notas.remove(0);
			int faltasAlunoi  = frequencia.remove(0);

			if(faltasAlunoi < minPresenca) qtdReprovadosFalta++;
			else if(notaAlunoi < 5.0) qtdReprovadosNota++;
			else qtdAprovados++;
		}

		System.out.println(qtdAprovados + " " + qtdReprovadosNota + " " + qtdReprovadosFalta);
	}

	static <T> List<T> preencherVetor(Scanner in, Class<T> tipo){
		List<T> array = new ArrayList<>();

		if(tipo == Integer.class){
			int valor;
			while((valor = in.nextInt()) != -1) array.add(tipo.cast(valor));
		}
		else if(tipo == Double.class){
			double valor;
			while((valor = in.nextDouble()) != -1) array.add(tipo.cast(valor));
		}
		else return null;


		return array;
	}

}


//10,0 10,0 9,0 -1 44 45 46 -1 60
