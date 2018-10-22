package com.company;

import java.sql.Time;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Kiosk {
        static Scanner keyboard = new Scanner(System.in);


    //Random times during day
    public static int[] randomParkingHours(){
        int[] parking = new int[3];
        final Random random = new Random();
        final int millisInDay = 24*60*60*1000;
        Time time = new Time((long)random.nextInt(millisInDay));
        Time time1 = new Time((long)random.nextInt(millisInDay));
        int hour = time.getHours();
        int hour1 = time1.getHours();
        if (hour < hour1){
            parking[0] = hour;
            parking[1] = hour1;
        } else {
            parking[0] = hour1;
            parking[1] = hour;
        }
        parking[2] = Math.abs(hour-hour1);
        return parking;
    }

    public static int getRandomIntegerID(int min, int max){
        int x = (int)(Math.random()*((max-min)+1));
        return x;
    }

    public static String displayCurrency( Locale currentLocale,Double amount){
        Currency currentCurrency = Currency.getInstance(currentLocale);
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(currentLocale);
        return currencyFormatter.format(amount);
    }


    public static Ticket checkIn(){


        Ticket ticket = new Ticket();
        int option = 0;
        String daytime;
        String daytime1;

            System.out.println("Best Value Parking Garage");
            System.out.println("=========================");
            System.out.println("1 - Check/Out");
            System.out.println("2 - Lost Ticket");
            System.out.print("=>");
            option = Integer.parseInt(keyboard.nextLine());
            switch (option) {
                case 1: //Have a ticket and are checking out with random amount of time
                    int[] parking = randomParkingHours();
                    ticket.hours = parking[2];

                    ticket.ID = getRandomIntegerID(99, 1000);
                    ticket.name = String.valueOf(ticket.hours);
                    ticket.cost = Ticket.setCost(ticket.hours);


                    if(ticket.hours == 0){
                        return null;
                    }

                    // Set to 12 hour clock
                    if(parking[0] < 12){
                        daytime = "am";
                    }
                    else { parking[0] = Math.abs(parking[0] % 12); daytime = "pm"; }
                    if(parking[1] < 12){
                        daytime1 = "am" ;
                    } else { parking[1] = Math.abs(parking[1] % 12); daytime1 = "pm"; }

                     if(parking[0] == 0){
                        parking[0] = 12;
                    }
                    if(parking[1] == 0){
                        parking[1] = 12;
                    }
                    //Display ticket information
                    System.out.println("Best Value Parking Garage");
                    System.out.println("=========================");
                    System.out.println("Receipt for a vehicle id " + ticket.name);
                    System.out.println();
                    System.out.println(ticket.hours + " hour(s) parked " + parking[0] + daytime + " - " + parking[1] + daytime1);
                    System.out.println(displayCurrency(Locale.US, ticket.cost));
                    break;
                case 2: //Lost ticket
                    ticket.ID = getRandomIntegerID(99, 1000);
                    ticket.name = String.valueOf(ticket.ID);
                    ticket.cost = 25.00;
                    ticket.lost = true;

                    //Display ticket Information
                    System.out.println("BestValue Parking Garage");
                    System.out.println("========================");
                    System.out.println("Receipt for a vehicle id "+ ticket.name);
                    System.out.println();
                    System.out.println("Lost Ticket");
                    System.out.println(displayCurrency(Locale.US, ticket.cost));
                    break;
                default:// default
                    System.out.println("Please enter a valid option.");
            }
        return ticket;
    }
}
