package challenges.exceptionhandling;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

/**
 * Created by nino on 3/25/17.
 */
public class JavaExceptionHandlingTryCatchTest {
    private final String[] args = null;
    private final ByteArrayOutputStream stdout = new ByteArrayOutputStream();
    private String data, expected;

    @Before
    public void setUp(){
        System.setOut(new PrintStream(stdout));
        data = expected = null;
    }

    @After
    public void tearDown(){
        System.setOut(null);
        stdout.reset();
    }

    @Test
    public void divisionTest() {
        data = "10\n" +
                "2";
        expected = "5";

        System.setIn(new ByteArrayInputStream(data.getBytes()));
        JavaExceptionHandlingTryCatch.main(args);
        assertEquals(expected, stdout.toString());
    }

    @Test
    public void throwInputMismatchExceptionTest() {
        data = "10\n" +
                "Hello";
        expected = "java.util.InputMismatchException";

        System.setIn(new ByteArrayInputStream(data.getBytes()));
        JavaExceptionHandlingTryCatch.main(args);
        assertEquals(expected, stdout.toString());
    }

    @Test
    public void throwArithmeticExceptionTest() {
        data = "10\n" +
                "0";
        expected = "java.lang.ArithmeticException: / by zero";

        System.setIn(new ByteArrayInputStream(data.getBytes()));
        JavaExceptionHandlingTryCatch.main(args);
        assertEquals(expected, stdout.toString());
    }
}
