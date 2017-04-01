package challenges.oop;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by nino on 3/31/17.
 */
public class JavaAbstracClassTest {
    @Test
    public void abstractClassTest(){
        String input = "My Novel\n";

        String expectedOut = "The title is: " + input;
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        JavaAbstracClass.main(null);

        assertEquals(expectedOut, out.toString());
    }
}
