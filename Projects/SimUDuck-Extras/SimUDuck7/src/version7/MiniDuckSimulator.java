package version7;

/**
 * This class is the same as version 5. But don't use this class to start
 * the program. Instead, use the Startup class to see how a GUI can be
 * used to modify flying and quacking behaviors at runtime.
 * 
 * @author jlombardo
 */
public class MiniDuckSimulator {

	public static void main(String[] args) {
		Duck mallard = new MallardDuck();
		mallard.display();
		mallard.performQuack();
		mallard.performFly();

		Duck model = new ModelDuck();
		model.display();
		model.performFly();
		model.setFlyBehavior( new FlyRocketPowered() );
		model.performFly();
	}

}
