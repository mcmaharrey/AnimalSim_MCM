import java.util.ArrayList;

public class Application {

	public static void main(String[] args) {
		
		System.out.println("*********************************************");
        System.out.println("      Location Tests");
        System.out.println("*********************************************");
        
        Location locationX = new Location (-1,0);
        Location locationY = new Location (0,-1);
        Location locationE = new Location ();
        System.out.println(locationE);
        
        Location location = new Location (3,8);
        System.out.println("Location for X = " + location.getxCoord());
        System.out.println("Location for Y = " + location.getyCoord());
        location.update(12,4);
        System.out.println(location);
		
		System.out.println("*********************************************");
        System.out.println("      Animal Tests");
        System.out.println("*********************************************");
		
        //Animal animal = new Animal(1, new Location (0,0));
        
		System.out.println("*********************************************");
        System.out.println("      BrownBear Tests");
        System.out.println("*********************************************");
		
        BrownBear bear = new BrownBear();
        System.out.println(bear);
        BrownBear bearError = new BrownBear(0,new Location (1,1), "Polar");
        System.out.println();
        
        BrownBear bear1 = new BrownBear(1, new Location (2,3), "Siberian");
        System.out.println("Subspecies: " + bear1.getSubSpecies());
        System.out.println(bear1.getLocation());
        bear1.walk(2);
		System.out.println("New " + bear1.getLocation());
		bear1.eat();
	    System.out.println(bear1.full);
	    bear1.sleep();
	    System.out.println(bear1.rested);
	    System.out.println();
	    
	    BrownBear bear2 = new BrownBear(2, new Location (12,4), "Grizzly");
		System.out.println("Subspecies: " + bear2.getSubSpecies());
	    System.out.println(bear2.getLocation());
	    bear2.swim(2);
	    System.out.println("New " + bear2.getLocation());
	    bear2.eat();
	    System.out.println(bear2.full);
	    bear2.sleep();
	    System.out.println(bear2.rested);
	    
	    
		
		
		System.out.println("*********************************************");
        System.out.println("      Goldfinch Tests");
        System.out.println("*********************************************");
		
        Goldfinch bird = new Goldfinch();
        System.out.println(bird);
        Goldfinch birdError = new Goldfinch(1, new Location (1,1), 2.4);
        System.out.println();
        
        Goldfinch bird1 = new Goldfinch(1, new Location (4,9), 10.3);
        System.out.println(bird1.getLocation());
        System.out.println("Wingspan: " + bird1.getWingSpan());
        
        Location newLocation = new Location(2,2);
        bird1.fly(newLocation);
        System.out.println("New " + bird1.getLocation());
		bird1.eat();
	    System.out.println(bird1.full);
	    bird1.sleep();
	    System.out.println(bird1.rested);
	    System.out.println();
	    
		Goldfinch bird2 = new Goldfinch(2, new Location (2,2), 5.7);
		System.out.println(bird2.getLocation());
	    System.out.println("Wingspan: " + bird2.getWingSpan());
	        
	    Location newLocation2 = new Location(4,9);
	    bird2.fly(newLocation2);
	    System.out.println("New " + bird2.getLocation());
	    bird2.eat();
	    System.out.println(bird2.full);
	    bird2.sleep();
	    System.out.println(bird2.rested);
		
		System.out.println("*********************************************");
        System.out.println("      Generics Tests");
        System.out.println("*********************************************");
		
        ArrayList<Animal> animals = new ArrayList<>();
        
        animals.add(bear1);
        animals.add(bear2);
        animals.add(bird1);
        animals.add(bird2);
        
        for (Animal animal : animals) {
        	System.out.println(animal.toString());
        }
		
	}//end main
}//end class
