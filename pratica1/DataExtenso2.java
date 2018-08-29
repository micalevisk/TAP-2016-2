/**
*
* @autor Micael Levi L. Cavalcante - 21554923
* @date  14 de out de 2016
*/

import java.util.*;

public class DataExtenso {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int data = s.nextInt();
		int Ano = data %10000; data/=10000;
		int Mes = data %100; data/=100;
		int Dia = data;
		String mes="";
		switch(Mes){
			case 1: mes="janeiro"; break;
			case 2: mes="fevereiro"; break;
			case 3: mes="março"; break;
			case 4: mes="abril"; break;
			case 5: mes="maio"; break;
			case 6: mes="junho"; break;
			case 7: mes="julho"; break;
			case 8: mes="agosto"; break;
			case 9: mes="setembro"; break;
			case 10: mes="outubro"; break;
			case 11: mes="novembro"; break;
			case 12: mes="dezembro"; break;
		}

		System.out.println(Dia + " de " + mes + " de " + Ano);
	}

}
