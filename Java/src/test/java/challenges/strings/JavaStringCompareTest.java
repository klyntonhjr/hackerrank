package challenges.strings;

import challenges.strings.JavaStringCompare;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

/**
 * Created by nino on 3/19/17.
 */
public class JavaStringCompareTest {
    private ByteArrayOutputStream stdout = new ByteArrayOutputStream();
    private final String[] args = null;
    private String data = null;
    private String expected = null;

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
    public void lexyTest(){
        String word = "welcometojava";
        String subLen = "3";
        data = word +  "\n" + subLen;
        expected = "ava\nwel\n";

        System.setIn(new ByteArrayInputStream(data.getBytes()));

        JavaStringCompare.main(args);

        assertEquals(expected, stdout.toString());
    }
}
