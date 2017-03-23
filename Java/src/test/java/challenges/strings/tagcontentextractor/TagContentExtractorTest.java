package challenges.strings.tagcontentextractor;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

/**
 * Created by nino on 3/20/17.
 */
public class TagContentExtractorTest {
    private String[] args = null;
    private ByteArrayOutputStream stdout = new ByteArrayOutputStream();
    private String data;
    private String expected;

    private static final String TAGS = "<\\/([\\w]+)>";
    private static final String OPENING_TAGS = "<([\\w]+)>";
    private static final String CONTENT = "<([\\w]+)>(.*?)<(\\/[\\w]+)>";

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
    public void getContentsFromWellFormedTagsTest(){
        data = "4\n" +
                "<h1>Nayeem loves counseling</h1>\n" +
                "<h1><h1>Sanjay has no watch</h1></h1><par>So wait for a while</par>\n" +
                "<Amee>safat codes like a ninja</amee>\n" +
                "<SA premium>Imtiaz has a secret crush</SA premium>\n";
        expected = "Nayeem loves counseling\n" +
                "Sanjay has no watch\n" +
                "So wait for a while\n" +
                "None\n" +
                "Imtiaz has a secret crush\n";

        System.setIn(new ByteArrayInputStream(data.getBytes()));

        TagContentExtractor.main(args);

        assertEquals(expected, stdout.toString());
    }

    @Test
    public void getContentsFromIllFormedTagsTest(){
        data = "1\n<h1><h1>Sanjay has no watch</h1></h1><par>So wait for a while</par>";
        expected = "Sanjay has no watch\nSo wait for a while\n";

        System.setIn(new ByteArrayInputStream(data.getBytes()));

        TagContentExtractor.main(args);

        assertEquals(expected, stdout.toString());
    }

    @Test
    public void getContentsFromIllFormedTagTest(){
        data = "1\n<Amee>safat codes like a ninja</amee>";
        expected = "None\n";

        System.setIn(new ByteArrayInputStream(data.getBytes()));

        TagContentExtractor.main(args);

        assertEquals(expected, stdout.toString());
    }

    @Test
    @Ignore
    public void getContentsFromIllFormedContentTagTest(){
        data = "1\n<h1><a>contents</a>invalid</h1>";
        expected = "None\n";

        System.setIn(new ByteArrayInputStream(data.getBytes()));

        TagContentExtractor.main(args);

        assertEquals(expected, stdout.toString());
    }
}
