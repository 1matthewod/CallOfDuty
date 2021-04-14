package callOfDuty;

public abstract class Weapon {
	// instance variables
	
	/*
	 * number of shots left
	 */
	private int shotLeft;
	
	/*
	 * instance of base that the weapon will shoot at
	 */
	private Base base;
	
	// methods
	
	// abstract method to get weapon type
	public abstract String getWeaponType();

	/**
	 * @return the shotLeft
	 */
	public int getShotLeft() {
		return shotLeft;
	}

	/**
	 * @return the base
	 */
	public Base getBase() {
		return base;
	}
	
	/**
	 * method for using the rocket or missile to shoot at targets
	 * will call shootAt(int row, int column) and incrementShotsFired() in Base class
	 */
	public abstract boolean shootAt(int row, int column);
	
	/*
	 * method to reduce the shots remaining for weapon class
	 */
	public void decrementShotleft() {
		
	}
}
