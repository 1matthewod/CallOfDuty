package callOfDuty;

/*
 * Base class keeps a reference to location of every target in the game
 */
public class Base {

	// variables
	
	/*
	 * Creates array of targets
	 */
	private Target[][] targets = new Target[10][10];
	
	/*
	 * integer to keep track of shots fired
	 */
	private int shotsFired;
	
	/*
	 * variable to track number of destroyed targets
	 */
	private int destroyedTargetCount;
	
	
	// constructor
	
	
	
	// methods
	
	/*
	 * places all targets randomly on the empty base
	 */
	public void placeAllTargetRandomly() {
		
	}
	
	/*
	 * for a given row and column, checks to see if that space is occupied.
	 * Returns true/false depending on the place's status
	 */
	public boolean isOccupied(int row, int column) {
		
		return false;
	}
	
	/*
	 * returns true if the shot hit an undestroyed target
	 * note: if a location has been hit before but the target is not destroyed, the method returns true
	 */
	public boolean shootAt(int row, int column) {
		
		return false;
	}
	
	/*
	 * return true if run out of ammunition or if all targets have been destroyed
	 * otherwise returns false
	 */
	public boolean isGameOver(Weapon weapon1, Weapon weapon2) {
		
		return false;
	}
	
	/*
	 * returns true if all targets have been destroyed
	 */
	public boolean win() {
		
		return false;
	}
	
	/*
	 * prints the base
	 */
	public void print() {
		
	}
	
	/*
	 * returns the number of shots fired
	 */
	public int getShotsFired() {
		
	}
	
	/*
	 * returns the target array
	 */
	public Target[][] getTargetsArray(){
		
	}
	
	/*
	 * increases the number of shots fired by one, will be called from shootAt in Weapon class
	 */
	public void incrementShotsFired() {
		
	}
	
	/*
	 * returns count of destroyed targets
	 */
	public int getDestroyedTargetCount() {
		
	}
}
