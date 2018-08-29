/**
*
* @author Micael Levi &#8212; 21554923 &lt;mllc&#64;icomp.ufam.edu.br&gt;
* @since 2 de dez de 2016
*/
package br.edu.ufam.icomp.lab_rover;

public class RoverMain {

	public static void main(String[] args) {
		Caminho path = new Caminho(3);
		
		try{
			path.addCoordenada(new Coordenada(1, 2, 0));
			path.addCoordenada(new Coordenada(3, 4, 1));
			path.addCoordenada(new Coordenada(5, 6, 2));
			
			
		}
		catch(RoverException e){
			
		}
		
		
	}
	
}
