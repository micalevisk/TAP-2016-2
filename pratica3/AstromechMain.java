/**
*
*	@author	Micael Levi - 21554923 <mllc@icomp.ufam.edu.br>
*	@date	21 de out de 2016
*/

public class AstromechMain {

	public static void main(String[] args) {
		
		Mestre mestre = new Mestre("Kanan Jarrus", -33, "Jedi Order", "Jedi");
		System.out.println(mestre.getDescricao());
		
		Sensor sensor = new Sensor();
		System.out.println(sensor.getDescricao());
		
		Conexao conexao = new Conexao();
		System.out.println(conexao.getDescricao());

		Astromech astromech = new Astromech("", mestre, sensor, conexao);
		System.out.println(astromech.getDescricao());
		
		
	}

}
