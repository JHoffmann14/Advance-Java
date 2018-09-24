package us.Hoffmann.Joshua;

public class HealthyPerson extends Person {
    private int weight;

    public HealthyPerson(String firstName, String lastName, int age, int weight) {
        super(firstName, lastName, age);
        this.weight = weight;
    }

    @Override
    public void addWeight(double pounds){
        weight+=pounds;
        System.out.println("I now weigh " + weight);
    }
    @Override
    public void loseWeight(double pounds){
        weight-=pounds;
        System.out.println("I now weigh " + weight + ". Now bring me some kale");
    }

}
