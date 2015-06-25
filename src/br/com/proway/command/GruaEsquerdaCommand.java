package br.com.proway.command;

public class GruaEsquerdaCommand implements Command {

	 Grua grua;
	 
	 public GruaEsquerdaCommand(Grua grua) {
		 this.grua = grua;
	 }
	 
	 public void execute() {
		 grua.esquerda();
	 }
	
}
