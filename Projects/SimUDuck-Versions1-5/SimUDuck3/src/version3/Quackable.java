package version3;

/**
 * Joe figures he can take the quack() out of the Duck superclass 
 * and make a Quackable interface with a quack() method. That way 
 * only the ducks that are supposed to quack will implement that 
 * interface and have a quack() method. .. and, he figures, he 
 * might as well make a Flyable, too, since not all ducks can fly.
 * 
 * @version 3.00
 * @see Flyable
 *
 */
public interface Quackable {
	public abstract void quack();
}
