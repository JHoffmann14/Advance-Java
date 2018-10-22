package example1;

/**
 * This class is the main startup class for the program. It provides lots
 * of print comments and print statements to explain how the code works. See
 * Main2.java for the same code without the comments.
 *
 * This example simulates two objects -- Jim and Mike -- communicating
 * with each other and playing a game of catch, where they throw and catch
 * a Ball. To do so, the Ball object must be passed from Jim to Mike and back
 * again.
 *
 * @author jlombardo
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Creating ball ....");
        Ball ball = new Ball();

        System.out.println("\nCreating first person (Jim) ...");
        Person jim = new Person("Jim");

        System.out.println("\nCreating second person (Mike) ...");
        Person mike = new Person("Mike");

        System.out.println("\nSetting Jim's collaborator (Mike) ...");
        jim.setCollaborator(mike);

        System.out.println("\nSetting Mike's collaborator (Jim) ...");
        mike.setCollaborator(jim);

        System.out.println("\nBegin game by giving ball to Mike ...");
        mike.catchBall(ball);

        System.out.println("\nNow prove that Mike has ball and Jim does not ...");
        if(mike.hasBall() && !jim.hasBall()) {
            System.out.println("\tChecking ... Mike has the ball and Jim does not");
        }

        // Jim asks Mike to throw ball
        jim.askCollaboratorToThrowBall();

        System.out.println("\nNow prove that Mike has transferred the ball to Jim ...");
        if(jim.hasBall() && !mike.hasBall()) {
            System.out.println("\tChecking ... Jim has the ball and Mike does not");
        }

        // Mike asks Jim to throw ball
        mike.askCollaboratorToThrowBall();

        System.out.println("\nNow prove that Jim has transferred the ball to Mike ...");
        if(mike.hasBall() && !jim.hasBall()) {
            System.out.println("\tChecking ... Mike has the ball and Jim does not");
        }
    }

}
