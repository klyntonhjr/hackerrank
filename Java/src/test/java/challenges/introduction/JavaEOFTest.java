package challenges.introduction;

import challenges.introduction.JavaEOF;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

/**
 * Created by nino on 3/18/17.
 */
public class JavaEOFTest {
    private final ByteArrayOutputStream stdout = new ByteArrayOutputStream();
    private final InputStream stdin = System.in;
    private String[] args = null;
    private String data = null;
    private String expectedOut = null;

    @Before
    public void setUp(){
        System.setOut(new PrintStream(stdout));
        System.setIn(stdin);
    }

    @After
    public void tearDown(){
        System.setOut(null);
        System.setIn(null);
        args = null;
        data = null;
        expectedOut = null;
    }

    @Test
    public void endOfFileTest(){
        data = "Hello world\n" +
                "I am a file\n" +
                "Read me until end-of-file.";
        expectedOut = "1 Hello world\n" +
                "2 I am a file\n" +
                "3 Read me until end-of-file.\n";

        System.setIn(new ByteArrayInputStream(data.getBytes()));

        JavaEOF.main(args);

        assertEquals(expectedOut, stdout.toString());
    }
}
