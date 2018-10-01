package us.Hoffmann.Joshua;

public class Person implements Weightable{

    private String firstName;
    private String lastName;
    private int age;
    public static int numberOfPeople = 0;

    public Person(String firstName, String lastName, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        numberOfPeople++;
        printThis();
    }

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }


    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }


    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
    @Override
    public void addWeight(double pounds){
        System.out.println("Not your bussiness but I add some weight");
    }
    @Override
    public void loseWeight(double pounds){
        System.out.println("Not your bussiness but I lost some weight");
    }

    public final void printThis(){
        System.out.println("person");
    }
}
