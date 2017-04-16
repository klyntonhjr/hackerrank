package challenges.advanced;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

/**
 * Created by nino on 4/15/17.
 */
public class JavaAnnotationsTest {
    @Test
    public void annotationTest(){
        String[] args = null;
        ByteArrayOutputStream stdout = new ByteArrayOutputStream();
        String data = "3\n" +
                "SENIOR 75\n" +
                "JUNIOR 45\n" +
                "SENIOR 40";
        String expectedOut = "Senior Member\n" +
                "Spend: 75\n" +
                "Budget Left: 25\n" +
                "Junior Member\n" +
                "Spend: 45\n" +
                "Budget Left: 5\n" +
                "Senior Member\n" +
                "Spend: 40\n" +
                "Budget Left: 60\n";
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        System.setOut(new PrintStream(stdout));
        JavaAnnotations.main(args);
        assertEquals(expectedOut, stdout.toString());
    }
}
