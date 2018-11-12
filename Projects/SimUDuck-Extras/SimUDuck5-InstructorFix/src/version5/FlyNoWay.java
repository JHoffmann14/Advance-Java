package version5;

/**
 *
 * @author jlombardo
 */
public class FlyNoWay implements Flyable {
    @Override
    public final void fly() {
        System.out.println("Can't fly");
    }
}
