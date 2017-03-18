package challenges.introduction.javadatatypes;

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
 * This challenge is for testing primitive datatypes.
 * A byte is an 8-bit signed integer.
 * A short is a 16-bit signed integer.
 * An int is a 32-bit signed integer.
 * A long is a 64-bit signed integer.
 *
 * Given an input integer, you must determine which primitive data types are capable of properly storing that input.
 */
public class JavaDataTypesTest {
    private final ByteArrayOutputStream stdout = new ByteArrayOutputStream();
    private final InputStream stdin = System.in;
    private final String[] args = null;
    private String data = "1\n";
    private String expectedOut;
    private String fitsIn = " can be fitted in:\n";
    private String fitsInByte = "* byte\n";
    private String fitsInShort = "* short\n";
    private String fitsInInt = "* int\n";
    private String fitsInLong = "* long\n";
    private String cantFit = " can't be fitted anywhere.\n";

    @Before
    public void setUp(){
        System.setOut(new PrintStream(stdout));
        System.setIn(stdin);
        data = "1\n";
        expectedOut = null;
    }

    @After
    public void tearDown(){
        System.setOut(null);
        System.setIn(null);
    }

    @Test
    public void dataTypeMaxByteTest(){
        byte value =Byte.MAX_VALUE;
        data += value;
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        expectedOut = value + fitsIn + fitsInByte + fitsInShort + fitsInInt + fitsInLong;

        JavaDataTypes.main(args);

        assertEquals(expectedOut, stdout.toString());
    }

    @Test
    public void dataTypeMinByteTest(){
        byte value =Byte.MIN_VALUE;
        data += value;
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        expectedOut = value + fitsIn + fitsInByte + fitsInShort + fitsInInt + fitsInLong;

        JavaDataTypes.main(args);

        assertEquals(expectedOut, stdout.toString());
    }

    @Test
    public void dataTypeMaxShortTest(){
        short value = Short.MAX_VALUE;
        data += value;
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        expectedOut = value + fitsIn + fitsInShort + fitsInInt + fitsInLong;

        JavaDataTypes.main(args);

        assertEquals(expectedOut, stdout.toString());
    }

    @Test
    public void dataTypeMinShortTest(){
        short value = Short.MIN_VALUE;
        data += value;
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        expectedOut = value + fitsIn + fitsInShort + fitsInInt + fitsInLong;

        JavaDataTypes.main(args);

        assertEquals(expectedOut, stdout.toString());
    }

    @Test
    public void dataTypeMaxIntTest(){
        int value = Integer.MAX_VALUE;
        data += value;
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        expectedOut = value + fitsIn + fitsInInt + fitsInLong;

        JavaDataTypes.main(args);

        assertEquals(expectedOut, stdout.toString());
    }

    @Test
    public void dataTypeMinIntTest(){
        int value = Integer.MIN_VALUE;
        data += value;
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        expectedOut = value + fitsIn + fitsInInt + fitsInLong;

        JavaDataTypes.main(args);

        assertEquals(expectedOut, stdout.toString());
    }

    @Test
    public void dataTypeMaxLongTest(){
        long value = Long.MAX_VALUE;
        data += value;
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        expectedOut = value + fitsIn + fitsInLong;

        JavaDataTypes.main(args);

        assertEquals(expectedOut, stdout.toString());
    }

    @Test
    public void dataTypeMinLongTest(){
        long value = Long.MAX_VALUE;
        data += value;
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        expectedOut = value + fitsIn + fitsInLong;

        JavaDataTypes.main(args);

        assertEquals(expectedOut, stdout.toString());
    }

    @Test
    public void dataTypeCantFitTest(){
        String value = "9223372036854775808";
        data += value; // This Long max value + 1
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        expectedOut = value + cantFit;

        JavaDataTypes.main(args);

        assertEquals(expectedOut, stdout.toString());
    }
}
