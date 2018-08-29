/**
* Área do Triângulo
* @autor Micael Levi L. Cavalcante - 21554923
* @date  14 de out de 2016
*/

import java.util.*; 
public class AreaTriangulo {

	public static void main(String[] args) {
		double a, b, c, s, A;
		Scanner scan = new Scanner(System.in);
		a = scan.nextInt();
		b = scan.nextInt();
		c = scan.nextInt();
		
		if(!(a+b > c)){ System.out.println("Triangulo invalido"); return; }
		
		s = (a+b+c)/2;
		A = Math.sqrt(s * (s - a) * (s - b) * (s - c));
		System.out.printf("%.2f\n",A);
		
	}

}
