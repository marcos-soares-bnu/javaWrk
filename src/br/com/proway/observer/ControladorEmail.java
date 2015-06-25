package br.com.proway.observer;

import java.util.ArrayList;
import java.util.List;

public class ControladorEmail implements ISubject {

	private List<IObserver> _usuarios;
	
	public ControladorEmail() { 
		_usuarios = new ArrayList<IObserver>(); 
	}

	
	@Override
	public void Registrar(IObserver observer) {
		_usuarios.add(observer);
	}

	@Override
	public void Remover(IObserver observer) {
		_usuarios.remove(observer);
	}

	@Override
	public void EnviarEmail() {

		for (IObserver iObserver : _usuarios) {
			iObserver.ReceberEmail();		
		}
		
	}

	
	
}
