package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner keyboard = new Scanner(System.in);
	    System.out.println("Please enter the city of your favorite Team: ");
	    String team = keyboard.nextLine();
	    Cities teamCity;
	    switch(team.substring(0,3).toLowerCase()) {
            case "chi": teamCity = Cities.CHICAGO;break;
            case "gre": teamCity = Cities.GREEN;break;
            case "det": teamCity = Cities.DETRIOT;break;
            case "min": teamCity = Cities.MINN;break;
            default: teamCity = Cities.GREEN;
        }

	    System.out.println(Namer.getName(teamCity));
    }
}
