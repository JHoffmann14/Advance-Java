package version3;

/**
 * SimUDuck Version 3. Joe realized that concrete ("implementation") 
 * inheritance probably wasn't 
 * the answer because he just got a memo that says that the executives 
 * now want to update the product every six months (in ways they haven't 
 * yet decided on). Joe knows the spec will keep changing and he'll be 
 * forced to look at and possibly override fly() and quack() for every 
 * new Duck subclass that's ever added to the program ... forever!
 * 
 * So he needs a cleaner way to have only some, but not all, of the duck 
 * types fly or quack. So he moves the quack() and fly() methods into interfaces.
 * 
 * @version 2.00
 */
public abstract class Duck {
	
	// All ducks swim so provide an implementation
	public void swim() {
		System.out.println("Whoa, I'm swimming!");
	}
	
	// But each duck is responsible for implementing its own
	// display() behavior for how it looks on the screen.
	public abstract void display();
	
}
