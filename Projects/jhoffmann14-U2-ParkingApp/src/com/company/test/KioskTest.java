package com.company.test;
import com.company.Kiosk;

import com.company.Ticket;
import org.junit.Assert;
import org.junit.Test;

public class KioskTest {

    @Test
    //Does not work with Integer.parseInt(keyboard.nextLine()).
    //Will work with setting option = 2 in Kiosk class.
    public void checkInTest(){
        int option = 2;
        boolean lost = true;
        double cost = 25.00;
       Assert.assertEquals(true, Kiosk.checkIn().lost);
     //  Assert.assertTrue("True", Kiosk.checkIn().lost);
    }
}
