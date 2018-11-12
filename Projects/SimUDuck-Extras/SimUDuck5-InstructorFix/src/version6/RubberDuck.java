package version6;

/*
 * This class is a high-level class in the DIP. It delegates 
 * quacking work to the strategy object represented by the component 
 * property. But it also belongs to
 * a group of ducks -- the QuackGroup.
 */	
public class RubberDuck implements QuackGroup {
    // Strategy components declared via abstraction
    private QuackStrategy quackStrategy;

    // Don't foreget to pass in the strategy objects
    public RubberDuck(QuackStrategy quackStrategy) {
        this.quackStrategy = quackStrategy;
    }

    @Override
    public void setQuackBehavior(QuackStrategy quackStrategy) {
        this.quackStrategy = quackStrategy;
    }

    @Override
    public void performQuack() {
        quackStrategy.quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a Rubber Duck");
    }

}
