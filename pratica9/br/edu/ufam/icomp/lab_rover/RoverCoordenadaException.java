/**
*
* @author Micael Levi &#8212; 21554923 &lt;mllc&#64;icomp.ufam.edu.br&gt;
* @since 2 de dez de 2016
*/
package br.edu.ufam.icomp.lab_rover;

public class RoverCoordenadaException extends RoverException {
	
	private static final long serialVersionUID = 1L;

	public RoverCoordenadaException() {
		super("Exceção geral de coordenada do rover");
	}
	
	public RoverCoordenadaException(String infomsg){
		super(infomsg);
	}
	
	
}
