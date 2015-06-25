package br.com.proway.facade;

public class Teste {

	public static void main(String[] args) {

		System.out.println("=== Start Filmagem ===");
		SistemasFacade fachada = new SistemasFacade();
		fachada.inicializarSubsistemas();

		System.out.println("=== Stop Filmagem ===");
		fachada.finalizarSubsistemas();		
		
	}
	
}
