package br.com.proway.factory;

public interface Carro {
    
	String cilindrada = "";
	String cor = "";
	String portas = "";
	String opcionais[] = new String[10];
	
	void exibirInfo();
}