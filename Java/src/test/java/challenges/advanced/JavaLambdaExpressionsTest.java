package challenges.advanced;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

/**
 * Created by nino on 4/16/17.
 */
public class JavaLambdaExpressionsTest {
    MyMath m;

    @Before
    public void setUp(){
        m = new MyMath();
    }

    @Test
    public void isOddTest() {
        assertEquals(true, m.is_odd.check(2));
    }

    @Test
    public void isPrimeTest() {
        assertEquals(true, m.is_prime.check(5));
    }

    @Test
    public void isPalindromeTest() {
        assertEquals(true, m.is_palindrome.check(585));
    }

    @Test
    public void hackerranckCase0Test() throws IOException {
        ByteArrayOutputStream stdout = new ByteArrayOutputStream();
        String data, expectedOut;
        data = "5\n" +
                "1 4\n" +
                "2 5\n" +
                "3 898\n" +
                "1 3\n" +
                "2 12";
        expectedOut = "EVEN\n" +
                "PRIME\n" +
                "PALINDROME\n" +
                "ODD\n" +
                "COMPOSITE\n";
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        System.setOut(new PrintStream(stdout));
        JavaLambdaExpressions.main(null);
        assertEquals(expectedOut, stdout.toString());
    }
}
