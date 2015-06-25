package br.com.proway.factory;

public class Teste {

	public static void main(String[] args) {

		FabricaDeCarro fabrica = new FabricaFiat();
		Carro uno = fabrica.criarCarro("Uno");
		uno.exibirInfo();
		//
		Carro palio = fabrica.criarCarro("Palio");
		palio.exibirInfo();
		
	}

}
