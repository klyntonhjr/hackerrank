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
public class JavaVarargsSimpleAdditionTest {
    private final String[] args = null;
    private final ByteArrayOutputStream stdout = new ByteArrayOutputStream();
    String data, expectedOut;

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
    public void add2IntsTest(){
        int a, b;
        a = 1; b = 2;
        System.setOut(new PrintStream(stdout));
        expectedOut = "1+2=3\n";
        Add.add(a, b);
        assertEquals(expectedOut, stdout.toString());
    }

    @Test
    public void add3IntsTest(){
        int a, b, c;
        a = 1; b = 2; c = 3;
        System.setOut(new PrintStream(stdout));
        expectedOut = "1+2+3=6\n";
        Add.add(a, b, c);
        assertEquals(expectedOut, stdout.toString());
    }

    @Test
    public void hackerrankCase0Test(){
        data = "1\n" +
                "2\n" +
                "3\n" +
                "4\n" +
                "5\n" +
                "6";
        expectedOut = "1+2=3\n" +
                "1+2+3=6\n" +
                "1+2+3+4+5=15\n" +
                "1+2+3+4+5+6=21\n";
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        JavaVarargsSimpleAddition.main(args);
        assertEquals(expectedOut, stdout.toString());
    }
}
