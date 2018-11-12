package version6;

/*
 * This class is NOT a high-level class in the DIP. It has nothing to
 * delegate to (no strategy objects). But it belongs to
 * a group of ducks -- the basic DuckGroup.
 */	
public class ModelDuck implements DuckGroup {
	
        @Override
	public void display() {
		System.out.println("I'm a model duck");
	}
}
