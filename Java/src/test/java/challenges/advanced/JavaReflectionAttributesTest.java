package challenges.advanced;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

/**
 * Created by nino on 4/15/17.
 */
public class JavaReflectionAttributesTest {
    @Test
    public void methodCount(){
        String[] args = null;
        String expected = "anothermethod\n" +
                "getName\n" +
                "setEmail\n" +
                "setId\n";
        ByteArrayOutputStream stdoud = new ByteArrayOutputStream();
        System.setOut(new PrintStream(stdoud));
        JavaReflectionAttributes.main(args);
        assertEquals(expected, stdoud.toString());
    }
}
