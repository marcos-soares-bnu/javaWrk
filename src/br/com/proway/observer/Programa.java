package br.com.proway.observer;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		ISubject controladorEmail = new ControladorEmail();
		
		UsuarioA usrA = new UsuarioA();
		UsuarioB usrB = new UsuarioB();
		UsuarioC usrC = new UsuarioC();
				
				
		controladorEmail.Registrar(usrA);
		controladorEmail.Registrar(usrB);
		controladorEmail.Registrar(usrC);

		System.out.println("Os usuarios A, B e C cadastraram-se para receber as promo��es. \n");
		System.out.println("Enviando os emails para os usuarios assinados (usu�rios cadastrados). \n");
		
		controladorEmail.EnviarEmail();
		
		System.out.println("O usuario A resolveu cancelar a assinatura e n�o receber� mais as promo��es por email. \n");
		controladorEmail.Remover(usrA);
		
		System.out.println("Enviando os emails para os usuarios assinados. \n");
		
		controladorEmail.EnviarEmail();
		int i = teclado.nextInt();
		
	}

}
