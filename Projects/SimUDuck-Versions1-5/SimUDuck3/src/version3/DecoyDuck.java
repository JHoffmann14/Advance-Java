package version3;

/**
 * Unchanged from version 2. No need to implement Flyable or 
 * Quackable here. But what about swim(). DecoyDuck objects don't really swim,
 * after all they aren't alive. Therefore, shouldn't they float? We still
 * suffer from implementation inheritance. However, notice that we do not
 * implement the Flyable or Quackable interfaces because DecoyDuck objects
 * don't fly or quack. So at least now we have some control of how our
 * classes work.
 */
public class DecoyDuck extends Duck {
	
	// Custom implementation
	public void display() {
		System.out.println("Drawing a Decoy Duck to screen");
	}
}
