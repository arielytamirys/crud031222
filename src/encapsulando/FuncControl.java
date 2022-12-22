package encapsulando;

public class FuncControl implements Controlling {
	
	private int volume;
	private boolean on;
	private boolean playing;
	
	public FuncControl() {
		this.volume = 30; // meu volume vai começar com o valorm estipulado assim que ligar a tv
		this.on = false;
		this.playing = false;	
	}
	
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	public boolean isOn() {
		return on;
	}
	public void setOn(boolean on) {
		this.on = on;
	}
	public boolean isPlaying() {
		return playing;
	}
	public void setPlaying(boolean playing) {
		this.playing = playing;
	}

	@Override
	public void turnOn() {
		this.setOn(true);
	}

	@Override
	public void toSwitchOff() {	
		this.setOn(false);
	}

	@Override
	public void openMenu() {	
		System.out.println("Esta Ligado? " + this.isOn());
		System.out.println("Esta Tocando? " + this.isPlaying());
		System.out.print("Volume: " + this.getVolume());
		for (int i = 0; i<= this.getVolume(); i+=10) {
			System.out.print("|");
	/*
	 */
		}
	}

	@Override
	public void closeMenu() {	
		System.out.println("fechando menu");
	}

	@Override
	public void moreVolume() {	
		if (this.isOn()) {
			this.setVolume(this.getVolume()+3);
//linha 61 e 62 esta falando que se a tv estiver ligada,  ao clicar no mais volume deve se almentar mais 3 |||	
		} 
	}

	@Override
	public void lessVolume() {	
		if(this.isOn()) {
			this.setVolume(this.getVolume()-3);
		// aqui é ao contrario 	do  moreVolume
		}
	}

	@Override
	public void turnOnMute() {	
		if(this.isOn() && this.getVolume() > 0) {
			this.setVolume(0);
///* so vai colocar mudo se não estiver mudo,
		}
	}

	@Override
	public void turnOffMude() {	
		if(this.isOn() && this.getVolume() == 0) {
			this.setVolume(30);		
			/* verifica se esta no mudo, se estiver e tirar do mudo 
			  ele volta para o valor estipulado */
		}
	}

	@Override
	public void play() {
		if(this.isOn() && !(this.isPlaying())){
			this.setPlaying(true);
			/* se estiver ligado e não estive tocando é verdadeiro*/
		}
	}

	@Override
	public void pause() {	
		if (this.isOn() && this.isPlaying()) {
			this.setPlaying(false);
			// se estiver e estiver tocando é falso
		}
	}
}
