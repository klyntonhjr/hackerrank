package challenges.advanced;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

/**
 * Created by nino on 4/15/17.
 */
public class JavaSHA256Test {
    private final String[] args = null;
    private final ByteArrayOutputStream stdout = new ByteArrayOutputStream();
    private String data, expectedOut;

    @Before
    public void setUp(){
        System.setOut(new PrintStream(stdout));
        data = expectedOut = null;
    }

    @After
    public void tearDown(){
        System.setOut(null);
        stdout.reset();
    }

    @Test
    public void helloWorldTest() throws Exception {
        data = "HelloWorld\n";
        expectedOut = "872e4e50ce9990d8b041330c47c9ddd11bec6b503ae9386a99da8584e9bb12c4\n";
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        JavaSHA256.main(args);
        assertEquals(expectedOut, stdout.toString());
    }
}
