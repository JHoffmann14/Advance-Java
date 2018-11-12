package version1;

/**
 * Starting point for a duck pond simulation game: SimUDuck. The game can 
 * show a large variety of duck species swimming and making quacking 
 * sounds. The initial designers used standard OOP techniques and 
 * created an abstract Duck superclass (this class) from which all other duck 
 * types inherit.
 * 
 * This is a good example of how Abstract classes can be used effectively:
 * a combination of methods are needed in the child classes. Two of these, quack()
 * and swim() have implementations, the assumption being that all child classes will 
 * need these implementations. But one method is abstract. No implementation is 
 * provided because each child class (duck) will display itself differently (some 
 * may be in color, some black and white, and they all look different.
 * 
 * Furthermore, the class is declared abstract because we don't want programmers 
 * using this class to create direct instances. We only want instances created 
 * from specific sub classes, because only those classes have enough distinct properties 
 * and methods to be useful. So this is a form of developer control.
 * 
 * The question is, "is this the best architecture for a duck simulation game?"
 * 
 * @version 1.01
 */
public abstract class Duck {
	
	// All ducks quack so provide an implementation that can be inherited
	public void quack() {
		System.out.println("Quack");
	}
	
	// All ducks swim so provide an implementation that can be inherited
	public void swim() {
		System.out.println("Whoa, I'm swimming!");
	}
	
	// But each duck is responsible for implementing its own
	// display() behavior for how it looks on the screen. Force
	// sub classes to provide their own implementation.
	public abstract void display();
		
}
