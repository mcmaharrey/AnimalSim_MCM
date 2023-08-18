
public class BrownBear extends Animal implements Walkable, Swimmable{
	
	private String subSpecies;
	
	public BrownBear() {
		
		super();
		subSpecies = "Alaskan";
		
	}//end empty argument
	
	public BrownBear(int simID, Location l, String subSpecies) {
		
		super();
		super.setSimID(simID);
		super.setLocation(l);
		try {
			if (!validSubspecies(subSpecies)) {
			throw new InvalidSubspeciesException();
		}
		this.subSpecies = subSpecies;
		} catch (InvalidSubspeciesException e) {
			System.out.println("Invalid Subspecies");
		}
		
	}//end preferred

	public String getSubSpecies() {
		return subSpecies;
	}//end getSubSpecies

	public void setSubSpecies(String subSpecies) {
		this.subSpecies = subSpecies;
	}//end setSubSpecies
	
	private boolean validSubspecies(String subspecies) {
		return subspecies.equals("Alaskan") ||
	           subspecies.equals("Asiatic") ||
	           subspecies.equals("European") ||
	           subspecies.equals("Grizzly") ||
	           subspecies.equals("Kodiak") ||
	           subspecies.equals("Siberian");
	}//end isValid

	@Override
	public String toString() {
		return "BrownBear subSpecies= " + subSpecies + " ID= "+ simID + " " + location + " full= "+ full + " rested= "+ rested;
	}//end toString

	@Override
	public void walk(int direction) {
		  int walkX = (3 * (direction));
	      int walkY = (3 * (direction));

	        super.getLocation().setxCoord(super.getLocation().getxCoord() + walkX);
	        super.getLocation().setyCoord(super.getLocation().getyCoord() + walkY);
		
	}//end walk
	
	public void swim(int direction) {
		
		int swimX = (2 * (direction));
		int swimY = (2 * (direction));
		
		super.getLocation().setxCoord(super.getLocation().getxCoord() + swimX);
        super.getLocation().setyCoord(super.getLocation().getyCoord() + swimY);
		
	}//end swim
	
}//end class
