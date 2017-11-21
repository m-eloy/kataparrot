package fr.unilim.iut.kataparrot;

public class AfricanParrot extends Parrot {

	private int numberOfCoconuts = 0;
	
	public AfricanParrot(int numberOfCoconuts) {
		super(ParrotTypeEnum.AFRICAN, 0, false);
		this.numberOfCoconuts = numberOfCoconuts;
	}

	public double getSpeed() {
		return Math.max(0, getBaseSpeed() - getLoadFactor() * this.numberOfCoconuts);
	}
}
