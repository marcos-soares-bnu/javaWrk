package br.com.proway.observer;

public interface ISubject {

	void Registrar(IObserver observer); 
	void Remover(IObserver observer); 
	void EnviarEmail();
}
