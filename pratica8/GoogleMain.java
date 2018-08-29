import java.util.LinkedList;

/**
*
* @author Micael Levi &#8212; 21554923 &lt;mllc&#64;icomp.ufam.edu.br&gt;
* @since 28 de nov de 2016
*/

public class GoogleMain {

	public static void main(String[] args) {

		ListaInvertida listaGoogle = new ListaInvertida();
		
		listaGoogle.insere("force", "document1.txt");
		listaGoogle.insere("force", "document2.txt");
		listaGoogle.insere("force", "document3.txt");
		listaGoogle.insere("always", "document1.txt");
		listaGoogle.insere("one", "document3.txt");
		listaGoogle.insere("is", "document2.txt");
		listaGoogle.insere("is", "document3.txt");
		listaGoogle.insere("be", "document1.txt");
		listaGoogle.insere("will", "document1.txt");
		listaGoogle.insere("you", "document1.txt");
		listaGoogle.insere("you", "document2.txt");
		listaGoogle.insere("the", "document1.txt");
		listaGoogle.insere("the", "document2.txt");
		listaGoogle.insere("the", "document3.txt");
		listaGoogle.insere("remember", "document1.txt");
		listaGoogle.insere("this", "document3.txt");
		listaGoogle.insere("strong", "document2.txt");
		listaGoogle.insere("strong", "document3.txt");
		listaGoogle.insere("with", "document1.txt");
		listaGoogle.insere("with", "document2.txt");
		listaGoogle.insere("with", "document3.txt");
		
		LinkedList<String> documentos = listaGoogle.busca("force");
		for(String doc : documentos)
			System.out.print(doc + ", ");
		
		System.out.println(listaGoogle.toString());
	
		
	}

}

/*

                    
"force":document1.txt, document2.txt, document3.txt
"always":document1.txt
"one":document3.txt
"is":document2.txt, document3.txt
"be":document1.txt
"will":document1.txt
"you":document1.txt, document2.txt
"the":document1.txt, document2.txt, document3.txt
"remember":document1.txt
"this":document3.txt
"strong":document2.txt, document3.txt
"with":document1.txt, document2.txt, document3.txt
        

*/