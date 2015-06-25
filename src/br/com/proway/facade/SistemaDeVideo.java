package br.com.proway.facade;

public class SistemaDeVideo {

	public void posicionarFita() {
		System.out.println("Fita Posicionada!");
	}

	public void iniciarCapturaLentes(boolean sinalParada) {

		if (sinalParada)
			System.out.println("Lentes paradas!");
		else
			System.out.println("Lentes iniciadas e capturando!");
	}

}