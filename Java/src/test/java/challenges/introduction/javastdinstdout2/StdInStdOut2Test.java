package challenges.introduction.javastdinstdout2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;
/**
 * Created by nino on 3/16/17.
 */
public class StdInStdOut2Test {
    private final ByteArrayOutputStream stdout = new ByteArrayOutputStream();
    private final InputStream stdin = System.in;
    //Data Input is expected to be in format Int/nDouble/nString

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
    public void outputStringDoubleIntFromDataInputTest(){
        String[] args = null;
        String intInput = "4";
        String doubleInput = "3";
        String strInput = "Hello, World!";
        final String DATA = intInput + "\n" + doubleInput  + "\n" + strInput;
        final String EXPECTED = "String: " + strInput + "\n" +
                                "Double: " + Double.parseDouble(doubleInput) + "\n" +
                                "Int: " + Integer.parseInt(intInput);

        System.setIn(new ByteArrayInputStream(DATA.getBytes()));

        StdInStdOut2.main(args);

        assertEquals(EXPECTED, stdout.toString().trim());
    }
}
