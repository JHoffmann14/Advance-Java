package version5;

/**
 *
 * @author jlombardo
 */
public class Duck {
    private Flyable flyable;
    private Quackable quakable;
    private DisplayMode displayMode;
    private String type;

    public Duck(String type, Flyable flyable, Quackable quakable, DisplayMode displayMode) {
        this.type = type;
        this.flyable = flyable;
        this.quakable = quakable;
        this.displayMode = displayMode;
    }

    public final void performFly() {
        flyable.fly();
    }


    public final void performQuack() {
        quakable.quack();
    }


    public final void performDisplay() {
        displayMode.display();
    }

    public Flyable getFlyable() {
        return flyable;
    }

    public void setFlyable(Flyable flyable) {
        this.flyable = flyable;
    }

    public Quackable getQuakable() {
        return quakable;
    }

    public void setQuakable(Quackable quakable) {
        this.quakable = quakable;
    }

    public DisplayMode getDisplayMode() {
        return displayMode;
    }

    public void setDisplayMode(DisplayMode displayMode) {
        this.displayMode = displayMode;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
}
