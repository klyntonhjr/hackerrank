package challenges.strings.javaanagrams;

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
public class JavaAnagramsTest {
    private String[] args = null;
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
    public void anagramTest(){
        data = "cat\natc";
        expected = "Anagrams\n";
        System.setIn(new ByteArrayInputStream(data.getBytes()));

        JavaAnagrams.main(args);

        assertEquals(expected, stdout.toString());
    }

    @Test
    public void notAnagramTest(){
        data = "cat\natca";
        expected = "Not Anagrams\n";
        System.setIn(new ByteArrayInputStream(data.getBytes()));

        JavaAnagrams.main(args);

        assertEquals(expected, stdout.toString());
    }

    @Test
    public void anagramWithCapitalLetterTest(){
        data = "Cat\ntca";
        expected = "Anagrams\n";
        System.setIn(new ByteArrayInputStream(data.getBytes()));

        JavaAnagrams.main(args);

        assertEquals(expected, stdout.toString());
    }

    @Test
    public void notAnagramDiffrentStrLengthsTest(){
        data = "Cat\ntcab";
        expected = "Not Anagrams\n";
        System.setIn(new ByteArrayInputStream(data.getBytes()));

        JavaAnagrams.main(args);

        assertEquals(expected, stdout.toString());
    }
}
