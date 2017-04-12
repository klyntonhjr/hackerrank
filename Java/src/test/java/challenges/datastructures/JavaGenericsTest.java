package challenges.datastructures;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

/**
 * Created by nino on 4/11/17.
 */
public class JavaGenericsTest {
    private final ByteArrayOutputStream stdout = new ByteArrayOutputStream();
    private String expectedOut;

    @Before
    public void setUp(){
        System.setOut(new PrintStream(stdout));
        expectedOut = null;
    }

    @After
    public void tearDown(){
        System.setOut(null);
        stdout.reset();
    }

    @Test
    public void genericMethodIntTest(){
        expectedOut = "1\n" +
                "2\n" +
                "3\n";
        Printer myPrinter = new Printer();
        Integer[] intArray = { 1, 2, 3 };
        myPrinter.printArray(intArray);
        assertEquals(expectedOut, stdout.toString());
    }

    @Test
    public void genericMethodStringTest(){
        expectedOut = "Hello\n" +
                "World\n";
        Printer myPrinter = new Printer();
        String[] stringArray = {"Hello", "World"};
        myPrinter.printArray(stringArray);
        assertEquals(expectedOut, stdout.toString());
    }
}
