package challenges.datastructures;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

/**
 * Created by nino on 3/24/17.
 */
public class Java2DArrayTest {
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
        System.setIn(null);
        System.setOut(null);
        stdout.reset();
    }

    @Test
    public void hourGlassTest(){
        data = "1 1 1 0 0 0\n" +
                "0 1 0 0 0 0\n" +
                "1 1 1 0 0 0\n" +
                "0 0 2 4 4 0\n" +
                "0 0 0 2 0 0\n" +
                "0 0 1 2 4 0\n";
        expected = "19";

        System.setIn(new ByteArrayInputStream(data.getBytes()));

        Java2DArray.main(args);

        assertEquals(expected, stdout.toString());
    }
}
