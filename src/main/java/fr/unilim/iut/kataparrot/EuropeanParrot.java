package fr.unilim.iut.kataparrot;

public class EuropeanParrot extends Parrot {

	public EuropeanParrot() {
		super(ParrotTypeEnum.EUROPEAN, 0, false);
	}
	
	public double getSpeed() {
		return getBaseSpeed();
	}
}
