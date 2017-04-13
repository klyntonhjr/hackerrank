package weekofcode31;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import weekofcode31.AccurateSorting;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

/**
 * Created by nino on 4/11/17.
 */
public class AccurateSortingTest {
    private final String[] args = null;
    private final ByteArrayOutputStream stdout = new ByteArrayOutputStream();
    private String data, expected;
    private int numOfTestCases;

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
    public void simpleSort(){
        data = numOfTestCases + "\n" +
                "2\n" +
                "1 0";
        expected = "Yes\n";
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        AccurateSorting.main(args);
        assertEquals(expected, stdout.toString());
    }

    @Test
    public void moreThan1Sort(){
        data = numOfTestCases + "\n" +
                "2\n" +
                "2 0";
        expected = "No\n";
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        AccurateSorting.main(args);
        assertEquals(expected, stdout.toString());
    }

    @Test
    public void notPossibleSort(){
        data = numOfTestCases + "\n" +
                "3\n" +
                "2 1 0";
        expected = "No\n";
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        AccurateSorting.main(args);
        assertEquals(expected, stdout.toString());
    }

    @Test
    public void hackerrankCase(){
        data = "2\n" +
                "4\n" +
                "1 0 3 2\n" +
                "3\n" +
                "2 1 0";
        expected = "Yes\n" +
                "No\n";
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        AccurateSorting.main(args);
        assertEquals(expected, stdout.toString());
    }
}
