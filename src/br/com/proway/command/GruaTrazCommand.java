package br.com.proway.command;

public class GruaTrazCommand implements Command {

	 Grua grua;
	 
	 public GruaTrazCommand(Grua grua) {
		 this.grua = grua;
	 }
	 
	 public void execute() {
		 grua.traz();
	 }
	
}
