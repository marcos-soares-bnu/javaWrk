package br.com.proway.facade;

public class SistemaDeAudio {

	
	public void ligarMicrofone() {
		System.out.println("Microfone Ligado!");
	}

	public void iniciarCapturaAudio(boolean sinalParada) {

		if (sinalParada)
			System.out.println("Audio desligado!");
		else
			System.out.println("Audio iniciado e capturando!");
	}

	
	
}