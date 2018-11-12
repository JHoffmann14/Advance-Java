package version3;

/**
 * Provide custom implementations of Flyable and Quackable.
 * 
 * @version 3
 * @see Flyable
 * @see Quackable
 */
public class RedheadDuck extends Duck implements Flyable, Quackable {
	
	public void fly() {
		System.out.println("I'm flying!");
	}
	
	public void quack() {
		System.out.println("Quack");
	}
	
	// Custom implementation
	public void display() {
		System.out.println("Drawing a Redheaded Duck to screen");
	}
}
