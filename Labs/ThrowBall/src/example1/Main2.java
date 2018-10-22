package example1;

/**
 * This class is an alternate startup class. It is the same as Main.java
 * but without the comments so you can see the code more easily without the
 * noise of those comments.
 *
 * IMPORTANT: This class is not recognized automatically as a startup class,
 * so you can't run it by clicking the green run arrow on the toolbar.
 * Instead you must right-click your mouse on this file and select 'Run'
 * from the popup menu.
 *
 * @author jlombardo
 */
public class Main2 {

    public static void main(String[] args) {

        Ball ball = new Ball();
        Person jim = new Person("Jim");
        Person mike = new Person("Mike");

        jim.setCollaborator(mike);
        mike.setCollaborator(jim);

        mike.catchBall(ball);

        if(mike.hasBall() && !jim.hasBall()) {
            System.out.println("Game begins ... Mike has the ball and Jim does not");
        }

        jim.askCollaboratorToThrowBall();

        if(jim.hasBall() && !mike.hasBall()) {
            System.out.println("\nAfter first throw ... Jim has the ball and Mike does not");
        }

        mike.askCollaboratorToThrowBall();

        if(mike.hasBall() && !jim.hasBall()) {
            System.out.println("\nAfter second throw ... Mike has the ball and Jim does not");
        }
   }

}
