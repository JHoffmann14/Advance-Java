package com.company;

public class Ticket {
    //Declare variables
    public int hours;
    public int ID;
    public double cost;
    public static int overtime = 3;
    public String name;
    public boolean lost;

    public static double parking = 5.00;

    //Calculate the cost of the ticket
    public static double CalculateCost(int hours){
        double total = 0;
        total += parking;
        if(hours > overtime){
            total += (1.00 * (hours-overtime));
        }
        return total;
    }

    public Ticket getTicket(Ticket ticket){
        ticket.name = String.valueOf(ticket.getID());
        return ticket;
    }

    // get ticket ID
    public int getID() { return ID;}

    //Set cost of ticket
    public static double setCost(int hours){
        double total = CalculateCost(hours);
        return total;
    }

}
