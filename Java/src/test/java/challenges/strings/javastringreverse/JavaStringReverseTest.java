package challenges.strings.javastringreverse;

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
public class JavaStringReverseTest {
    private String[] args = null;
    private ByteArrayOutputStream stdout = new ByteArrayOutputStream();
    private String dataIn = null;
    private String expectedOut = null;

    @Before
    public void setUp(){
        System.setOut(new PrintStream(stdout));
    }

    @After
    public void tearDown(){
        System.setOut(null);
        stdout.reset();
        dataIn = null;
        expectedOut = null;
    }

    @Test
    public void palindromeWordTest(){
        dataIn = "madam";
        expectedOut = "Yes\n";
        System.setIn(new ByteArrayInputStream(dataIn.getBytes()));

        JavaStringReverse.main(args);

        assertEquals(expectedOut, stdout.toString());
    }

    @Test
    public void notPalindromeWordTest(){
        dataIn = "madama";
        expectedOut = "No\n";
        System.setIn(new ByteArrayInputStream(dataIn.getBytes()));

        JavaStringReverse.main(args);

        assertEquals(expectedOut, stdout.toString());
    }
}
