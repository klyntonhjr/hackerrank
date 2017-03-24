package challenges.bignumber;

import challenges.bignumber.JavaPrimality;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

/**
 * Created by nino on 3/21/17.
 */
public class JavaPrimalityTest {
    private final String[] args = null;
    private ByteArrayOutputStream stdout = new ByteArrayOutputStream();
    private String data, expected;

    @Before
    public void setUp(){
        System.setOut(new PrintStream(stdout));
        data = null;
        expected = null;
    }

    @After
    public void tearDown(){
        System.setOut(null);
        stdout.reset();
    }

    @Test
    public void oneIsNotAPrimeTest(){
        data = "1";
        expected = "not prime\n";

        System.setIn(new ByteArrayInputStream(data.getBytes()));

        JavaPrimality.main(args);

        assertEquals(expected, stdout.toString());
    }

    @Test
    public void twoIsAPrimeTest(){
        data = "2";
        expected = "prime\n";

        System.setIn(new ByteArrayInputStream(data.getBytes()));

        JavaPrimality.main(args);

        assertEquals(expected, stdout.toString());
    }

    @Test
    public void smallPrimeTest(){
        data = "11";
        expected = "prime\n";

        System.setIn(new ByteArrayInputStream(data.getBytes()));

        JavaPrimality.main(args);

        assertEquals(expected, stdout.toString());
    }

    @Test
    public void largePrimeTest(){
        data = "67,280,421,310,721";
        expected = "prime\n";

        System.setIn(new ByteArrayInputStream(data.getBytes()));

        JavaPrimality.main(args);

        assertEquals(expected, stdout.toString());
    }
}
