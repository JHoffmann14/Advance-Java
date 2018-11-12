package version5;

/**
 *
 * @author jlombardo
 */
public class MallardDuck extends Duck {
    
    public MallardDuck(String type, Flyable flyable, Quackable quakable, DisplayMode displayMode) {
        super(type, flyable, quakable, displayMode);
    }
    
    public void spyWithLaserVision() {
        System.out.println("I'm spying with laser vision");
    }
    
}
