import java.util.Hashtable;
import java.util.LinkedList;

/**
*
* @author Micael Levi &#8212; 21554923 &lt;mllc&#64;icomp.ufam.edu.br&gt;
* @since 28 de nov de 2016
*/
public class ListaInvertida {
	
	private Hashtable<String, LinkedList<String>> tabela; // K: palavra | V: lista de arquivos

	public ListaInvertida() {
		this.tabela = new Hashtable<>();
	}

	/**
	 * 	Insere um <code>documento</code> na lista encadeada de <code>palavra</code>. 
	 * @param palavra	A palavra que ser� inserida na tabela.
	 * @param documento O documento associado � palavra que ser� inserida.
	 * @return <tt>True</tt> se houve altera��o na tabela, <i>i.e.</i>,	alguma condi��o abaixo foi satisfeita:
	 * <li>A <code>palavra</code> j� est� em {@link #tabela} mas <code>documento</code> n�o est� em sua lista.</li>
	 * <li>A <code>palavra</code> n�o est� em  {@link #tabela}, ent�o insere ambos (<code>palavra</code> e <code>documento</code>).</li>
	 */
	public boolean insere(String palavra, String documento){
		LinkedList<String> listaDeDocumentos = tabela.get(palavra);
		
		if(listaDeDocumentos == null){
			listaDeDocumentos = new LinkedList<>();
			listaDeDocumentos.add(documento);
			this.tabela.put(palavra, listaDeDocumentos);
			
			return true;
		}
		
		// a palavra e o documento j� est�o na tabela, ent�o n�o insere.
		if(listaDeDocumentos.contains(documento)) return false;
		
		listaDeDocumentos.add(documento);
		return true;
	}
	
	/**
	 * Busca os documentos associados � uma <code>palavra</code>.
	 * @param palavra A palavra a ser buscada na tabela.
	 * @return A lista de documentos associados <b>ou</b> <code>null</code> caso a palavra n�o esteja na tabela.
	 */
	public LinkedList<String> busca(String palavra){
		return this.tabela.get(palavra);
	}
	
	
	@Override
	public String toString(){
		return this.tabela.toString();
	}
	
}
