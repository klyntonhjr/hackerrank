package challenges.introduction;

import challenges.introduction.JavaDateAndTime;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

/**
 * Created by nino on 3/18/17.
 */
public class JavaDateAndTimeTest {
    @Test
    public void getDayTest() {
        ByteArrayOutputStream stdout = new ByteArrayOutputStream();
        String[] args = null;
        String data = "08 05 2015";
        String expected = "WEDNESDAY";

        System.setOut(new PrintStream(stdout));
        System.setIn(new ByteArrayInputStream(data.getBytes()));

        JavaDateAndTime.main(args);

        assertEquals(expected, stdout.toString());
    }
}
