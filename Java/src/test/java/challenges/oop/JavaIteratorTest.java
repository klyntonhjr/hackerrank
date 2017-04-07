package challenges.oop;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

/**
 * Created by nino on 4/7/17.
 */
public class JavaIteratorTest {
    @Test
    public void iteratorTest(){
        String[] args = null;
        ByteArrayOutputStream stdout = new ByteArrayOutputStream();
        String data = "2 2\n" +
                "42\n" +
                "10\n" +
                "hello\n" +
                "java";
        String expectedOut = "hello\n" +
                "java\n";

        System.setIn(new ByteArrayInputStream(data.getBytes()));
        System.setOut(new PrintStream(stdout));
        JavaIterator.main(args);

        assertEquals(expectedOut, stdout.toString());
    }
}
