package callOfDuty;

public class Armory extends Target {
	
	/*
	 * static final int for length
	 */
	private static final int ARMORYLENGTH = 3;
	
	/*
	 * static final int for width
	 */
	private static final int ARMORYWIDTH = 2;

	// constructor for barrack with given base; sets length and width using the above values
	public Armory(Base base) {
		super(ARMORYLENGTH, ARMORYWIDTH, base);
		// TODO Auto-generated constructor stub
	}

	@Override
	void explode() {
		// TODO Auto-generated method stub
		
	}

	@Override
	String getTargetType() {
		// TODO Auto-generated method stub
		return null;
	}

}
