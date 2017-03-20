package challenges.strings.javaregex2duplicatewords;

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
public class JavaRegex2DuplicateWordsTest {
    private final String[] args = null;
    private ByteArrayOutputStream stdout = new ByteArrayOutputStream();
    private String data = null;
    private String expected = null;

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
    public void checkDuplicateTest(){
        data = "1\n" +
                "I love Love to To tO code";
        expected = "I love to code\n";

        System.setIn(new ByteArrayInputStream(data.getBytes()));

        JavaRegex2DuplicateWords.main(args);

        assertEquals(expected, stdout.toString());
    }

    @Test
    public void checkDuplicateMultipleSentencesTest(){
        data = "2\n" +
                "Goodbye bye bye world world world\n" +
                "Sam went went to to to his business";
        expected = "Goodbye bye world\n" +
                "Sam went to his business\n";

        System.setIn(new ByteArrayInputStream(data.getBytes()));

        JavaRegex2DuplicateWords.main(args);

        assertEquals(expected, stdout.toString());
    }
}
