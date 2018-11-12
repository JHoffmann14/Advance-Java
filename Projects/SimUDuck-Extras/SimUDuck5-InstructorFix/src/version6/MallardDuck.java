package version6;

/*
 * This class is a high-level class in the DIP. It delegates flying and
 * quacking work to the strategy objects represented by the component 
 * properties. But it also belongs to
 * a group of ducks -- the PerformAllGroup.
 */	
public class MallardDuck implements PerformAllGroup {
    // Strategy components declared via abstraction
    private QuackStrategy quackStrategy;
    private FlyStrategy flyStrategy;

    // Don't foreget to pass in the strategy objects
    public MallardDuck(QuackStrategy quackStrategy, FlyStrategy flyStrategy) {
        this.quackStrategy = quackStrategy;
        this.flyStrategy = flyStrategy;
    }
    
    @Override
    public void performQuack(){
            quackStrategy.quack();
    }

    @Override
    public void performFly() {
            flyStrategy.fly();
    }

    @Override
    public void setQuackBehavior(QuackStrategy quackStrategy) {
        this.quackStrategy = quackStrategy;
    }

    @Override
    public void setFlyBehavior(FlyStrategy flyStrategy) {
        this.flyStrategy = flyStrategy;
    }
    
    @Override
    public void display() {
            System.out.println("I'm a Mallard Duck");
    }

        
	
}
