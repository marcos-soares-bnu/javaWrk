package br.com.proway.command;

public class GruaAbreCommand implements Command {

	 Grua grua;
	 
	 public GruaAbreCommand(Grua grua) {
		 this.grua = grua;
	 }
	 
	 public void execute() {
		 grua.abrir();
	 }
	
}
