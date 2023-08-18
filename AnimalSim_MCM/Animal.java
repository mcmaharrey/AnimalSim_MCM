import java.util.Random;

public abstract class Animal {
	
	protected int simID;
	protected Location location;
	protected boolean full;
	protected boolean rested;
	
	public Animal() {
		simID = 0;
		location = new Location (0,0);
		full = false;
		rested = true;
		
	}//empty argument 
	
	public Animal(int simID, Location l) {
		
		this.location = l;
		this.full = full;
		this.rested = rested;
		try {
			if (simID <= 0) {
				throw new InvalidSimIDException();
			}
			this.simID = simID;
		 } catch (InvalidSimIDException e) {
			 System.out.println("Invalid SimID");
		 }
		
	}// preferred constructor 
	
	public boolean eat() {
		
		Random random = new Random();
		double randomNumber = random.nextDouble();
		
		if (randomNumber <= 0.5) {
			full = false;
		} else {
			full = true;
		}
		return full;
	}
	
	public boolean sleep() {
		
		Random random = new Random();
		double randomNumber = random.nextDouble();
		
		if (randomNumber <= 0.5) {
			rested = false;
		} else {
			rested = true;
		}
		
		return rested;
		
	}

	public int getSimID() {
		return simID;
	}

	public void setSimID(int simID) {
		this.simID = simID;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public boolean isFull() {
		return full;
	}

	public void setFull(boolean full) {
		this.full = full;
	}

	public boolean isRested() {
		return rested;
	}

	public void setRested(boolean rested) {
		this.rested = rested;
	}
	
	
}//end class
