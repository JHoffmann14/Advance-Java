package version2;

/**
 * SimUDuck Version 2. The executives of the game development company 
 * decided that flying ducks is just what the SimUDuck simulator game needed 
 * to blow away the competition. So Joe figured he just needed to add a fly() 
 * method in the Duck superclass and then all the ducks will inherit it. 
 * Joe was very proud of himself for being a true OOP genius.
 * 
 * @version 2.00
 */
public abstract class Duck {
	
	// All ducks quack so provide an implementation
	public void quack() {
		System.out.println("Quack");
	}
	
	// All ducks swim so provide an implementation
	public void swim() {
		System.out.println("Whoa, I'm swimming!");
	}
	
	// But each duck is responsible for implementing its own
	// display() behavior for how it looks on the screen.
	public abstract void display();
	
	// To meet the executives' need Joe added this thinking all ducks fly. 
	// Was this a good idea?
	public void fly() {
		System.out.println("Look, I'm flying!");
	}
}
