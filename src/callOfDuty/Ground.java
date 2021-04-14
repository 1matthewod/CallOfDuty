package callOfDuty;

public class Ground extends Target {

	// the one-argument public constructor that sets the length, width, and base to the correct value
	public Ground(Base base) {
		// base is length and width of one
		super(1, 1, base);
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
