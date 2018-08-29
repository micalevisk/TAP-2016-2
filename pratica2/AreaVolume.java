/**
* Área do Círculo, Volume da Esfera
* @autor Micael Levi L. Cavalcante - 21554923
* @date  14/10/2016
*/
import java.util.*;
public class AreaVolume {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double r = scan.nextDouble();
		double area = Math.PI * Math.pow(r, 2);
		double volume = (4/3.0) * Math.PI * Math.pow(r, 3);
		
		System.out.printf("Um circulo com raio de %.2f centimetros tem uma area de %.2f centimetros quadrados.\n",r, area);
		System.out.printf("Uma esfera com raio de %.2f centimetros tem um volume de %.2f centimetros cubicos.\n",r, volume);
	}

}
