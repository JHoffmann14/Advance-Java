package us.Hoffmann.Joshua;

import java.util.ArrayList;

public class Startup {


    public static void main(String args[]) {
        ArrayList<Person> club = new ArrayList<>();
        club.add(new Person("Bob","Student",25));
        club.add(new Person("Joe","Jackson", 23));
        club.add(new HealthyPerson("Jill","Jones", 21, 115));
        club.add(new Person("Isaac", "Holems", 30));
        club.add(new HealthyPerson("John","Nells", 50, 175));

        for(Person p: club) {
            System.out.print(p.getFirstName() + " " + p.getLastName() + " " + p.numberOfPeople + "-" + Person.numberOfPeople + ". ");
          dealWithWeight(p);
        }

        Rabbit r1 = new Rabbit();
        Rabbit r2 = new Rabbit();
        dealWithWeight(r2);

    }

    public static void dealWithWeight(Weightable w) {
        w.addWeight(5);
    }
}
