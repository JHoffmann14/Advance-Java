package us.mattgreen;

import java.util.Scanner;

public class Main {

    private final static FileInput meals = new FileInput("meals_data.csv");

    public static void main(String[] args) {
        String line;
        String[] fields;
        double average = 0;
        int total = 0;
        int count = 0;
        int grandTotal = 0;
        int grandCount = 0;
        String oldMealType="NA";
        System.out.format("%-15s  %-15s\n","Meal Type", "Average Calories");
        System.out.format("%-15s  %-15s\n","==============", "===============");
        while ((line = meals.fileReadLine()) != null) {
            fields = line.split(",");
            if (!oldMealType.equals(fields[0])) {
                if (!oldMealType.equals("NA")) {
                    average = total / (double)count;
                    System.out.format("%-20s %4.2f\n",oldMealType, average);
                }
                oldMealType=fields[0];
                count = 0;
                total = 0;
            }
            total += Integer.parseInt(fields[2]);
            count++;
            grandTotal += Integer.parseInt(fields[2]);
            grandCount++;
        }
        average = total / count;
        double totalAverage = grandTotal / (double)grandCount;
        System.out.format("%-20s %4.2f\n",oldMealType, average);
        System.out.format("%-15s  %-15s\n","==============", "===============");
        System.out.format("%-20s %4.2f\n","Grand Total", totalAverage);
    }
}