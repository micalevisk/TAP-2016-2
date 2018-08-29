/**
*
* @author Micael Levi &#8212; 21554923 &lt;mllc&#64;icomp.ufam.edu.br&gt;
* @since 2 de dez de 2016
*/
package br.edu.ufam.icomp.lab_rover;

public class TamanhoMaximoExcedidoException extends RoverCaminhoException {

	private static final long serialVersionUID = 1L;
	
	public TamanhoMaximoExcedidoException() {
		super("Quantidade máxima de coordenadas excedida");
	}
	
	public TamanhoMaximoExcedidoException(String infomsg){
		super(infomsg);
	}

}
