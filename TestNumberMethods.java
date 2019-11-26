import static org.junit.Assert.*;
import org.junit.Test;

/* The name of the class should be descriptive of the class I am testing
   (TestNumberMethods tells me we plan to test the NumberMethods class)
*/
public class TestNumberMethods{

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
	public void testMinimumInt() {

		assertEquals(2, NumberMethods.minimumInt(2, 3));
		assertEquals(2, NumberMethods.minimumInt(3, 2));
		assertEquals(5, NumberMethods.minimumInt(5, 5));
		
		assertEquals(0, NumberMethods.minimumInt(0, 0));
		assertEquals(0, NumberMethods.minimumInt(0, 3));
		assertEquals(-3, NumberMethods.minimumInt(0, -3));

		assertEquals(-1, NumberMethods.minimumInt(-1, 5));
		assertEquals(-4, NumberMethods.minimumInt(-4, -2));
		assertEquals(-2, NumberMethods.minimumInt(-2, -2));

		assertEquals(-6, NumberMethods.minimumInt(3, -6));

	}

	@Test
	public void testMaximumDouble(){
		assertEquals(3.4, NumberMethods.maximumDouble(2.3, 3.4), DELTA);
		assertEquals(2.5, NumberMethods.maximumDouble(-3.1, 2.5), DELTA);

		assertEquals(0, NumberMethods.maximumDouble(0, 0), DELTA);
		assertEquals(4.24, NumberMethods.maximumDouble(0, 4.24), DELTA);
		assertEquals(0, NumberMethods.maximumDouble(-4.3, 0), DELTA);

		assertEquals(-3.4, NumberMethods.maximumDouble(-4.3, -3.4), DELTA);
	}

	@Test
	public void testIsEven(){

		assertTrue(NumberMethods.isEven(0));
		assertFalse(NumberMethods.isEven(5));
		assertFalse(NumberMethods.isEven(7));
		assertTrue(NumberMethods.isEven(4));
		assertTrue(NumberMethods.isEven(-2));
		assertFalse(NumberMethods.isEven(-37));

	}

	@Test
	public void testMaximumInt(){
		assertEquals(2, NumberMethods.minimumInt(2, 3));
		assertEquals(2, NumberMethods.minimumInt(3, 2));
		assertEquals(5, NumberMethods.minimumInt(5, 5));
		
		assertEquals(0, NumberMethods.minimumInt(0, 0));
		assertEquals(0, NumberMethods.minimumInt(0, 3));
		assertEquals(-3, NumberMethods.minimumInt(0, -3));

		assertEquals(-1, NumberMethods.minimumInt(-1, 5));
		assertEquals(-4, NumberMethods.minimumInt(-4, -2));
		assertEquals(-2, NumberMethods.minimumInt(-2, -2));

		assertEquals(-6, NumberMethods.minimumInt(3, -6));

	}

	@Test
	public void testMinimumDouble(){

		assertEquals(3.4, NumberMethods.maximumDouble(2.3, 3.4), DELTA);
		assertEquals(2.5, NumberMethods.maximumDouble(-3.1, 2.5), DELTA);

		assertEquals(0, NumberMethods.maximumDouble(0, 0), DELTA);
		assertEquals(4.24, NumberMethods.maximumDouble(0, 4.24), DELTA);
		assertEquals(0, NumberMethods.maximumDouble(-4.3, 0), DELTA);

		assertEquals(-3.4, NumberMethods.maximumDouble(-4.3, -3.4), DELTA);

	}
	@Test
	public void testMedian(){

		assertEquals(2, NumberMethods.median(1,2,3));
		assertEquals(0, NumberMethods.median(0,0,0));
		assertEquals(-2, NumberMethods.median(-1,-2,-3));

	}
	@Test
	public void testAverage(){
		assertEquals(0, NumberMethods.average(0,0,0,0,0), DELTA);

		assertEquals(1, NumberMethods.average(1,1,1,1,1), DELTA);

		assertEquals(3, NumberMethods.average(1,2,3,4,5), DELTA);
	}

	@Test
	public void testSumEvenNumbersUpTo(){
		assertEquals(0, NumberMethods.sumEvenNumbersUpTo(0));
		assertEquals(0, NumberMethods.sumEvenNumbersUpTo(1));
		assertEquals(2, NumberMethods.sumEvenNumbersUpTo(2));
		assertEquals(6, NumberMethods.sumEvenNumbersUpTo(4));

	}

	@Test
	public void testPercentage(){
		assertEquals(40, NumberMethods.percentage(40,100), DELTA);
		assertEquals(30, NumberMethods.percentage(15,50 ), DELTA);
		assertEquals(120.37, NumberMethods.percentage(65, 54), DELTA);
	}

	@Test
	public void testSolveEquation(){

		assertEquals(-2, NumberMethods.solveEquation(5, 10), DELTA);
		assertEquals(3.333, NumberMethods.solveEquation(3, -10), DELTA);
		assertEquals(0, NumberMethods.solveEquation(10, 0), DELTA);
		assertEquals(0, NumberMethods.solveEquation(0, 5), DELTA);
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