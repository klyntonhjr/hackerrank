package challenges.strings.patternsyntaxchecker;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

/**
 * Created by nino on 3/19/17.
 */
public class PatternSyntaxCheckerTest {
    private String[] args = null;
    private ByteArrayOutputStream stdout = new ByteArrayOutputStream();
    private String data;
    private String expected;

    @Test
    public void checkSyntaxTest(){
        data = "3\n" +
                "([A-Z])(.+)\n" +
                "[AZ[a-z](a-z)\n" +
                "batcatpat(nat";
        expected = "Valid\n" +
                "Invalid\n" +
                "Invalid\n";

        System.setOut(new PrintStream(stdout));
        System.setIn(new ByteArrayInputStream(data.getBytes()));

        PatternSyntaxChecker.main(args);

        assertEquals(expected, stdout.toString());
    }
}
