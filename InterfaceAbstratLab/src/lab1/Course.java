package lab1;

import javax.swing.*;

public class Course {

   String name = "";
   String number = "";
   double credits = 0.0;

   //Course name, number, credits, prequisets
    public void setCourseNumber(String value) {number = value;}
    public void setCredits(double value) {credits = value;}

    public void course(){getName(); getCourseNumber(); getCredits();}

    public String getName() {return name;}
    public String getCourseNumber() {return number;}
    public double getCredits() {return credits;}
}
