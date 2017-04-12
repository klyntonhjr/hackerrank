package challenges.datastructures;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

/**
 * Created by nino on 4/11/17.
 */
public class JavaHashsetTest {
    private final String[] args = null;
    private final ByteArrayOutputStream stdout = new ByteArrayOutputStream();
    private String data, expected;
    private int numOfTestCases = 1;

    @Before
    public void setUp(){
        System.setOut(new PrintStream(stdout));
        data = expected = null;
        numOfTestCases = 1;
    }

    @After
    public void tearDown(){
        System.setOut(null);
        stdout.reset();
    }

    @Test
    public void onePairTest(){
        data = numOfTestCases + "\n"
                + "john mary";
        expected = "1\n";
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        JavaHashset.main(args);
        assertEquals(expected, stdout.toString());
    }

    @Test
    public void duplicatePairTest(){
        numOfTestCases = 2;
        data = numOfTestCases + "\n"
                + "john mary\n"
                + "john mary\n";
        expected = "1\n" +
                "1\n";
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        JavaHashset.main(args);
        assertEquals(expected, stdout.toString());
    }

    @Test
    public void twoPairTest(){
        numOfTestCases = 2;
        data = numOfTestCases + "\n"
                + "john mary\n"
                + "john anna\n";
        expected = "1\n" +
                "2\n";
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        JavaHashset.main(args);
        assertEquals(expected, stdout.toString());
    }

    @Test
    public void cornerCaseTest(){
        numOfTestCases = 2;
        data = numOfTestCases + "\n"
                + "a bc\n"
                + "ab c\n";
        expected = "1\n" +
                "2\n";
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        JavaHashset.main(args);
        assertEquals(expected, stdout.toString());
    }
}
