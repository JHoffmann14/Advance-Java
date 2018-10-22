package com.company.test;
import com.company.Ticket;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TicketTest {


    @Test
    public void setCost(){
        int hours = 10;
        double paid = 12.00;
        Assert.assertEquals(paid, Ticket.setCost(hours),0);

        hours = 3;
        paid = 5.10;
        Assert.assertEquals(paid, Ticket.setCost(hours),0);
    }
}
