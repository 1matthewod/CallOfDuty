package callOfDuty;

public class HeadQuarter extends Target {

	/*
	 * static final variable for width
	 */
	private static final int HQWIDTH = 1;
	
	/*
	 * static final variable for length
	 */
	private static final int HQLENGTH = 6;
	
	// constructor for HQ with given base and sets length and width with above static ints
	public HeadQuarter(Base base) {
		super(HQLENGTH, HQWIDTH, base);
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
