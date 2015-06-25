package br.com.proway.observer;

public class UsuarioB implements IObserver{

	@Override
	public void ReceberEmail() {
		System.out.println("Email Recebido pelo usuário B");		
	}	
	
}
