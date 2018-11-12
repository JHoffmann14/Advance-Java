package version6;

/**
 * This is an implementation (low-level object) of the FlyStrategy
 * 
 * @author Instlogin
 */
public class FlyRocketPowered implements FlyStrategy {
        @Override
	public void fly() {
		System.out.println("I'm flying with a rocket");
	}
}
