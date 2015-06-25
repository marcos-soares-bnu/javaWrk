package br.com.proway.command;

public class GruaDesceCommand implements Command {

	 Grua grua;
	 
	 public GruaDesceCommand(Grua grua) {
		 this.grua = grua;
	 }
	 
	 public void execute() {
		 grua.descer();
	 }
	
}



