package challenges.oop;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

/**
 * Created by nino on 4/7/17.
 */
public class JavaMethodOverriding2Test {
    @Test
    public void superTest(){
        String[] args = null;
        ByteArrayOutputStream stdout = new ByteArrayOutputStream();
        String expectedOut = "Hello I am a motorcycle, I am a cycle with an engine.\n" +
                "My ancestor is a cycle who is a vehicle with pedals.\n";

        System.setOut(new PrintStream(stdout));
        JavaMethodOverriding2.main(args);

        assertEquals(expectedOut, stdout.toString());

        BiCycle b = new MotorCycle();
    }
}
