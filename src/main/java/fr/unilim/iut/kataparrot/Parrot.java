package fr.unilim.iut.kataparrot;

public abstract class Parrot {
	
	private static final double SPEED_MIN = 12.0;

	public abstract double getSpeed();
	
	protected double getBaseSpeed() {
		return SPEED_MIN;
	}

}
