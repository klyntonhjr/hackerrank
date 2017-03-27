package challenges.datastructures;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;


/**
 * Created by nino on 3/26/17.
 */
public class JavaStackTest {
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
    public void balancedStackTest() {
        data = "[{()}]";
        expected = "true\n";

        System.setIn(new ByteArrayInputStream(data.getBytes()));

        JavaStack.main(args);

        assertEquals(expected, stdout.toString());
    }

    @Test
    public void balancedOpenCloseStackTest() {
        data = "[]";
        expected = "true\n";

        System.setIn(new ByteArrayInputStream(data.getBytes()));

        JavaStack.main(args);

        assertEquals(expected, stdout.toString());
    }

    @Test
    public void unbalancedStackTest() {
        data = "{}(";
        expected = "false\n";

        System.setIn(new ByteArrayInputStream(data.getBytes()));

        JavaStack.main(args);

        assertEquals(expected, stdout.toString());
    }

    @Test
    public void moreThanOneInputStackTest() {
        data = "{}()\n" +
                "({()})\n" +
                "{}(\n" +
                "[]";
        expected = "true\n" +
                "true\n" +
                "false\n" +
                "true\n";

        System.setIn(new ByteArrayInputStream(data.getBytes()));

        JavaStack.main(args);

        assertEquals(expected, stdout.toString());
    }
}
