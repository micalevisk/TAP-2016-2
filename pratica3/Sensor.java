/**
*
*	@author	Micael Levi - 21554923 <mllc@icomp.ufam.edu.br>
*	@date	21 de out de 2016
*/

public class Sensor {
	String cor;
	double resolucao;
	int framesPorSegundo;

	Sensor(){
		this(null, 0.0, 0);
	}
	public Sensor(String cor, double resolucao, int fps){
		this.cor = cor;
		this.resolucao = resolucao;
		framesPorSegundo = fps;
	}

	double getMPixelsPorSegundo(){
		return resolucao * framesPorSegundo;
	}

	String getDescricao(){
		return String.format("Sensor: cor=%s, resolucao=%.1fMp, framesPorSegundo=%dfps, mPixelsPorSegundo=%.1fMpps.", cor, resolucao, framesPorSegundo, getMPixelsPorSegundo());
	}

}
