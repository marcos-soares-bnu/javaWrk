package br.com.proway.factory;

public class City implements Carro {

	@Override
	public void exibirInfo() {
		System.out.println("Modelo: City\nFábrica: Honda\nCilindrada: \nCor:  \nPortas:  \nOpcionais: ");
		String aux = this.cilindrada;
		
	}

}