package version6;

/*
 * This class is a high-level class in the DIP. It delegates flying and
 * quacking work to the strategy objects represented by the component 
 * properties. But it also belongs to
 * a group of ducks -- the PerformAllGroup.
 */	
public class RedHeadedDuck implements PerformAllGroup {
    // Strategy components declared via abstraction
    private QuackStrategy quackStrategy;
    private FlyStrategy flySrategy;

    // Don't foreget to pass in the strategy objects
    public RedHeadedDuck(QuackStrategy quackStrategy, FlyStrategy flySrategy) {
        this.quackStrategy = quackStrategy;
        this.flySrategy = flySrategy;
    }
    
    @Override
    public void performQuack(){
            quackStrategy.quack();
    }

    @Override
    public void performFly() {
            flySrategy.fly();
    }

    @Override
    public void setQuackBehavior(QuackStrategy quackStrategy) {
        this.quackStrategy = quackStrategy;
    }

    @Override
    public void setFlyBehavior(FlyStrategy flySrategy) {
        this.flySrategy = flySrategy;
    }
    
    @Override
    public void display() {
            System.out.println("I'm a Red headed Duck");
    }

        
	
}
