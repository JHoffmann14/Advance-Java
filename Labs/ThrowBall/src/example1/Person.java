package example1;

/**
 * This class represents a software abstraction of a real person. Notice that
 * Jim inherits all the methods and properties of the super class 'Person'
 *
 * @author jlombardo
 */
public class Person {
    private String name;
    private Ball ball;
    private Person collaborator;

    public Person(String name) {
        this.name = name;
    }

    public Person getCollaborator() {
        return collaborator;
    }

    public void setCollaborator(Person collaborator) {
        this.collaborator = collaborator;
    }

    /**
     * To play catch a person must ask a collaborator to throw the ball.
     * Notice how we ask this person to 'throwTheBall' .. by calling that
     * method on the collaborator object.
     */
    public void askCollaboratorToThrowBall() {
        System.out.println("\n" + this.toString() + " asks "
                + collaborator.toString() + " to throw him the ball");
        collaborator.throwTheBall();
    }

    /**
     * This method simulates catching and holding a real ball. Notice the
     * ball object is stored in the current object's ball property.
     *
     * @param ball - the ball to be caught.
     */
    public void catchBall(Ball ball) {
        this.ball = ball;
    }

    /**
     * This method simulates the current person throwing a ball. Notice that
     * the ball is thrown to a collaborator, and once this is done, the ball
     * property for the current person is nulled out. This simulates the current
     * person not having the ball because it was thrown to the collaborator.
     */
    public void throwTheBall() {
        collaborator.catchBall(ball);
        this.ball = null;
    }

    /**
     * Determine if the current person has the ball.
     *
     * @return true if current person has the ball; false otherwise.
     */
    public boolean hasBall() {
        boolean hasBall = false;

        if (ball != null) {
            hasBall = true;
        }

        return hasBall;
    }

    /**
     * This method is inherited from the 'Object' class and is overridden
     * to provide the name of the object.
     *
     * @return the name of the object
     */
    @Override
    public String toString() {
        return name;
    }
}
