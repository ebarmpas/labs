import static org.junit.Assert.*;
import org.junit.Test;

/* The name of the class should be descriptive of the class I am testing
   (TestNumberMethods tells me we plan to test the NumberMethods class)
*/
public class TestGradeMethods {

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

    //PromptForGrade can't be automatically tested since it requires input from the user.

    @Test
    public void testIsPassGrade(){

        assertTrue(GradeMethods.isPassGrade(100));
        assertTrue(GradeMethods.isPassGrade(77));
        assertTrue(GradeMethods.isPassGrade(41));
        assertTrue(GradeMethods.isPassGrade(40));
        assertFalse(GradeMethods.isPassGrade(39));
        assertFalse(GradeMethods.isPassGrade(33));
        assertFalse(GradeMethods.isPassGrade(0));

        //testing for all edge cases and one "normal" case on each side
    }

    @Test
    public void testIsFirstClass(){

        assertTrue(GradeMethods.isFirstClass(100));
        assertTrue(GradeMethods.isFirstClass(77));
        assertTrue(GradeMethods.isFirstClass(71));
        assertTrue(GradeMethods.isFirstClass(70));
        assertFalse(GradeMethods.isFirstClass(69));
        assertFalse(GradeMethods.isFirstClass(53));
        assertFalse(GradeMethods.isFirstClass(0));

        //testing for all edge cases and one "normal" case on each side
    }

    @Test
    public void testFindClassification(){

        assertEquals("Class I", GradeMethods.findClassification(100));
        assertEquals("Class I", GradeMethods.findClassification(80)); //Average case
        assertEquals("Class I", GradeMethods.findClassification(71));
        assertEquals("Class I", GradeMethods.findClassification(70));

        assertEquals("Class II.i", GradeMethods.findClassification(69));
        assertEquals("Class II.i", GradeMethods.findClassification(65)); //Average case
        assertEquals("Class II.i", GradeMethods.findClassification(61));
        assertEquals("Class II.i", GradeMethods.findClassification(60));

        assertEquals("Class II.ii", GradeMethods.findClassification(59));
        assertEquals("Class II.ii", GradeMethods.findClassification(55)); //Average case
        assertEquals("Class II.ii", GradeMethods.findClassification(51));
        assertEquals("Class II.ii", GradeMethods.findClassification(50));

        assertEquals("Class III", GradeMethods.findClassification(49));
        assertEquals("Class III", GradeMethods.findClassification(48)); //Average case
        assertEquals("Class III", GradeMethods.findClassification(46));
        assertEquals("Class III", GradeMethods.findClassification(45));

        assertEquals("Pass", GradeMethods.findClassification(44));
        assertEquals("Pass", GradeMethods.findClassification(43)); //Average case
        assertEquals("Pass", GradeMethods.findClassification(41));
        assertEquals("Pass", GradeMethods.findClassification(40));

        assertEquals("Fail", GradeMethods.findClassification(39));
        assertEquals("Fail", GradeMethods.findClassification(20));
        assertEquals("Fail", GradeMethods.findClassification(2));
        assertEquals("Fail", GradeMethods.findClassification(1));

        assertEquals("Work didn't get submitted or is not worth of assessment", GradeMethods.findClassification(0));

    }

    @Test
    public void testCalculateFinalGrade(){
        assertEquals(100, GradeMethods.calculateFinalGrade(100, 100), DELTA); //both max
        assertEquals(85, GradeMethods.calculateFinalGrade(50, 100), DELTA); // normal and max
        assertEquals(70, GradeMethods.calculateFinalGrade(0, 100), DELTA); // min and max
        assertEquals(65, GradeMethods.calculateFinalGrade(100, 50), DELTA); //max and normal
        assertEquals(64, GradeMethods.calculateFinalGrade(50, 70), DELTA); //both normal
        assertEquals(30, GradeMethods.calculateFinalGrade(100, 0), DELTA); // max and min
        assertEquals(0, GradeMethods.calculateFinalGrade(0, 0), DELTA); // both min
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