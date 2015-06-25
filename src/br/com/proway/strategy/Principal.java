package br.com.proway.strategy;

public class Principal {

	public static void main(String[] args) {
		INotaFiscal nota1 = new NotaFiscalEletronica();
		nota1.setaDados();
		IICMS icmspr = new ICMSPR();
		icmspr.setDados();
		nota1.setValorTotal(icmspr.getValor());
		
		System.out.println(nota1.getTipo());
		System.out.println(nota1.getValorTotal());
	}

}
