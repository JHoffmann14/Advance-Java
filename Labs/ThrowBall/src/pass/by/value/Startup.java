package pass.by.value;

/**
 * Objects in Java are passed by value. But what is the value? It's the
 * memory address of the object. When passing objects to methods you get a
 * copy of the object's memory address (the value) in the method parameter,
 * which is actually a local variable in that method. One must be careful
 * how these parameters and values are used because the end result isn't 
 * always obvious. See below:
 * 
 * @author jlombardo
 */
public class Startup {
    public static void main(String[] args) {
        // Create two separate person objects, each with it's own
        // memory address stored in the variables p1 and p2
        Person p1 = new Person("Bobby Jones", 56);
        Person p2 = new Person("Sally Smith", 23);

        // verify state of p1
        System.out.println("verifying p1: " + p1.toString());
        
        // change p1 by passing a copy of the memory address (value) to the method
        changePersonName(p1);
        // verify state of p1 has changed. Notice that in this case we
        // modified the original object
        System.out.println("p1 has changed: " + p1.toString());

        // Now try substituting a new Person for p2. It won't work because
        // we're passing a copy of the value (memory address) of p2 which
        // is then stored in the method's parameter. That parameter is then
        // changed to contain something completely different, leaving the 
        // original (p2) unchanged.
        substituteNewPerson(p2);
        // again, has no affect on original because it uses a copy
        System.out.println("verifying p2 has not changed: " + p2.toString());

    }

    public static void substituteNewPerson(Person person) {
        // here a new object is created and stored in the method's local
        // variable 'person'. So this has no effect on the original (p2)
        person = new Person("John Doe", 44);
    }

    public static void changePersonName(Person person) {
        person.setName("New Name"); // value of 'person' points to original, so it's modified
        person = null; // destroying the copy of the value in this method's local
                       // variable 'person" has no effect because only the copy
                       // is destroyed
    }
}
