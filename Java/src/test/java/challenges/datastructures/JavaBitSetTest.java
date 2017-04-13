package challenges.datastructures;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

/**
 * Created by nino on 4/12/17.
 */
public class JavaBitSetTest {
    private final String[] args = null;
    private final ByteArrayOutputStream stdout = new ByteArrayOutputStream();
    private String data, expectedOut;
    private int numOfBits, numOfCmds;

    @Before
    public void setUp(){
        System.setOut(new PrintStream(stdout));
        data = expectedOut = null;
        numOfBits = 4;
        numOfCmds = 2;
    }

    @After
    public void tearDown(){
        System.setOut(null);
        stdout.reset();
    }

    @Test
    public void bitFlipTest(){
        numOfCmds = 1;
        data = numOfBits + " " + numOfCmds + "\n"
                + "FLIP 1 0";
        expectedOut = "1 0\n";
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        JavaBitSet.main(args);
        assertEquals(expectedOut, stdout.toString());
    }

    @Test
    public void bitAndTest(){
        data = numOfBits + " " + numOfCmds + "\n"
                + "FLIP 1 0\n"
                + "AND 2 1";
        expectedOut = "1 0\n"
                + "1 0\n";
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        JavaBitSet.main(args);
        assertEquals(expectedOut, stdout.toString());
    }

    @Test
    public void bitOrTest(){
        data = numOfBits + " " + numOfCmds + "\n"
                + "FLIP 1 0\n"
                + "OR 2 1";
        expectedOut = "1 0\n"
                + "1 1\n";
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        JavaBitSet.main(args);
        assertEquals(expectedOut, stdout.toString());
    }

    @Test
    public void bitXOrTest(){
        data = numOfBits + " " + numOfCmds + "\n"
                + "FLIP 1 0\n"
                + "XOR 2 1";
        expectedOut = "1 0\n"
                + "1 1\n";
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        JavaBitSet.main(args);
        assertEquals(expectedOut, stdout.toString());
    }

    @Test
    public void bitSetTest(){
        data = numOfBits + " " + numOfCmds + "\n"
                + "FLIP 1 0\n"
                + "SET 1 3";
        expectedOut = "1 0\n"
                + "2 0\n";
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        JavaBitSet.main(args);
        assertEquals(expectedOut, stdout.toString());
    }

    @Test
    public void hackerrankCase0Test(){
        data = "5 4\n" +
                "AND 1 2\n" +
                "SET 1 4\n" +
                "FLIP 2 2\n" +
                "OR 2 1";
        expectedOut = "0 0\n" +
                "1 0\n" +
                "1 1\n" +
                "1 2\n";
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        JavaBitSet.main(args);
        assertEquals(expectedOut, stdout.toString());
    }
}

