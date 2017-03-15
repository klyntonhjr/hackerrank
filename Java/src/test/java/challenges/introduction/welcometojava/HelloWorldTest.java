package challenges.introduction.welcometojava;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

/**
 * Created by nino on 3/14/17.
 */
public class HelloWorldTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void cleanUpStreams() {
        System.setOut(null);
    }

    @Test
    public void helloWorldOutputTest(){
        final String EXPECTED = "Hello, World.\nHello, Java.";
        String[] args = null;
        HelloWorld.main(args);

        assertEquals(EXPECTED, outContent.toString().trim());
    }
}