package challenges.introduction;

import challenges.introduction.JavaIfElse;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

/**
 * Created by nino on 3/15/17.
 */
public class JavaIfElseTest {
    private final ByteArrayOutputStream stdout = new ByteArrayOutputStream();
    private final InputStream stdin = System.in;
    // All data inputs are in range 1 <= n <= 100
    private String dataInput;
    private String EXPECTED;
    private final String[] args = null;

    @Before
    public void setUp(){
        System.setOut(new PrintStream(stdout));
        System.setIn(stdin);
    }

    @After
    public void tearDown(){
        System.setOut(null);
        System.setIn(null);
        dataInput = null;
        EXPECTED = null;
    }

    @Test
    public void ifOddPrintWeirdTest(){
        dataInput = "3";
        EXPECTED = "Weird";
        System.setIn(new ByteArrayInputStream(dataInput.getBytes()));
        JavaIfElse.main(args);
        assertEquals(EXPECTED, stdout.toString().trim());
    }

    @Test
    public void ifEvenAndBetween2And5PrintNotWeirdTest(){
        dataInput = "2";
        EXPECTED = "Not Weird";
        System.setIn(new ByteArrayInputStream(dataInput.getBytes()));
        JavaIfElse.main(args);
        assertEquals(EXPECTED, stdout.toString().trim());
    }

    @Test
    public void ifEvenAndBetween6And20PrintWeirdTest(){
        dataInput = "6";
        EXPECTED = "Weird";
        System.setIn(new ByteArrayInputStream(dataInput.getBytes()));
        JavaIfElse.main(args);
        assertEquals(EXPECTED, stdout.toString().trim());
    }

    @Test
    public void ifEvenAndGreaterThan20PrintWeirdTest(){
        dataInput = "22";
        EXPECTED = "Not Weird";
        System.setIn(new ByteArrayInputStream(dataInput.getBytes()));
        JavaIfElse.main(args);
        assertEquals(EXPECTED, stdout.toString().trim());
    }
}
