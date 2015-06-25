package br.com.proway.strategy;

public class ICMSPR extends ICMS implements IICMS {

	
	@Override
	public void setDados() {
		super.setValor(10);
	}

}
