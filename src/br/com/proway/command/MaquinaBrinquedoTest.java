package br.com.proway.command;

public class MaquinaBrinquedoTest {

	public static void main(String[] args) {
		//
		//
		MaquinaBrinquedoControl maquina = new MaquinaBrinquedoControl();
		Grua grua = new Grua();
		GruaDesceCommand gruaDesce = new GruaDesceCommand(grua);
		GruaAbreCommand gruaAbre = new GruaAbreCommand(grua);
		GruaFrenteCommand gruaFrente = new GruaFrenteCommand(grua);
		GruaTrazCommand gruaTraz = new GruaTrazCommand(grua);
		GruaDireitaCommand gruaDireita = new GruaDireitaCommand(grua);
		GruaEsquerdaCommand gruaEsquerda = new GruaEsquerdaCommand(grua);
/*
		//
		System.out.println("=== Maquina de Brinquedo - Pegar Brinquedo ===");
		//
		maquina.setCommand(gruaFrente);
		maquina.joystickMoved();
		maquina.setCommand(gruaFrente);
		maquina.joystickMoved();
		//
		maquina.setCommand(gruaDireita);
		maquina.joystickMoved();
		//
		maquina.setCommand(gruaFrente);
		maquina.joystickMoved();
		//
		maquina.setCommand(gruaDesce);
		maquina.buttonWasPressed();
		//
		maquina.setCommand(gruaAbre);
		maquina.buttonWasPressed();
		//
		System.out.println("=== Maquina de Brinquedo - Retornar ===");
		//
		maquina.setCommand(gruaTraz);
		maquina.joystickMoved();
		//
		maquina.setCommand(gruaEsquerda);
		maquina.joystickMoved();
		//
		maquina.setCommand(gruaTraz);
		maquina.joystickMoved();
		//
		maquina.setCommand(gruaTraz);
		maquina.joystickMoved();
*/
		//----------------------------------------------------------------------
		// Usando MacroCommand...
		//----------------------------------------------------------------------
		Command[] gruamoves = { gruaFrente, gruaFrente, gruaDireita, gruaFrente, gruaDesce, gruaAbre };
		Command[] gruabacks = { gruaTraz, gruaTraz, gruaEsquerda, gruaTraz };
		MacroCommand gruamovesMacro = new MacroCommand(gruamoves);
		MacroCommand gruabacksMacro = new MacroCommand(gruabacks);
		//
		System.out.println("=== Maquina de Brinquedo - Macro Pegar ===");
		//
		maquina.setCommand(0, gruamovesMacro, gruabacksMacro);
		maquina.joyButtonWasPressed(0);
		//
		System.out.println("=== Maquina de Brinquedo - Macro Voltar ===");
		//
		maquina.butButtonWasPressed(0);
	}

}
