package version4;

public class RubberDuck extends Duck {
//	private QuackBehavior quackBehavior;

	public RubberDuck() {
		// these properties are inherited from Duck
		quackBehavior = new Squeak();
		flyBehavior = new FlyNoWay();
	}
	
	public void display() {
		System.out.println("I'm a Rubber Duck");
	}
	

}
