
public class Location {
	
	private int xCoord;
	private int yCoord;
	
	public Location() {
		 
		xCoord = 0;
		yCoord = 0;
		
	}//end empty constructor 
	
	public Location(int x, int y) {
		
		try {
			if (x < 0) {
			throw new InvalidXCoordinateException();
		}
			this.xCoord = x;
		} catch (InvalidXCoordinateException e) {
			System.out.println("Invalid X coordinate");
		}
		try {
			if (y < 0) {
			throw new InvalidYCoordinateException();
		}
			this.yCoord = y;
		} catch (InvalidYCoordinateException e2) {
			System.out.println("Invalid Y coordinate");
		}
		}//end Location
	
	public void update(int x, int y) {
		try {
			if (x < 0) {
			throw new InvalidXCoordinateException();
		}
			this.xCoord = x;
		} catch (InvalidXCoordinateException e) {
			System.out.println("Invalid X coordinate");
		}
		try {
			if (y < 0) {
			throw new InvalidYCoordinateException();
		}
			this.yCoord = y;
		} catch (InvalidYCoordinateException e2) {
			System.out.println("Invalid Y coordinate");
		}
	}
	
	public int[] getCoordinates() {
		
		return new int[] {xCoord, yCoord};
	}

	public int getxCoord() {
		return xCoord;
	}

	public void setxCoord(int xCoord) {
		this.xCoord = xCoord;
	}

	public int getyCoord() {
		return yCoord;
	}

	public void setyCoord(int yCoord) {
		this.yCoord = yCoord;
	}

	@Override
	public String toString() {
		return "Location [x=" + xCoord + ", y=" + yCoord + "]";
	}
	
	
	
}//end class

