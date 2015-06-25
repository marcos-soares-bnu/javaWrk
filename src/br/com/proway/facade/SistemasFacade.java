package br.com.proway.facade;

public class SistemasFacade {

	protected SistemaDeAudio audio;
	protected SistemaDeVideo video;

	public void inicializarSubsistemas() {

		video = new SistemaDeVideo();
		video.posicionarFita();
		
		audio = new SistemaDeAudio();
		audio.ligarMicrofone();
		video.iniciarCapturaLentes(false);
		audio.iniciarCapturaAudio(false);
		
	}

	public void finalizarSubsistemas() {

		video = new SistemaDeVideo();
		video.iniciarCapturaLentes(true);
		audio = new SistemaDeAudio();
		audio.iniciarCapturaAudio(true);
	}
	

}