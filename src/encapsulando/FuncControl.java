package encapsulando;

public class FuncControl implements Controlling {
	
	private int volume;
	private boolean on;
	private boolean playing;
	
	public FuncControl() {
		this.volume = 50;
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
		}
	}

	@Override
	public void closeMenu() {		
	}

	@Override
	public void moreVolume() {		
	}

	@Override
	public void lessVolume() {		
	}

	@Override
	public void turnOnMute() {		
	}

	@Override
	public void turnOffMude() {		
	}

	@Override
	public void play() {		
	}

	@Override
	public void pause() {		
	}
}
