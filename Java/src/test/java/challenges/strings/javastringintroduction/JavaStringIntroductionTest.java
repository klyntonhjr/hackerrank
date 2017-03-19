package challenges.strings.javastringintroduction;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

/**
 * Created by nino on 3/19/17.
 */
public class JavaStringIntroductionTest {
    private ByteArrayOutputStream stdout = new ByteArrayOutputStream();
    private final String[] args = null;
    private String input;
    private String expectedOutput;
    private String a, b;

    @Before
    public void setUp(){
        System.setOut(new PrintStream(stdout));
        System.setIn(null);
        input = null;
        expectedOutput = null;
    }

    @After
    public void tearDown(){
        System.setOut(null);
        stdout = null;
    }

    @Test
    public void checkLength(){
        a = "hello";
        b = "java";
        input = a+"\n"+b;
        expectedOutput = "9\nNo\nHello Java\n"; // Length of input.
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        JavaStringIntroduction.main(args);

        assertEquals(expectedOutput, stdout.toString());
    }

    @Test
    public void lexicographicallyComparisonALessThanB(){
        a = "a";
        b = "b";
        input = a+"\n"+b;
        expectedOutput = "2\nNo\nA B\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        JavaStringIntroduction.main(args);

        assertEquals(expectedOutput, stdout.toString());
    }

    @Test
    public void lexicographicallyComparisonALargerThanB(){
        a = "b";
        b = "a";
        input = a+"\n"+b;
        expectedOutput = "2\nYes\nB A\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        JavaStringIntroduction.main(args);

        assertEquals(expectedOutput, stdout.toString());
    }

    @Test
    public void lexicographicallyComparisonAEqualToB(){
        a = "a";
        b = "a";
        input = a+"\n"+b;
        expectedOutput = "2\nNo\nA A\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        JavaStringIntroduction.main(args);

        assertEquals(expectedOutput, stdout.toString());
    }

    @Test
    public void capFirstLetterAndConcatAAndB(){
        a = "hello";
        b = "java";
        input = a+"\n"+b;
        expectedOutput = "9\nNo\nHello Java\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        JavaStringIntroduction.main(args);

        assertEquals(expectedOutput, stdout.toString());
    }
}
