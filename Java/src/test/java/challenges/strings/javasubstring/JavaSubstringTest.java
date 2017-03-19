package challenges.strings.javasubstring;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

/**
 * Created by nino on 3/19/17.
 */
public class JavaSubstringTest {
    @Test
    public void substringTest(){
        String[] args = null;
        String data = "Helloworld\n3 7";
        String expected = "lowo\n";
        ByteArrayOutputStream stdout = new ByteArrayOutputStream();
        System.setOut(new PrintStream(stdout));
        System.setIn(new ByteArrayInputStream(data.getBytes()));

        JavaSubstring.main(args);

        assertEquals(expected, stdout.toString());
    }
}
