/**
* Dia da Semana
* @autor Micael Levi L. Cavalcante - 21554923
* @date  18 de out de 2016
*/

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
//import java.util.List;
//import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

public class DiaSemana {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int hrsLida;
		Integer[] semana = {0,0,0,0,0,0,0};

		for(byte i=0; (hrsLida = in.nextInt())!=-1; i=(byte)((i+1)%7)) semana[i] += hrsLida;
		Integer maior = Collections.max(Arrays.asList(semana));

		// JAVA 8:
		int[] indices = IntStream.range(0, semana.length).filter(idx -> semana[idx] == maior).toArray();
		Arrays.stream(indices).forEach(i -> System.out.println(i+1) );
		
		/*
		// JAVA 8:
		AtomicInteger i = new AtomicInteger(1);
		Arrays.stream(semana)
			.forEach(hrs -> {
				int dia = i.getAndIncrement();
				if(hrs == maior) System.out.println(dia);
			});
		*/
		
		/*
		// JAVA 7
		AtomicInteger i = new AtomicInteger(1);
		for (Integer hrs : semana) {
			int dia = i.getAndIncrement(); 
			if(hrs == maior) System.out.println(dia);
		}
		*/
		
	}

}
