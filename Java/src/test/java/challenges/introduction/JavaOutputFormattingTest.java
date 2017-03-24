package challenges.introduction;

import challenges.introduction.JavaOutputFormatting;
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
 *
 * EXPECTED INPUT:
 * Every line of input will contain a String followed by an integer.
 * Each String will have a maximum of 10 alphabetic characters,
 * and each integer will be in the inclusive range from to 0 to 999.
 *
 * EXPECTED OUTPUT:
 * In each line of output there should be two columns:
 * The first column contains the String and is left justified using exactly 15 characters.
 * The second column contains the integer, expressed in exactly 3 digits;
 * if the original input has less than three digits, you must pad your output's leading digits with zeroes.
 */
public class JavaOutputFormattingTest {
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
    public void outputFormatTest(){
        String[] args = null;

        // Input Values
        final String str1 = "java";
        final int int1 = 100;
        final String str2 = "cpp";
        final int int2 = 65;
        final String str3 = "python";
        final int int3 = 50;
        final String DATA =   str1 + " " + int1 + "\n" +
                                str2 + " " + int2 + "\n" +
                                str3 + " " + int3 + "\n";
        final String EXPECTED =
                "================================\n" +
                String.format("%-15s%03d\n", str1, int1) +
                String.format("%-15s%03d\n", str2, int2) +
                String.format("%-15s%03d\n", str3, int3) +
                "================================";

        System.setIn(new ByteArrayInputStream(DATA.getBytes()));

        JavaOutputFormatting.main(args);

        assertEquals(EXPECTED, stdout.toString().trim());
    }
}
