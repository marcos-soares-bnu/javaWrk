package br.com.proway.strategy;

public class NotaServico extends NotaFiscal implements INotaFiscal {

	@Override
	public void setaDados() {
		super.setTipo("Nota Serviço");
	}

}
