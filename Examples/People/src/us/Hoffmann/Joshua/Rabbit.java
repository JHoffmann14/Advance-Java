package us.Hoffmann.Joshua;

public class Rabbit implements Weightable {
    // Assume there are
    @Override
    public void addWeight(double pounds) {
        System.out.println("That is a big Rabbit!!!");
    }

    @Override
    public void loseWeight(double pounds) {
        System.out.println("No hasenpfeffer tonight.");
    }
}
