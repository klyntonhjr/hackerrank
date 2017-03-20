package challenges.strings.javaregex3usernamechecker;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

/**
 * Created by nino on 3/20/17.
 */
public class JavaRegex3UsernameCheckerTest {
    private ByteArrayOutputStream stdout = new ByteArrayOutputStream();
    private String[] args = null;
    private String data;
    private String expected;
    private final String VALID = "Valid\n";
    private final String INVALID = "Invalid\n";

    @Before
    public void setUp(){
        System.setOut(new PrintStream(stdout));
        data = null;
        expected = null;
    }

    @After
    public void tearDown(){
        System.setOut(null);
        stdout.reset();
    }

    @Test
    public void validUsernameCheckTest(){
        data = "1\nasdf_7890";
        expected = VALID;

        System.setIn(new ByteArrayInputStream(data.getBytes()));

        JavaRegex3UsernameChecker.main(args);

        assertEquals(expected, stdout.toString());
    }

    @Test
    public void invalidUsernameCheckTest(){
        data = "1\nasdf_ 7890";
        expected = INVALID;

        System.setIn(new ByteArrayInputStream(data.getBytes()));

        JavaRegex3UsernameChecker.main(args);

        assertEquals(expected, stdout.toString());
    }

    @Test
    public void invalidUsernameCheckStartingWithUnderscoreTest(){
        data = "1\n_asdf7890";
        expected = INVALID;

        System.setIn(new ByteArrayInputStream(data.getBytes()));

        JavaRegex3UsernameChecker.main(args);

        assertEquals(expected, stdout.toString());
    }
}
