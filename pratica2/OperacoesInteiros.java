/**
* Operações em Números Inteiros
* @autor Micael Levi L. Cavalcante - 21554923
* @date  16/10/2016
*/
import java.util.*;
import java.util.regex.*;
public class OperacoesInteiros {

	static int valor, soma, qtd, qtdPares, maior, menor;
	static double media;

	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String linha = in.nextLine();

		Pattern padrao = Pattern.compile("-1\\p{Space}-1|-?\\d+"); // "-?\\d+" ;; "(?<!-)\\d+" ;; "(-1 -1)|(?<!-)(\\d+)" ;;
		Matcher m = padrao.matcher(linha);

		zerar();
		while(m.find()){
			String str_valor = m.group();
			
			int valor = (str_valor.equals("-1 -1")) ? -1 : Integer.parseInt(str_valor);
			if(valor == -1){
				media = soma / (double)qtd;
				mostrarResultados();
				zerar();				
				continue;
			}
//			System.out.println(">> "+valor);
			soma += valor;
			++qtd;
			if(valor%2 == 0) ++qtdPares;
			maior = (valor > maior ? valor : maior);
			menor = (valor < menor ? valor : menor);
		}
	
		
		
		/*
		Pattern padrao = Pattern.compile("\\s?([^-]*)-1");
		Matcher m = padrao.matcher(linha);
		while(m.find()){
			String numeros = m.group(1);
			System.out.println(numeros);
			numeros.chars()
								.mapToObj(i -> (int)(i-'0'))
								.forEach(System.out::println);
//									.forEach(colecao::add);
	
			System.out.println("-------");
		}
		System.out.println("**************");
		
		colecao.removeAll(Collections.singleton(-16));
		colecao.stream().forEach(System.out::println);
		*/
		
		

	}
	

	static void mostrarResultados(){
		System.out.println(qtd);//quantidade de elementos
		System.out.println(qtdPares);//quantidade de valores pares
		System.out.println(qtd - qtdPares);//quantidade de valores �mpares
		System.out.println(soma);// soma total
		System.out.printf("%.2f\n",media);
		System.out.println(maior);
		System.out.println(menor);
	}
	
	static void zerar(){
		soma = qtd = qtdPares = 0;
		maior = Integer.MIN_VALUE;
		menor = Integer.MAX_VALUE;
		media = 0f;
	}

}

//https://docs.oracle.com/javase/7/docs/api/java/util/regex/Pattern.html
