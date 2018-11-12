package dip.lab2.student.solution1;

// An useful import if you need it.

// Another useful import if you need it.


import java.util.ArrayList;
import java.util.List;

/**
 * Just a test class for input and output.
 *
 * 1. Create instances of low-level classes using Liskov Substitution principle.
 * 2. Create an instance of your high-level class.
 * 3. Pass one of your calculator instances to the high-level class and
 *    check the results.
 * 4. Now switch to a different calculator instance and pass that to the
 *    high-level class. Did it work? Are the low-level instances
 *    interchangeable? The DIP requires this.
 * 
 * @author your name goes here
 */
public class Startup {
 
    public static void main(String[] args) {
        List<Tipable> tipsToPay = new ArrayList<>();
        tipsToPay.add(new FoodServiceTipCalculator(ServiceQuality.FAIR, 123.23));
        tipsToPay.add(new BaggageServiceTipCalculator(ServiceQuality.POOR, 9));
        tipsToPay.add(new FoodServiceTipCalculator(ServiceQuality.GOOD, 140.28));
        tipsToPay.add(new BaggageServiceTipCalculator(ServiceQuality.GOOD, 5));

        double total = 0;
        for(Tipable t : tipsToPay){
            System.out.println("Tip amount $" + t.getTip());
            total+=t.getTip();
        }

        System.out.println("Total Amount $" + total);
    }

}
