package callOfDuty;

public class OilDrum extends Target {
	
	/*
	 * private static int for length of drum
	 */
	private static final int DRUMLENGTH = 1;
	
	/*
	 * static final int for width of drum
	 */
	private static final int DRUMWIDTH = 1;
	
	// constructor with given base that sets the length and width 
	public OilDrum(Base base) {
		super(DRUMLENGTH, DRUMWIDTH, base);
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
