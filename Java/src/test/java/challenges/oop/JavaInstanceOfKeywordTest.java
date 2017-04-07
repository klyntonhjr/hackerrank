package challenges.oop;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

/**
 * Created by nino on 4/7/17.
 */
public class JavaInstanceOfKeywordTest {
    @Test
    public void instaceOfTest(){
        String[] args = null;
        ByteArrayOutputStream stdout = new ByteArrayOutputStream();
        System.setOut(new PrintStream(stdout));
        String data = "5\n" +
                "Student\n" +
                "Student\n" +
                "Rockstar\n" +
                "Student\n" +
                "Hacker";
        String expetedOut = "3 1 1\n";

        System.setIn(new ByteArrayInputStream(data.getBytes()));
        JavaInstanceOfKeyword.main(args);

        assertEquals(expetedOut, stdout.toString());
    }
}
