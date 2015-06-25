package br.com.proway.command;

public class Grua {

	int posX, posY;
	
	public Grua(){
		posX = 0;
		posY = 0;
	}
	
	public void descer(){
		System.out.println("A Grua desceu!");
	}
	
	public void abrir(){
		System.out.println("A Grua abriu!");
	}

	public void frente(){
		this.posY++;
		System.out.println("A Grua foi para frente ( " + this.posX + "," + this.posY + ") !");
	}
	
	public void traz(){
		this.posY--;
		System.out.println("A Grua foi para traz ( " + this.posX + "," + this.posY + ") !");
	}

	public void direita(){
		this.posX++;
		System.out.println("A Grua foi para direita ( " + this.posX + "," + this.posY + ") !");
	}

	public void esquerda(){
		this.posX--;
		System.out.println("A Grua foi para esquerda ( " + this.posX + "," + this.posY + ") !");
	}
	
}
