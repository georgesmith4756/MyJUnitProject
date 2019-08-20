package com.qa;

import static org.junit.Assert.assertEquals;
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
    }

    @Test
    public void simpleTest(){
        app = new App();
        String returnedString = app.returnString("Hello", "Bye");
        assertTrue(returnedString, returnedString == "Hello" || returnedString =="Bye");
    }
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
}
