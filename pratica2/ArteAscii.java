/**
* Arte ASCII
* @autor Micael Levi L. Cavalcante - 21554923
* @date  14 de out de 2016
*/
import java.util.Scanner;
public class ArteAscii {

	public static void main(String[] args){
	
		Scanner s = new Scanner(System.in);
		int q = s.nextInt();

		for(int i=0, k=q; i < q; ++i, --k){
			for(int j=0; j < k; ++j)
				System.out.print("*");
			System.out.println();
		}
	
		for(int i=0, k=1; i < q; ++i, ++k){
			for(int j=0; j < k; ++j)
				System.out.print("*");
			System.out.println();
		}	

	}
	
}
