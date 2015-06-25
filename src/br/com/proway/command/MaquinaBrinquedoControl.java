package br.com.proway.command;

public class MaquinaBrinquedoControl {

	Command slot;
	//
	Command[] joyCommands;
	Command[] butCommands;
	
	public MaquinaBrinquedoControl(){
		
		joyCommands = new Command[4];
		butCommands = new Command[2];

		Command noCommand = new NoCommand();
		for (int i = 0; i < 4; i++) {
			joyCommands[i] = noCommand;
		}
		for (int i = 0; i < 2; i++) {
			butCommands[i] = noCommand;
		}
	}
	
	public void setCommand(Command command){
		slot = command;
	}
	
	public void joystickMoved(){
		slot.execute();
	}

	public void buttonWasPressed(){
		slot.execute();
	}

	//
	public void setCommand(int slot, Command joyCommand, Command butCommand){
		joyCommands[slot] = joyCommand;
		butCommands[slot] = butCommand;
	}
	public void joyButtonWasPressed(int slot){
		joyCommands[slot].execute();
	}
	public void butButtonWasPressed(int slot){
		butCommands[slot].execute();
	}
	
	
}
