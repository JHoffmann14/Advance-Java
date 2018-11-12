package version6;

public class MiniDuckSimulator {

	public static void main(String[] args) {
            // Ducks that can Quack
//            QuackGroup[] ducks = {
//                new MallardDuck(new HorseQuack(), new FlyWithWings()),
//                new RubberDuck(new Squeak())
//            };
//                    
//            for(QuackGroup duck : ducks) {
//                duck.performQuack();
//                duck.display();
//            }              
            
            // Ducks that can Fly
            FlyGroup[] ducks2 = {
                new MallardDuck(new HorseQuack(), new FlyWithWings()),
                new MuteMallardDuck(new FlyWithWings())
            };
                    
            for(FlyGroup duck : ducks2) {
                duck.performFly();
                duck.display();
            }   
            
            // Ducks that can Fly and Quack
            PerformAllGroup[] ducks3 = {
                new MallardDuck(new HorseQuack(), new FlyWithWings()),
                new RedHeadedDuck(new Quack(), new FlyWithWings())
            };
                    
            for(PerformAllGroup duck : ducks3) {
                duck.performFly();
                duck.performQuack();
                duck.display();
            }   
            
            // Ducks that are just, well Ducks (can display)
            DuckGroup[] ducks4 = {
                new MallardDuck(new HorseQuack(), new FlyWithWings()),
                new RedHeadedDuck(new Quack(), new FlyWithWings()),
                new RubberDuck(new Squeak()),
                new MuteMallardDuck(new FlyRocketPowered()),
                new ModelDuck()
            };
                    
            for(DuckGroup duck : ducks4) {
                duck.display();
            }   
            
	}

}
