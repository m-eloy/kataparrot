package fr.unilim.iut.kataparrot;

public class Parrot {

	private static final double BASE_SPEED = 12.0;
	private ParrotTypeEnum type;
	private double voltage;
	private boolean isNailed;

	public Parrot(ParrotTypeEnum _type, double voltage, boolean isNailed) {
		this.type = _type;
		this.voltage = voltage;
		this.isNailed = isNailed;
	}

	public double getSpeed() {
		switch (type) {
			case EUROPEAN:
				throw new RuntimeException("Should be unreachable");
			case AFRICAN:
				throw new RuntimeException("Should be unreachable");
			case NORWEGIAN_BLUE:
				return (isNailed) ? 0 : getBaseSpeed(voltage);
		}
		throw new RuntimeException("Should be unreachable");
	}

	protected double getBaseSpeed(double voltage) {
		return Math.min(BASE_SPEED*2, voltage * getBaseSpeed());
	}

	protected double getBaseSpeed() {
		return BASE_SPEED;
	}

}
