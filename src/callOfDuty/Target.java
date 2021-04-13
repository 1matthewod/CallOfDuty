package callOfDuty;

public abstract class Target {

	/*
	 * Array of length 2 that species coordinate of target hear. Head means upper left part
	 */
	private int[] coordinate;
	
	/*
	 * length of the target
	 */
	private int length;
	
	/*
	 * width of the target
	 */
	private int width;
	
	/*
	 * indicates whether or not the target is horizontal
	 */
	private boolean horizontal;
	
	/*
	 * an array of the same size as the target, indicating number of times a part of the target has been hit
	 */
	private int[][] hit;
	
	/*
	 * instance of the Base class that the target is going to be placed in 
	 */
	private Base base;
	
	// constructor to set up length, width, and base of particular target
	public Target(int length, int width, Base base) {
		
	}

	/**
	 * @return the coordinate
	 */
	public int[] getCoordinate() {
		return coordinate;
	}

	/**
	 * @param coordinate the coordinate to set
	 */
	public void setCoordinate(int[] coordinate) {
		this.coordinate = coordinate;
	}

	/**
	 * @return the horizontal
	 */
	public boolean isHorizontal() {
		return horizontal;
	}

	/**
	 * @param horizontal the horizontal to set
	 */
	public void setHorizontal(boolean horizontal) {
		this.horizontal = horizontal;
	}

	/**
	 * @return the hit
	 */
	public int[][] getHit() {
		return hit;
	}

	/**
	 * @return the base
	 */
	public Base getBase() {
		return base;
	}
	
	/*
	 * defines behavior when target is destroyed
	 */
	abstract void explode();
	
	/*
	 * returns type of target as a string. every type of target has to override and implement this method and return
	 * corresponding Target type
	 */
	abstract String getTargetType();
	
	/*
	 * checks if the given coordinate is okay for placing a target
	 * buildings must not overlap another target, or touch another building (vertically, horizontally, or diagonally)
	 */
	public boolean okToPlaceTargetAt(int row, int column, boolean horiztonal) {
		
		return false;
	}
	
	/*
	 * initiates and sets the value of the hit array, coordinate array, and horizontal boolean value
	 */
	public void placeTargetAt(int row, int column, boolean horizontal) {
		
	}
	
	/*
	 * records the target as being hit if it occupies the space getting shot and hasn't already been destroyed 
	 */
	public boolean getShot(int row, int column) {
		
		return false;
	}
	
	/*
	 * returns true if every part of the target has been hit, false otherwise
	 */
	public boolean isDestroyed() {
		return false;
	}
	
	/*
	 *returns true if the target has been hit at the given coordinate. this method is used to print the Base
	 */
	public boolean getLocationHit(int row, int column) {
		
		return false;
	}
	
	@Override
	/*
	 * returns a single character string to use in the Base's print method
	 * returns X if Target has been destroyed
	 * returns O if not destroyed
	 * returns T for a tank that has only been hit once
	 * returns - if the target is ground
	 */
	public String toString() {
		String baseMap;
		
		return baseMap;
	}
}
