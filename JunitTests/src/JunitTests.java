/**
 * * Created by vladimir.stepanov on 07.09.2016.
 */
import org.junit.Test;
import static org.junit.Assert.assertEquals;

// Tests for method pow1
public class JunitTests {
    Exponentiation testClass = new Exponentiation();
    @Test
     public void testFunctionPow1PositiveNumber(){
            assertEquals("2 exp 3 must be 8", 8, testClass.pow(2, 3));
        }

    @Test
    public void testFunctionPow1NegativeNumber(){
        assertEquals("-2 exp 3 must be -8", -8, testClass.pow(-2, 3));
    }

    @Test
    public void testFunctionPow1ZeroNumber(){
        assertEquals("0 exp 3 must be 0", 0, testClass.pow(0, 3));
    }

    @Test
    public void testFunctionPow1ZeroExtent(){
        assertEquals("3 exp 0 must be 1", 1, testClass.pow(3, 0));
    }

    @Test
    public void testFunctionPowFirstExtent(){
        assertEquals("3 exp 1 must be 3", 3, testClass.pow(3, 1));
    }


// Tests for method pow2
    @Test
    public void testFunctionPow2PositiveNumber(){
        assertEquals("2 exp 3 must be 8", 8, testClass.pow2(2, 3));
    }

    @Test
    public void testFunctionPow2NegativeNumber(){
        assertEquals("-2 exp 3 must be -8", -8, testClass.pow2(-2, 3));
    }

    @Test
    public void testFunctionPow2ZeroNumber(){
        assertEquals("0 exp 3 must be 0", 0, testClass.pow2(0, 3));
    }

    @Test
    public void testFunctionPow2ZeroExtent(){
        assertEquals("3 exp 0 must be 1", 1, testClass.pow2(3, 0));
    }

    @Test
    public void testFunctionPow2FirstExtent(){
        assertEquals("3 exp 1 must be 3", 3, testClass.pow2(3, 1));
    }
}
