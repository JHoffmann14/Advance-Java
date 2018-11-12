package version7;

public class MuteQuack implements QuackBehavior {

	public void quack() {
		System.out.println("<< Silence >>");
	}

    public String toString() {
        return "Mute";
    }

}
