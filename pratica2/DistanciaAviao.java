/**
* Distância Percorrida pelo Avião
* @autor Micael Levi L. Cavalcante - 21554923
* @date  18 de out de 2016
*/

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class DistanciaAviao {

	static int[][] tabela = 
		{
		{0,2,11,6,15,11,1},
		{2,0,7,12,4,2,15},
		{11,7,0,11,8,3,13},
		{6,12,11,0,10,2,1},
		{15,4,8,10,0,5,13},
		{11,2,3,2,5,0,14},
		{1,15,13,1,13,14,0}
		};
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int cidade;
		int tempo=0;
		
		Queue<Integer> cords = new ArrayDeque<>();
		while( (cidade = in.nextInt()) != -1 ){
			cidade = ( Integer.toString(cidade).charAt(0) - '0' );
			cords.add(cidade);
			if(cords.size() == 2){
				int origem = cords.poll();
				int destino = cords.peek();
				tempo += tabela[--origem][--destino];
			}
		}
		System.out.println(tempo);
	}
	
	

}

