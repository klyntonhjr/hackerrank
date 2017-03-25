package challenges.datastructures;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

/**
 * Created by nino on 3/25/17.
 */
public class JavaSubarrayTest {
    private final String[] args = null;
    private final ByteArrayOutputStream stdout = new ByteArrayOutputStream();
    private String data, expected;

    @Before
    public void setUp(){
        System.setOut(new PrintStream(stdout));
        data = expected = null;
    }

    @After
    public void tearDown(){
        System.setOut(null);
        stdout.reset();
    }

    @Test
    public void negativeSubarrayTest(){
        data = "5\n" +
                "1 -2 4 -5 1";
        expected = "9\n";

        System.setIn(new ByteArrayInputStream(data.getBytes()));

        JavaSubarray.main(args);

        assertEquals(expected, stdout.toString());
    }
}
