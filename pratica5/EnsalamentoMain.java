
import java.util.ArrayList;
import java.util.Collections;

/**
* @author Micael Levi &#8212; 21554923 &lt;mllc&#64;icomp.ufam.edu.br&gt;
* @version 5 de nov de 2016
* @see Ensalamento
* @since 5.0
*/

public class EnsalamentoMain {

	public static void main(String[] args){
		/*
		Turma t4 = new Turma("Organização de Computadores", "Andrew S. Tanenbaum", 70, true);
		t4.addHorario(7);
		t4.addHorario(21);
		t4.addHorario(35);
		
		Sala s4 = new Sala(2, 102, 70, true);
		Ensalamento ens = new Ensalamento();
		ens.addTurma(t4);
		ens.addSala(s4);
		
		System.out.println("================================================= [RELATÓRIO RESUMO ENSALAMENTO]");
		System.out.println( ens.relatorioResumoEnsalamento() );
		System.out.println("================================================= [RELATÓRIO TURMAS POR SALA]");
		System.out.println( ens.relatorioTurmasPorSala() );
		System.out.println("================================================= [RELATÓRIO SALAS POR TURMA]");
		System.out.println( ens.relatorioSalasPorTurma() );
		*/
		
		/*
		Turma t1 = new Turma("Organização de Computadores", "Andrew S. Tanenbaum", 70, true);
		t1.addHorario(7);
		t1.addHorario(21);
		t1.addHorario(35);
		
		Sala s1 = new Sala(2, 102, 70, true);
		Sala s2 = new Sala(2, 202, 100, false);
		Sala s3 = new Sala(2, 301, 50, true);
		
		Ensalamento ens = new Ensalamento();
		System.out.println( ens.alocar(t1, s3) );
		System.out.println( ens.alocar(t1, s2) );
		*/
		
////////////////////////////////////////////////////////////////////////		
//	https://www.youtube.com/watch?v=QVMEMpiqAZY
//	(c)	http://stackoverflow.com/questions/2839137/how-to-use-comparator-in-java-to-sort
		

		
		Sala s1 = new Sala(2, 102, 70, true);		// 70
		Sala s2 = new Sala(2, 202, 100, false);	// 10
		Sala s3 = new Sala(2, 301, 50, true);		// 50
		
		ArrayList<Sala> listaDeSalas = new ArrayList<>();
		listaDeSalas.add(s1);
		listaDeSalas.add(s2);
		listaDeSalas.add(s3);
		Collections.sort(listaDeSalas, new CapacidadeComparator());
		System.out.println(listaDeSalas); // listaDeSalas.forEach(System.out::println);
		
		
		Turma t1 = new Turma("T1", "Andrew S. Tanenbaum", 50, true);
		t1.addHorario(7);
		t1.addHorario(21);
		Turma t2 = new Turma("T2", "Andrew S. Tanenbaum", 101, false);
		t2.addHorario(7);
		t2.addHorario(21);
		Turma t3 = new Turma("T3", "Andrew S. Tanenbaum", 70, true);
		t3.addHorario(35);
		t3.addHorario(35);
		
		ArrayList<Turma> listaDeTurmas = new ArrayList<>();
		listaDeTurmas.add(t1);
		listaDeTurmas.add(t2);
		listaDeTurmas.add(t3);
		Collections.sort(listaDeTurmas, new NumAlunosComparator());
		System.out.println(listaDeTurmas);
		
		System.out.println("-------------------------------");
		
		Ensalamento ens = new Ensalamento();
		ens.addSala(s1);
		ens.addSala(s2);
		ens.addSala(s3);
		ens.addTurma(t1);
		ens.addTurma(t2);
		ens.addTurma(t3);
		
//		ens.alocar(t1, s1);
		ens.alocarTodas();
		System.out.println();
//		System.out.println( ens.relatorioResumoEnsalamento() );
		System.out.println( ens.relatorioSalasPorTurma() );
		
////////////////////////////////////////////////////////////////////////		
		
		
	}
}

/*
class CapacidadeComparator implements Comparator<Sala> {
  @Override
  public int compare(Sala a, Sala b) {
  	// a lt b => retorna negativo
  	// a gt b => retorna positivo
  	// a eq b => retorna zero.
  	return a.capacidade - b.capacidade;
  }
}

class NumAlunosComparator implements Comparator<Turma> {
  @Override
  public int compare(Turma a, Turma b) {
  	return a.numAlunos - b.numAlunos;
  }
}
*/