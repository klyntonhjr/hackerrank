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
public class Java1DArrayPart2Test {
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
    public void arrayGameTest(){
        data = "4\n" +
                "5 3\n" +
                "0 0 0 0 0\n" +
                "6 5\n" +
                "0 0 0 1 1 1\n" +
                "6 3\n" +
                "0 0 1 1 1 0\n" +
                "3 1\n" +
                "0 1 0";
        expected = "YES\n" +
                "YES\n" +
                "NO\n" +
                "NO\n";

        System.setIn(new ByteArrayInputStream(data.getBytes()));

        Java1DArrayPart2.main(args);

        assertEquals(expected, stdout.toString());
    }

    @Test
    public void arrayGameJumpTest(){
        data = "1\n" +
                "5 2\n" +
                "0 1 0 1 0";
        expected = "YES\n";

        System.setIn(new ByteArrayInputStream(data.getBytes()));

        Java1DArrayPart2.main(args);

        assertEquals(expected, stdout.toString());
    }

    @Test
    public void arrayGameJumpTrapTest(){
        data = "1\n" +
                "9 4\n" +
                "0 0 0 1 0 1 0 0 1 ";
        expected = "YES\n";

        System.setIn(new ByteArrayInputStream(data.getBytes()));

        Java1DArrayPart2.main(args);

        assertEquals(expected, stdout.toString());
    }
}
