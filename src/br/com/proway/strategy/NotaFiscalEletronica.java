package br.com.proway.strategy;

public class NotaFiscalEletronica extends NotaFiscal implements INotaFiscal {

	@Override
	public void setaDados() {
		super.setTipo("NFe");
	}

}
