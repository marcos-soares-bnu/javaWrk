package br.com.proway.factory;

public class FabricaHonda implements FabricaDeCarro {
	 
    @Override
    public Carro criarCarro(String nomeCarro) {
    	
    	if (nomeCarro == "Civic")
    		return new Civic();
    	else
    		return new City();
    }
 
}