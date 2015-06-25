package br.com.proway.command;

public class GruaFrenteCommand implements Command {

	 Grua grua;
	 
	 public GruaFrenteCommand(Grua grua) {
		 this.grua = grua;
	 }
	 
	 public void execute() {
		 grua.frente();
	 }
	
}
