package challenges.advanced;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

/**
 * Created by nino on 4/15/17.
 */
public class CanYouAccessTest {
    @Test
    public void accessTest() throws Exception {
        ByteArrayOutputStream stdout = new ByteArrayOutputStream();
        String[] args = null;
        String data, expected;
        data = "8";
        expected = "8 is power of 2\n" +
                "An instance of class: challenges.advanced.CanYouAccess.Inner.Private has been created\n";
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        System.setOut(new PrintStream(stdout));
        CanYouAccess.main(args);
        assertEquals(expected, stdout.toString());
    }
}
