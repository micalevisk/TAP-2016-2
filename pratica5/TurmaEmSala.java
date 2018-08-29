
/**
* @author Micael Levi &#8212; 21554923 &lt;mllc&#64;icomp.ufam.edu.br&gt;
* @version 5 de nov de 2016
* @see Turma
* @see Sala
* @since 5.0
*/

public class TurmaEmSala {

	Turma turma;
	Sala sala;
	
	TurmaEmSala(){
		this(new Turma(), new Sala());
	}
	TurmaEmSala(Turma turma, Sala sala){
		this.turma = turma;
		this.sala = sala;
	}	
}
