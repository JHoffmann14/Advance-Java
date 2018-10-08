import java.util.ArrayList;
import java.util.Scanner;

public class main {

    private final static FileInput stuff = new FileInput("stuff.csv");
    private final static FileInput places = new FileInput("places.csv");
    private static String line = stuff.fileReadLine();
    private static String line2 = places.fileReadLine();
    public static void main(String args[]) {

      //  String line;
        String[] words;
        String[] words2;
        ArrayList<String> Countries = new ArrayList<String>();
        ArrayList<String> items = new ArrayList<String>();
        int[] nums = new int[2];
      //  String line = stuff.fileReadLine();
        System.out.format("%-18s %6s %6s\n", "Country", "Cities", "Stuff");
        System.out.println("================================");
        while (stuff.fileReadLine() != null && places.fileReadLine() != null){
            words = line.split(",");
            words2 = line2.split(",");
            //System.out.format("%-18s %6s %6s\n", words[0], nums[0], nums[1]);
            findStuff(words[0], nums);
            findCities(words2[0], nums);
            //line = stuff.fileReadLine();
            System.out.format("%-18s %6s %6s\n", words[0], nums[0], nums[1]);
           if(stuff.fileReadLine() == null && places.fileReadLine() == null) {
               line = stuff.fileReadLine();
               line2 = places.fileReadLine();
           }
        }
    }

    public static void findStuff(String acct, int[] nums) {
      //  nums[0] = 0;
        nums[1] = 0;
    //    String line;
        String[] fields = {""};
        boolean done = false;
        int lineNum = 0;
       // System.out.println("Here: " + line);
        if(acct.substring(0).contains("\uFEFF") && lineNum != 0) {
            acct = acct.substring(1, acct.length());
        }
       //fields[0] = fields[0].substring(1, fields[0].length());
        while (!(done)) {
       // while ((line = stuff.fileReadLine()) != null) {
          //  line = stuff.fileReadLine();
            if(line != null) {

               fields = line.split(",");
             //  line = stuff.fileReadLine();

            }
          /*  acct = acct.substring(1, acct.length());
            fields[0] = fields[0].substring(1, fields[0].length());*/
           boolean comp = fields[0].toLowerCase().equals(acct.toLowerCase());
            if (fields[0].toLowerCase().equals(acct.toLowerCase()) != true) {
           //     fields[0] = fields[0].substring(1, fields[0].length());
                if(fields[0].toLowerCase().equals(acct.toLowerCase()) != true) {
                    done = true;
                } else {nums[1] += 1; line = stuff.fileReadLine();}

            } else if (fields[0].equals(acct)) {
              //  nums[0]++;
                nums[1] += 1;
                line = stuff.fileReadLine();
                //line = stuff.fileReadLine();
            }

        }

      //  System.out.format("%-18s %6s %6s\n", fields[0], nums[0], nums[1]);
    }

    public static void findCities(String acct, int[] nums) {
       // stuff.fileClose();
        nums[0] = 0;
      //  nums[1] = 0;
        //    String line;
        String[] fields = {""};
        boolean done = false;
        int lineNum = 0;
        // System.out.println("Here: " + line);
        if(acct.substring(0).contains("\uFEFF") && lineNum != 0) {
            acct = acct.substring(1, acct.length());
        }
        //fields[0] = fields[0].substring(1, fields[0].length());
        while (!(done)) {
            // while ((line = stuff.fileReadLine()) != null) {
            //  line = stuff.fileReadLine();
            if(line2 != null) {

                fields = line2.split(",");


            }
          /*  acct = acct.substring(1, acct.length());
            fields[0] = fields[0].substring(1, fields[0].length());*/
            boolean comp = fields[0].toLowerCase().equals(acct.toLowerCase());
            if (fields[0].toLowerCase().equals(acct.toLowerCase()) != true) {
          //      fields[0] = fields[0].substring(1, fields[0].length());
                if(fields[0].toLowerCase().equals(acct.toLowerCase()) != true) {
                    done = true;
                } else {nums[0] += 1; line2 = places.fileReadLine();}

            } //else if (places.fileReadLine() == null) { done = true;}
            else if (fields[0].equals(acct)) {
                nums[0]++;
                line2 = places.fileReadLine();
                //nums[1] += 1;
                //line = stuff.fileReadLine();
            }

        }

        //  System.out.format("%-18s %6s %6s\n", fields[0], nums[0], nums[1]);
    }
}
