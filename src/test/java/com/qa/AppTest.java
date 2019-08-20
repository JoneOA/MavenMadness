package com.qa;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
   private App app;

   @Test
   public void mainTest(){
           app = new App();
           String[] input = {"a"};
           app.main(input);
    }

    @Test
    public void simpleTest() {
       app = new App();
       assertEquals(app.simpleMethod(1,2), 1);
    }

    @Test
    public void winnerTest() {
       assertEquals(Blackjack.compareValues(21,17), 21);
       assertEquals(Blackjack.compareValues(16,18), 18);
       assertEquals(Blackjack.compareValues(22,18), 18);
       assertEquals(Blackjack.compareValues(21,100), 21);
    }

    @Test
    public void newCardTest() {
       assertNotNull(Blackjack.newCard());
    }
}
