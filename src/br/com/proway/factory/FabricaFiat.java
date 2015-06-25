package br.com.proway.factory;

public class FabricaFiat implements FabricaDeCarro {
	 
    @Override
    public Carro criarCarro(String nomeCarro) {
    	
    	if (nomeCarro == "Palio"){
    		return new Palio();
    	}
    	else{
    		return new Uno();
    	}
    }
 
}