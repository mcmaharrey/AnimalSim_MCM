
public class Goldfinch extends Animal implements Walkable, Flyable{
	
	private double wingSpan;
	
	public Goldfinch() {
		super();
		wingSpan = 9.0;
	}//end empty constructor
	
	public Goldfinch(int simID, Location l, double ws) {
		
		super();
		super.setSimID(simID);
		super.setLocation(l);
		
		try {
			if (ws < 5.0 || ws > 11.0) {
		
			throw new InvalidWingspanException();
			}
			this.wingSpan = ws;
		} catch (InvalidWingspanException e) {
		System.out.println("Invalid Wingspan");
		}
	}//end preferred constructor

	public double getWingSpan() {
		return wingSpan;
	}

	public void setWingSpan(double wingSpan) {
		this.wingSpan = wingSpan;
	}

	@Override
	public String toString() {
		return "Goldfinch wingSpan= " + wingSpan + " ID= " + simID + " " +location + " full= " + full + " rested= " + rested;
	}
	
	public void walk(int direction) {
		  int walkX = (1 * (direction));
	      int walkY = (1 * (direction));

	        super.getLocation().setxCoord(super.getLocation().getxCoord() + walkX);
	        super.getLocation().setyCoord(super.getLocation().getyCoord() + walkY);
		
	}//end walk
	
	public void fly(Location l) {
		super.setLocation(l);
	}//end fly
	
}//end class
