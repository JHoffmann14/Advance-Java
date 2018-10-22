package com.company;

import java.io.*;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Currency;
import java.util.Locale;
import java.util.Scanner;

public class Main {
            //Declare Variables
            static Scanner keyboard = new Scanner(System.in);
            static int option = 0;
            static ArrayList<Ticket> tickets = new ArrayList();

            static double lostTotal = 0;
            static double totalPaid = 0;
            static double total = 0;
            static int lostTickets = 0;
            static int checkInTickets = 0;

            //Print out file of total amounts
    public static void writeToFile(double total, double checkIn, double lost, int lostTickets, int checkInTickets) throws IOException {

           String fileName = "ActivityToDate";

           String str = "";
           BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));

               str = "Best Value Parking Garage\n" +
                       "=========================\n" +
                       "Activity to Date\n\n" +
                       displayCurrency(Locale.US, checkIn) + " was collected from " + checkInTickets + " check Ins\n" +
                       displayCurrency(Locale.US, lost) + " was collected from " + lostTickets + " Lost Tickets\n\n" +
                       displayCurrency(Locale.US, total) + " was collected overall";

           System.out.println(str);
           writer.write(str);

           writer.close();
    }

    //Get information from file
    public static void readFromFile(){
        String fileName = "ActivityToDate";
        String line = null;
        try {
            FileReader fileReader = new FileReader(fileName);

            BufferedReader bufferedReader = new BufferedReader(fileReader);

            while((line = bufferedReader.readLine()) != null){
                if(line.contains("check Ins")){
                    totalPaid = Double.parseDouble(line.substring(1,6).replace(" ", ""));
                    checkInTickets = Integer.parseInt(line.substring(25,27).replace(" ", ""));
                }
                if(line.contains("Lost Tickets")){
                    lostTotal = Double.parseDouble(line.substring(1,6).replace(" " , ""));
                    lostTickets = Integer.parseInt(line.substring(25,27).replace(" ", ""));
                }
                if(line.contains("overall")){
                    total = Double.parseDouble(line.substring(1,6));
                }
                System.out.println(line);
            }

            bufferedReader.close();
        }catch(FileNotFoundException e){
            System.err.println(e.getMessage());
        } catch(IOException e){
            System.err.println(e.getMessage());
        }
    }

    //Change look of double to currency
    public static String displayCurrency(Locale currentLocale, Double amount){
        Currency currentCurrency = Currency.getInstance(currentLocale);
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(currentLocale);
        return currencyFormatter.format(amount);
    }
    public static void main(String[] args) {

        //Display current information
        readFromFile();
        //menu selection
        while(option != 3) {
            System.out.println("Best Value Parking Garage");
            System.out.println("=========================");
            System.out.println("1 - Check/In");
            System.out.println("3 - Close Garage");
            System.out.print("=>");
            //Check to see if it is a valid input
            try {
                option = Integer.parseInt(keyboard.nextLine());
            } catch(NumberFormatException e){

            }
            switch (option) {
                case 1: //check out
                    tickets.add(Kiosk.checkIn());
                    continue;
                case 3: //display and write information to file
                    System.out.println("Best Value Parking Garage");
                    System.out.println("=========================");
                    System.out.println("Activity to Date");
                    System.out.println();


                    // Check to see if there are any tickets from today
                    for(int x=0; x<tickets.size(); x++){
                        if(tickets.get(x).lost == true){
                            lostTotal += tickets.get(x).cost;
                            lostTickets++;
                        } else {
                            totalPaid += tickets.get(x).cost;
                            checkInTickets++;
                        }
                        total = lostTotal + totalPaid;
                }

                    //try to write to file
                    try {
                            writeToFile(total, totalPaid, lostTotal, lostTickets, checkInTickets);
                    } catch(IOException e){
                        System.err.println(e.getMessage());
                    }

                    break;
                default:
                    //tell user to input valid option number
                    System.err.println("Please enter a valid option");
            }
        }
    }
}
