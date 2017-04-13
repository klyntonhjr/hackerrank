package weekofcode31;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import weekofcode31.BeautifulWord;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

/**
 * Created by nino on 4/10/17.
 * We consider a word, , to be beautiful if the following two conditions are satisfied:
 *
 * No two consecutive characters are the same.
 * No two consecutive characters are in the following vowel set: a, e, i, o, u, y. Note that we consider y to be a vowel in this challenge.
 */
public class BeautifulWordTest {
    private final ByteArrayOutputStream stdout = new ByteArrayOutputStream();
    private final String[] args = null;
    private String data, expectedOut;
    private final String YES = "Yes\n";
    private final String NO = "No\n";

    @Before
    public void setUp(){
        System.setOut(new PrintStream(stdout));
        data = expectedOut = null;
    }

    @After
    public void tearDown(){
        System.setOut(null);
        stdout.reset();
    }

    @Test
    public void consecutiveCharsAreSameTest(){
        data = "apple";
        expectedOut = NO;
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        BeautifulWord.main(args);
        assertEquals(expectedOut, stdout.toString());
    }

    @Test
    public void consecutiveCharsAreSameButCapitalizedTest(){
        data = "APple";
        expectedOut = NO;
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        BeautifulWord.main(args);
        assertEquals(expectedOut, stdout.toString());
    }

    @Test
    public void consecutiveVowelsTest(){
        data = "beauty";
        expectedOut = NO;
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        BeautifulWord.main(args);
        assertEquals(expectedOut, stdout.toString());
    }

    @Test
    public void testCase0Test(){
        data = "abacaba";
        expectedOut = YES;
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        BeautifulWord.main(args);
        assertEquals(expectedOut, stdout.toString());
    }

    @Test
    public void testCase1Test(){
        data = "badd";
        expectedOut = NO;
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        BeautifulWord.main(args);
        assertEquals(expectedOut, stdout.toString());
    }

    @Test
    public void testCase2Test(){
        data = "yes";
        expectedOut = NO;
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        BeautifulWord.main(args);
        assertEquals(expectedOut, stdout.toString());
    }

    @Test
    public void batmanTest(){
        data = "Batman";
        expectedOut = YES;
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        BeautifulWord.main(args);
        assertEquals(expectedOut, stdout.toString());
    }
}
