/**
*
* @author Micael Levi &#8212; 21554923 &lt;mllc&#64;icomp.ufam.edu.br&gt;
* @since 2 de dez de 2016
*/
package br.edu.ufam.icomp.lab_rover;

public class DigitoInvalidoException extends RoverCoordenadaException {

	private static final long serialVersionUID = 1L;
	
	public DigitoInvalidoException() {
		super("Digito da coordenada inválido");
	}

}
