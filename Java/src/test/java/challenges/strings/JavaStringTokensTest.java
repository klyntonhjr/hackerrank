package challenges.strings;

import challenges.strings.JavaStringTokens;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

/**
 * Created by nino on 3/19/17.
 */
public class JavaStringTokensTest {
    private final String[] args = null;
    private ByteArrayOutputStream stdout = new ByteArrayOutputStream();
    private String data;
    private String expected;

    @Before
    public void setUp(){
        System.setOut(new PrintStream(stdout));
        data = null;
        expected = null;
    }

    @Test
    public void getStringTokens(){
        data = "He is a very very good boy, isn't he?";
        expected = "10\n" +
                "He\n" +
                "is\n" +
                "a\n" +
                "very\n" +
                "very\n" +
                "good\n" +
                "boy\n" +
                "isn\n" +
                "t\n" +
                "he\n";

        System.setIn(new ByteArrayInputStream(data.getBytes()));

        JavaStringTokens.main(args);

        assertEquals(expected, stdout.toString());
    }

    @Test
    public void getStringWithLeadingWhitespacesTokens(){
        data = "           YES      leading spaces        are valid,    problemsetters are         evillllll";
        expected = "8\n" +
                "YES\n" +
                "leading\n" +
                "spaces\n" +
                "are\n" +
                "valid\n" +
                "problemsetters\n" +
                "are\n" +
                "evillllll\n";

        System.setIn(new ByteArrayInputStream(data.getBytes()));

        JavaStringTokens.main(args);

        assertEquals(expected, stdout.toString());
    }

    @Test
    public void getStringWithJustWhitespacesTokens(){
        data = "                        ";
        expected = "0\n";

        System.setIn(new ByteArrayInputStream(data.getBytes()));

        JavaStringTokens.main(args);

        assertEquals(expected, stdout.toString());
    }
}
