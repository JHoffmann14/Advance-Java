package version6;

/*
 * This class is a high-level class in the DIP. It delegates flying 
 * work to the strategy object represented by the component 
 * property. But it also belongs to
 * a group of ducks -- the FlyGroup.
 */	
public class MuteMallardDuck implements FlyGroup {
    // Strategy components declared via abstraction
    private FlyStrategy flyStrategy;

    // Don't foreget to pass in the strategy objects
    public MuteMallardDuck(FlyStrategy flyStrategy) {
        this.flyStrategy = flyStrategy;
    }
    

    @Override
    public void performFly() {
            flyStrategy.fly();
    }

    @Override
    public void setFlyBehavior(FlyStrategy flyStrategy) {
        this.flyStrategy = flyStrategy;
    }
    
    @Override
    public void display() {
            System.out.println("I'm a Mute Mallard Duck");
    }

        
	
}
