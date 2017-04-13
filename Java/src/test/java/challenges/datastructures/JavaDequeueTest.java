package challenges.datastructures;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

/**
 * Created by nino on 4/12/17.
 */
public class JavaDequeueTest {
    private final String[] args = null;
    private final ByteArrayOutputStream stdout = new ByteArrayOutputStream();
    private String data, expectedOut;

    @Before
    public void setUp(){
        System.setOut(new PrintStream(stdout));
        data = expectedOut = null;
    }

    @After
    public void tearDown(){
        System.setOut(null);
        stdout.reset();
    }

    @Test
    public void twoMaxTest(){
        data = "4 3\n" +
                "5 3 1 2";
        expectedOut = "3\n";
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        JavaDequeue.main(args);
        assertEquals(expectedOut, stdout.toString());
    }

    @Test
    public void hackerrankTestCase0Test(){
        data = "6 3\n" +
                "5 3 5 2 3 2";
        expectedOut = "3\n";
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        JavaDequeue.main(args);
        assertEquals(expectedOut, stdout.toString());
    }
}
