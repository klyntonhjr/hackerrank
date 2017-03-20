package challenges.strings.javaregex;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

/**
 * Created by nino on 3/20/17.
 */
public class JavaRegexTest {
    private final String[] args = null;
    private ByteArrayOutputStream stdout = new ByteArrayOutputStream();
    private String data = "";
    private String expected = "";

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
    public void validIpTest(){
        data = "000.111.222.255";
        expected = "true\n";

        System.setIn(new ByteArrayInputStream(data.getBytes()));
        JavaRegex.main(args);

        assertEquals(expected, stdout.toString());
    }

    @Test
    public void invalidIpTest(){
        data = "23.45.22.32.";
        expected = "false\n";

        System.setIn(new ByteArrayInputStream(data.getBytes()));
        JavaRegex.main(args);

        assertEquals(expected, stdout.toString());
    }

    @Test
    public void validThenInvalidIpTest(){
        data = "23.45.12.56\n" +
                "00.12.123.123123.123";
        expected = "true\n" +
                "false\n";

        System.setIn(new ByteArrayInputStream(data.getBytes()));
        JavaRegex.main(args);

        assertEquals(expected, stdout.toString());
    }
}
