/**
* Horas de Trabalho
* @autor Micael Levi L. Cavalcante - 21554923
* @date  16/10/2016
*/
import java.util.Scanner;

public class HorasTrabalho {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int hrs=0,hr;
		for(int i=1; (hr = in.nextInt()) != -1; ++i){
			hrs += hr;
			if(i >= 7){
				System.out.println(hrs);
				i =	hrs=0;
			}
		}

	}

}

//http://www.java67.com/2014/10/how-to-create-and-initialize-two-dimensional-array-java-example.html
//http://introcs.cs.princeton.edu/java/95linear/Matrix.java.html