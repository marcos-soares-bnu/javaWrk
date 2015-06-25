package br.com.proway.strategy;

public class NotaFiscal {
	private String tipo;
	private ICMS icms;
	private double valorTotal;
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String string) {
		this.tipo = string;
	}
	public ICMS getIcms() {
		return icms;
	}
	public void setIcms(ICMS icms) {
		this.icms = icms;
	}
	public double getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}
	
}
