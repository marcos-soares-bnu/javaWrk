package br.com.proway.command;

public class GruaDireitaCommand implements Command {

	 Grua grua;
	 
	 public GruaDireitaCommand(Grua grua) {
		 this.grua = grua;
	 }
	 
	 public void execute() {
		 grua.direita();
	 }
	
}
