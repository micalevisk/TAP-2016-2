/**
*
*	@author	Micael Levi - 21554923 <mllc@icomp.ufam.edu.br>
*	@date	21 de out de 2016
*/

public class Conexao {
	String tipoPorta;
	int idProtocolo;
	int taxaTransmissao;
	
	Conexao() {
		this("Generica", 2155, 4923);
	}
	public Conexao(String tipoPorta, int idProtocolo, int taxaTransmissao){
		this.tipoPorta = tipoPorta;
		this.idProtocolo = idProtocolo;
		this.taxaTransmissao = taxaTransmissao;
	}
	
	String getProtocoloString(){
		switch(idProtocolo){
			case 1: return "Rotoscope";
			case 2: return "Acustico";
			case 3: return "Radio";
			default: return "Outros";
		}
	}
	
	double getTaxaMBps(){
		return taxaTransmissao / 1024.0;   
	}
	
	String getDescricao(){
		return String.format("Conexao: tipoPorta=%s, protocolo=%s, taxaTransmissao=%.1fMBps.", tipoPorta, getProtocoloString(), getTaxaMBps());
	}
	
}
