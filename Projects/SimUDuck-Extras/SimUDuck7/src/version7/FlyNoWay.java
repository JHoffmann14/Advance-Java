package version7;

public class FlyNoWay implements FlyBehavior {

	public void fly() {
		System.out.println("I can't fly at all");
	}

    public String toString() {
        return "No Flying Ability";
    }
}
