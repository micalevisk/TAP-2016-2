/**
*
* @author Micael Levi &#8212; 21554923 &lt;mllc&#64;icomp.ufam.edu.br&gt;
* @since 2 de dez de 2016
*/
package br.edu.ufam.icomp.lab_rover;

public class RoverCaminhoException extends RoverException {

	private static final long serialVersionUID = 1L;

	public RoverCaminhoException() {
		super("Exceção geral de caminho do rover");
	}
	
	public RoverCaminhoException(String infomsg){
		super(infomsg);
	}
}
