package fr.unilim.iut.kataparrot;

public class AfricanParrot extends Parrot {

	private static final double WEIGHT_COCONUT = 9.0;
	private int numberOfCoconuts = 0;
	
	public AfricanParrot(int numberOfCoconuts) {
		this.numberOfCoconuts = numberOfCoconuts;
	}

	@Override
	public double getSpeed() {
		return Math.max(0, getBaseSpeed() - WEIGHT_COCONUT * this.numberOfCoconuts);
	}
	
	
}
