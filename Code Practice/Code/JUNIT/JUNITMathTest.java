
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Blake
 */

// This is a simple math test of JUnit

public class JUNITMathTest {
    
    @Test
    public void mathTest() {
        JUNITMath test = new JUNITMath();
 
        int result = test.math(54, 2, 7, 2);
 
        assertEquals(1, result);
 
    }
}
