package br.com.proway.factory;

public class Civic implements Carro {

	@Override
	public void exibirInfo() {
		System.out.println("Modelo: Civic\nF�brica: Honda\nCilindrada: \nCor:  \nPortas:  \nOpcionais: ");
		System.out.println(this.cilindrada);
		
	}

}