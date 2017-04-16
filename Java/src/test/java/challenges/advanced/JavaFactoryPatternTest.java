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
public class JavaFactoryPatternTest {
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
    public void cakeTest(){
        data = "cake";
        expectedOut = "The factory returned class challenges.advanced.Cake\n" +
                "Someone ordered a Dessert!\n";
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        JavaFactoryPattern.main(args);
        assertEquals(expectedOut, stdout.toString());
    }

    @Test
    public void pizzaTest(){
        data = "pizza";
        expectedOut = "The factory returned class challenges.advanced.Pizza\n" +
                "Someone ordered a Fast Food!\n";
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        JavaFactoryPattern.main(args);
        assertEquals(expectedOut, stdout.toString());
    }
}
