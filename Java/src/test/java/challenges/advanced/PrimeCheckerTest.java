package challenges.advanced;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

/**
 * Created by nino on 4/15/17.
 */
public class PrimeCheckerTest {
    private final String[] args = null;
    private final ByteArrayOutputStream stdout = new ByteArrayOutputStream();
    private String data, expectOut;

    @Before
    public void setUp(){
        System.setOut(new PrintStream(stdout));
        data = expectOut = null;
    }

    @After
    public void tearDown(){
        System.setOut(null);
        stdout.reset();
    }

    @Test
    public void primeChecker2Test(){
        data = "2\n" +
                "1\n" +
                "3\n" +
                "4\n" +
                "5";
        expectOut = "2 \n" +
                "2 \n" +
                "2 3 \n" +
                "2 3 5 \n";
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        PrimeChecker.main(args);
        assertEquals(expectOut, stdout.toString());
    }
}
