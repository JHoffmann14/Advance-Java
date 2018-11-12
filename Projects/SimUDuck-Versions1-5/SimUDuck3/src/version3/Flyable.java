package version3;

/**
 * Joe figures he can take the fly() out of the Duck superclass 
 * and make a Flyable interface with a fly() method. That way 
 * only the ducks that are supposed to fly will implement that 
 * interface and have a fly() method. .. and, he figures, he 
 * might as well make a Quackable, too, since not all ducks can quack.
 * 
 * @version 3.00
 * @see Quackable
 *
 */
public interface Flyable {
	public abstract void fly();
}
