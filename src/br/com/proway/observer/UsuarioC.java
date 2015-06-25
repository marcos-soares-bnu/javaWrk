package br.com.proway.observer;

public class UsuarioC implements IObserver {

	@Override
	public void ReceberEmail() {
		System.out.println("Email Recebido pelo usuário C");		
	}
	
}
