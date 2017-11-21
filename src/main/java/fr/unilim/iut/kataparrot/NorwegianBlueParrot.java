package fr.unilim.iut.kataparrot;

public class NorwegianBlueParrot extends Parrot {

	private static final double SPEED_MAX = 24.0;
	private double voltage;
	
	public NorwegianBlueParrot(double voltage) {
		this.voltage = voltage;
	}
	
	public double getSpeed() {
			return Math.min(SPEED_MAX, this.voltage * getBaseSpeed());
	}
	

}
