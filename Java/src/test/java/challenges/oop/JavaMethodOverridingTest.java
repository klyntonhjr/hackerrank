package challenges.oop;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

/**
 * Created by nino on 4/7/17.
 */
public class JavaMethodOverridingTest {
    @Test
    public void overrideTest(){
        ByteArrayOutputStream stdout = new ByteArrayOutputStream();
        System.setOut(new PrintStream(stdout));
        String expectOut = "Generic Sports\n" +
                "Each team has n players in Generic Sports\n" +
                "Soccer Class\n" +
                "Each team has 11 players in Soccer Class\n";

        String[] args = null;
        JavaMethodOverriding.main(args);

        assertEquals(expectOut, stdout.toString());
    }
}
