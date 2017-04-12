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
public class JavaSortTest {
    private final String[] args = null;
    private final ByteArrayOutputStream stdout = new ByteArrayOutputStream();
    private String data, expected;
    private int numOfTestCases;

    @Before
    public void setUp(){
        System.setOut(new PrintStream(stdout));
        data = expected = null;
        numOfTestCases = 2;
    }

    @After
    public void tearDown(){
        System.setOut(null);
        stdout.reset();
    }

    @Test
    public void sortByGPATest(){
        data = numOfTestCases + "\n" +
                "33 Rumpa 3.68\n" +
                "85 Ashis 3.85";
        expected = "Ashis\n" +
                "Rumpa\n";
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        JavaSort.main(args);
        assertEquals(expected, stdout.toString());
    }

    @Test
    public void sortByNameWhenGPAEqualsTest(){
        data = numOfTestCases + "\n" +
                "33 Rumpa 3.68\n" +
                "85 Ashis 3.68";
        expected = "Ashis\n" +
                "Rumpa\n";
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        JavaSort.main(args);
        assertEquals(expected, stdout.toString());
    }

    @Test
    public void sortByGPALessThanTest(){
        data = numOfTestCases + "\n" +
                "33 Bob 3.62\n" +
                "85 Ana 3.68";
        expected = "Ana\n" +
                "Bob\n";
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        JavaSort.main(args);
        assertEquals(expected, stdout.toString());
    }

    @Test
    public void sortByIDWhenNameAndGPAEqualsTest(){
        numOfTestCases = 5;
        data = numOfTestCases + "\n" +
                "33 Rumpa 3.68\n" +
                "85 Ashis 3.85\n" +
                "56 Samiha 3.75\n" +
                "19 Samara 3.75\n" +
                "22 Fahim 3.76";
        expected = "Ashis\n" +
                "Fahim\n" +
                "Samara\n" +
                "Samiha\n" +
                "Rumpa\n";
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        JavaSort.main(args);
        assertEquals(expected, stdout.toString());
    }
}
