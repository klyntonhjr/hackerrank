package challenges.introduction.javainttostring;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

/**
 * Created by nino on 3/18/17.
 */
public class JavaIntToStringTest {
    @Test
    public void intToStringTest(){
        ByteArrayOutputStream stdout = new ByteArrayOutputStream();
        InputStream stdin = System.in;
        String[] args = null;
        String data = "100";
        String expected = "Good job";

        System.setOut(new PrintStream(stdout));
        System.setIn(stdin);
        System.setIn(new ByteArrayInputStream(data.getBytes()));

        JavaIntToString.main(args);

        assertEquals(expected, stdout.toString().trim());
    }
}
