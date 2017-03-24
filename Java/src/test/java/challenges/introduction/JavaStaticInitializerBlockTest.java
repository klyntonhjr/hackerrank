package challenges.introduction;

import challenges.introduction.JavaStaticInitializerBlock;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

/**
 * Created by nino on 3/18/17.
 *
 * BECAUSE OF THE WAY GARBAGE COLLECTION WORKS IN JAVA
 * AND THIS CHALLENGE INVOLVES CLASS VARIABLES
 * ************ DO NOT ********************************
 * RUN THE WHOLE TEST CLASS BUT RUN EACH TEST INDIVIDUALLY
 */
public class JavaStaticInitializerBlockTest {
    private final ByteArrayOutputStream stdout = new ByteArrayOutputStream();
    private final InputStream stdin = System.in;
    private final String[] args = null;
    private String data = null;
    private String expected = null;

    @Before
    public void setUp(){
        System.setOut(new PrintStream(stdout));
        System.setIn(stdin);
        data = null;
        expected = null;
    }

    @After
    public void tearDown(){
        System.setOut(null);
        System.setIn(null);
    }

    @Test
    public void staticInitBlockTest(){
        data = "2\n3";
        expected = "6";

        System.setIn(new ByteArrayInputStream(data.getBytes()));

        JavaStaticInitializerBlock.main(args);

        assertEquals(expected, stdout.toString());
    }

    @Test
    public void staticInitBlockAreaZeroTest(){
        data = "0\n3";
        expected = "java.lang.Exception: Breadth and height must be positive";

        System.setIn(new ByteArrayInputStream(data.getBytes()));

        JavaStaticInitializerBlock.main(args);

        assertEquals(expected, stdout.toString());
    }

    @Test
    public void staticInitBlockThrowExceptionTest(){
        data = "-1\n-1";
        expected = "java.lang.Exception: Breadth and height must be positive";

        System.setIn(new ByteArrayInputStream(data.getBytes()));

        JavaStaticInitializerBlock.main(args);

        assertEquals(expected, stdout.toString());
    }
}
