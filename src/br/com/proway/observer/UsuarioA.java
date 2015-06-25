package br.com.proway.observer;

public class UsuarioA implements IObserver {

	@Override
	public void ReceberEmail() {
		System.out.println("Email Recebido pelo usuário A");		
	}
	
}
