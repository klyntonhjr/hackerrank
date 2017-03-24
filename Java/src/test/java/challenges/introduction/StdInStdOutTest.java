package challenges.introduction;

import challenges.introduction.StdInStdOut;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.InputMismatchException;

import static org.junit.Assert.assertEquals;

/**
 * Created by nino on 3/15/17.
 */
public class StdInStdOutTest {
    private final ByteArrayOutputStream stdout = new ByteArrayOutputStream();
    private final InputStream stdin = System.in;

    @Before
    public void setUp(){
        System.setOut(new PrintStream(stdout));
        System.setIn(stdin);
    }

    @After
    public void tearDown(){
        System.setOut(null);
        System.setIn(null);
    }

    @Test
    public void readInThreeIntsTest(){
        final String DATA = "-42\n0\n125";
        final String EXPECTED = DATA;
        String[] args = null;

        System.setIn(new ByteArrayInputStream(DATA.getBytes()));

        StdInStdOut.main(args);

        assertEquals(EXPECTED, stdout.toString().trim());
    }

    @Test(expected=InputMismatchException.class)
    public void onlyExceptIntTest(){
        final String DATA = "asdf";
        String[] args = null;

        System.setIn(new ByteArrayInputStream(DATA.getBytes()));

        StdInStdOut.main(args);
    }
}
