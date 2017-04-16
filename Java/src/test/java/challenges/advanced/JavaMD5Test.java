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
public class JavaMD5Test {
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
        expectedOut = "68e109f0f40ca72a15e05cc22786f8e6\n";
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        JavaMD5.main(args);
        assertEquals(expectedOut, stdout.toString());
    }
}
