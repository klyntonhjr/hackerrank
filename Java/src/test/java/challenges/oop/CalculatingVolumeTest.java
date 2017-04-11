package challenges.oop;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

/**
 * Created by nino on 4/10/17.
 */
public class CalculatingVolumeTest {
    private final ByteArrayOutputStream stdout = new ByteArrayOutputStream();
    private final String[] args = null;
    private String data, expectedOut;
    private int numOfTestCases = 1;

    @Before
    public void setUp(){
        System.setOut(new PrintStream(stdout));
        data = expectedOut = null;
        numOfTestCases = 1;
    }

    @After
    public void tearDown(){
        System.setOut(null);
        stdout.reset();
    }

    @Test
    public void cubeTest(){
        data = numOfTestCases + "\n"
                + "1\n4";
        expectedOut = "64.000\n";
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        CalculatingVolume.main(args);
        assertEquals(expectedOut,stdout.toString());
    }

    @Test
    public void cubeNegNumTest(){
        data = numOfTestCases + "\n"
                + "1\n-4";
        expectedOut = "java.lang.NumberFormatException: All the values must be positive\n";
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        CalculatingVolume.main(args);
        assertEquals(expectedOut,stdout.toString());
    }

    @Test
    public void cuboidTest(){
        data = numOfTestCases + "\n"
                + "2\n"
                + "1\n"
                + "2\n"
                + "3\n";
        expectedOut = "6.000\n";
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        CalculatingVolume.main(args);
        assertEquals(expectedOut,stdout.toString());
    }

    @Test
    public void cuboidNegNumTest(){
        data = numOfTestCases + "\n"
                + "2\n"
                + "1\n"
                + "2\n"
                + "-3\n";
        expectedOut = "java.lang.NumberFormatException: All the values must be positive\n";
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        CalculatingVolume.main(args);
        assertEquals(expectedOut,stdout.toString());
    }

    @Test
    public void sphereTest(){
        data = numOfTestCases + "\n"
                + "3\n"
                + "1\n";
        expectedOut = "2.094\n";
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        CalculatingVolume.main(args);
        assertEquals(expectedOut,stdout.toString());
    }

    @Test
    public void sphereNegNumTest(){
        data = numOfTestCases + "\n"
                + "3\n"
                + "-1\n";
        expectedOut = "java.lang.NumberFormatException: All the values must be positive\n";
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        CalculatingVolume.main(args);
        assertEquals(expectedOut,stdout.toString());
    }

    @Test
    public void cylinderTest(){
        data = numOfTestCases + "\n"
                + "4\n"
                + "1\n"
                + "2\n";
        expectedOut = "6.283\n";
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        CalculatingVolume.main(args);
        assertEquals(expectedOut,stdout.toString());
    }

    @Test
    public void cylinderNegNumTest(){
        data = numOfTestCases + "\n"
                + "4\n"
                + "-1\n"
                + "1\n";
        expectedOut = "java.lang.NumberFormatException: All the values must be positive\n";
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        CalculatingVolume.main(args);
        assertEquals(expectedOut,stdout.toString());
    }

    @Test
    public void hackerRankInputTestCase0(){
        data = "2\n" +
                "1\n" +
                "4\n" +
                "4\n" +
                "67.89\n" +
                "-98.54";
        expectedOut = "64.000\n" +
                "java.lang.NumberFormatException: All the values must be positive\n";
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        CalculatingVolume.main(args);
        assertEquals(expectedOut,stdout.toString());
    }

    @Test
    public void hackerRankInputTestCase1(){
        data = "1\n" +
                "3\n" +
                "1.02";
        expectedOut = "2.223\n";
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        CalculatingVolume.main(args);
        assertEquals(expectedOut,stdout.toString());
    }

    @Test
    public void hackerRankInputTestCase2(){
        data = "5\n" +
                "4\n" +
                "6.78\n" +
                "9.87\n" +
                "1\n" +
                "0\n" +
                "2\n" +
                "3\n" +
                "4\n" +
                "5\n" +
                "1\n" +
                "9\n" +
                "4\n" +
                "5.78\n" +
                "6.78";
        expectedOut = "1425.366\n" +
                "java.lang.NumberFormatException: All the values must be positive\n";
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        CalculatingVolume.main(args);
        assertEquals(expectedOut,stdout.toString());
    }
}
