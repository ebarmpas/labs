import static org.junit.Assert.*;
import org.junit.Test;

/* The name of the class should be descriptive of the class I am testing
   (TestNumberMethods tells me we plan to test the NumberMethods class)
*/
public class TestStringMethods {

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
    public void testAppearsIn() {
        assertEquals(false, StringMethods.appearsIn("Vaggelis", 'b'));
        assertEquals(true, StringMethods.appearsIn("Vaggelis", 'e'));
        assertEquals(true, StringMethods.appearsIn("Vaggelis", 'g'));

    }

    @Test
    public void testFindOccurences(){
        assertEquals(0, StringMethods.findOccurences("Vaggelis", 'b'));
        assertEquals(1, StringMethods.findOccurences("Vaggelis", 'e'));
        assertEquals(10, StringMethods.findOccurences("AAAAAAAAAA", 'A'));
    }

    //I can't test displayManyTimes since it's a void method, thus not returning anything.
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