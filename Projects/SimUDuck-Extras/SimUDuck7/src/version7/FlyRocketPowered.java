package version7;

public class FlyRocketPowered implements FlyBehavior {
	public void fly() {
		System.out.println("I'm flying with a rocket");
	}

    public String toString() {
        return "Fly With Rocket Power";
    }
}
