package callOfDuty;

public class Tank extends Target {

	/*
	 * final int for length of tank
	 */
	private static final int TANKLENGTH = 1;
	
	/* 
	 * static final int for width of tank
	 */
	private static final int TANKWIDTH = 1;
	
	// constructor for tank with given width and length
	public Tank(Base base) {
		super(TANKLENGTH, TANKWIDTH, base);
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
