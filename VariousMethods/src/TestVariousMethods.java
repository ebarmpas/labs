import static org.junit.Assert.*;
import org.junit.Test;

import java.util.concurrent.atomic.DoubleAccumulator;

/* The name of the class should be descriptive of the class I am testing
   (TestNumberMethods tells me we plan to test the NumberMethods class)
*/
public class TestVariousMethods{

    //DELTA is the acceptable loss of precision when testing for double values
    private static final double DELTA = 0.01;

	/* IMPORTANT NOTE:
	   Tests that are not preceded by the @Test annotation are not run!
	   Include it before all test methods
	   OR include it selectively when you only want to run particular tests
	*/

    /* The name of each method should be descriptive of the method I am testing
       (TestMinimumInt tells me we plan to test the minimumInt method)
    */

    @Test
    public void testStringAsMonth(){
        assertEquals("January",VariousMethods.monthAsString(1)); //Testing for all possible wanted cases
        assertEquals("February",VariousMethods.monthAsString(2));
        assertEquals("March",VariousMethods.monthAsString(3));
        assertEquals("April",VariousMethods.monthAsString(4));
        assertEquals("May",VariousMethods.monthAsString(5));
        assertEquals("June",VariousMethods.monthAsString(6));
        assertEquals("July",VariousMethods.monthAsString(7));
        assertEquals("August",VariousMethods.monthAsString(8));
        assertEquals("September",VariousMethods.monthAsString(9));
        assertEquals("October",VariousMethods.monthAsString(10));
        assertEquals("November",VariousMethods.monthAsString(11));
        assertEquals("December",VariousMethods.monthAsString(12));
        assertEquals("",VariousMethods.monthAsString(13)); //Edge value
        assertEquals("",VariousMethods.monthAsString(0)); //Edge value
        assertEquals("",VariousMethods.monthAsString(-5)); //Random negative value
        assertEquals("",VariousMethods.monthAsString(35)); //Random positive value
    }

    @Test
    public void testIsLeapYear(){

        assertTrue(VariousMethods.isLeapYear(0));
        assertTrue(VariousMethods.isLeapYear(2020));
        assertTrue(VariousMethods.isLeapYear(-2020));

        assertFalse(VariousMethods.isLeapYear(1));
        assertFalse(VariousMethods.isLeapYear(2019));
        assertFalse(VariousMethods.isLeapYear(-1));
        assertFalse(VariousMethods.isLeapYear(-43));
        //Leap years were not used that back but the instructions said to simply check whether the lear is a leap year, so I assumed that we would measure by modern standards.
    }

    @Test
    public void testFahrenheitToCelsius(){

        assertEquals(-17.777778, VariousMethods.fahrenheitToCelsius(0), DELTA);
        assertEquals(0, VariousMethods.fahrenheitToCelsius(32), DELTA);
        assertEquals(-5, VariousMethods.fahrenheitToCelsius(23), DELTA);
        assertEquals(-26.111111, VariousMethods.fahrenheitToCelsius(-15), DELTA);
    }

    @Test
    public void testCelsiusToFahrenheit(){
        assertEquals(32, VariousMethods.celsiusToFahreinheit(0), DELTA);
        assertEquals(23, VariousMethods.celsiusToFahreinheit(-5), DELTA);
        assertEquals(78.8, VariousMethods.celsiusToFahreinheit(26), DELTA);
        assertEquals(-149.8, VariousMethods.celsiusToFahreinheit(-101), DELTA);

    }
}

/*
	SETTING THE CLASSPATH TEMPORARILY:
	set classpath=%classpath%;c:\junit\hamcrest-core-1.3.jar;c:\junit\junit-4.12.jar;.

	RUNNING JUnit TESTS
	First compile your test file:
	javac <TestFileName>.java

	and then run:
	java org.junit.runner.JUnitCore <TestFileName>
*/