package dip.lab1.student.solution1;

/**
 * An implementation sub-class of an Employee. These are low-level classes
 * in the DIP. Does it meet the rules of DIP? If not fix it.
 *
 * @author your name goes here
 */
public class HourlyEmployee implements Employee {

    private double hourlyRate;
    private double totalHrsForYear;
    /** default constructor. Is this the best way to go? */
    //public HourlyEmployee() {}

    /**
     * Convenience constructor. Is this the best way to go?
     * @param hourlyRate - the rate per hour that the employee is paid
     * @param totalHrsForYear - total hours worked or predicted per year
     */
    public HourlyEmployee(double hourlyRate, double totalHrsForYear) {
        setHourlyRate(hourlyRate);
        setTotalHrsForYear(totalHrsForYear);
    }

    public final double getAnnualWage() {return hourlyRate * totalHrsForYear;}
    public final double getHourlyRate() {
        return hourlyRate;
    }
   /* public final double getTotalHrsForYear(){
        return TotalHrsForYear();
    }*/

    public void setHourlyRate(double hourlyRate) {
        if(hourlyRate < 0 || hourlyRate > 500){
            try {
                throw IllegalArgumentExcetpion();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        this.hourlyRate = hourlyRate;
    }

    private Exception IllegalArgumentExcetpion() {
        return null;
    }

    public final void setTotalHrsForYear(double totalHrsForYear) {
        if(totalHrsForYear < 0 || totalHrsForYear > 5000) {
            throw new IllegalArgumentException();
        }
        this.totalHrsForYear = totalHrsForYear;
    }

    @Override
    public double getAnnualWages() {
        return 0;
    }
}
