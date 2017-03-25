package challenges.datastructures;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

/**
 * Created by nino on 3/24/17.
 */
public class Java1DArrayTest {
    private final String[] args = null;
    private ByteArrayOutputStream stdout = new ByteArrayOutputStream();
    private String data, expected;

    @Test
    public void arrayInputTest(){
        data = "5\n" +
                "10\n" +
                "20\n" +
                "30\n" +
                "40\n" +
                "50";
        expected = "10\n" +
                "20\n" +
                "30\n" +
                "40\n" +
                "50\n";

        System.setOut(new PrintStream(stdout));
        System.setIn(new ByteArrayInputStream(data.getBytes()));

        Java1DArray.main(args);

        assertEquals(expected, stdout.toString());
    }
}
