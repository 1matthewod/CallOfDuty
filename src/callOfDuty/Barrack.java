package callOfDuty;

public class Barrack extends Target {
	
	/*
	 * static int for length of barrack
	 */
	private static final int BARRACKLENGTH = 3;
	
	/*
	 * static int for width of barrack
	 */
	private static final int BARRACKWIDTH = 1;

	// constructor for barrack with given base, sets the length and width
	public Barrack(Base base) {
		super(BARRACKLENGTH, BARRACKWIDTH, base);
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
