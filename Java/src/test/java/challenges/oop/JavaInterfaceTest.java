package challenges.oop;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

/**
 * Created by nino on 4/6/17.
 */
public class JavaInterfaceTest {
    @Test
    public void interfaceTest(){
        AdvancedArithmetic mycal = new MyCalculator();
        assertEquals(12, mycal.divisor_sum(6));
        assertEquals(4, mycal.divisor_sum(3));
    }

    @Test
    public void mainTest(){
        ByteArrayOutputStream stdout = new ByteArrayOutputStream();
        String data = "6";
        String expecteOut = "I implemented: challenges.oop.AdvancedArithmetic\n" +
                "12\n";

        System.setOut(new PrintStream(stdout));
        System.setIn(new ByteArrayInputStream(data.getBytes()));

        JavaInterface.main(null);

        assertEquals(expecteOut, stdout.toString());
    }
}
