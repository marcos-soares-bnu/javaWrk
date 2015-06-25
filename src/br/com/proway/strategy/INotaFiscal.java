package br.com.proway.strategy;

public interface INotaFiscal {
	public void setaDados();
	public String getTipo();
	public void setTipo(String string);
	public ICMS getIcms();
	public void setIcms(ICMS icms);
	public double getValorTotal();
	public void setValorTotal(double valorTotal);
	
}
