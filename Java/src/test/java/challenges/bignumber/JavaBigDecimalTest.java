package challenges.bignumber;

import challenges.bignumber.JavaBigDecimal;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

/**
 * Created by nino on 3/21/17.
 */
public class JavaBigDecimalTest {
    private String[] args = null;
    private ByteArrayOutputStream stdout = new ByteArrayOutputStream();
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
    public void bigDecimalAlreadySortedTest(){
        data = "2\n2\n1";
        expected = "2\n1\n";

        System.setIn(new ByteArrayInputStream(data.getBytes()));

        JavaBigDecimal.main(args);

        assertEquals(expected, stdout.toString());
    }

    @Test
    public void bigDecimalSortTest(){
        data = "2\n1\n2";
        expected = "2\n1\n";

        System.setIn(new ByteArrayInputStream(data.getBytes()));

        JavaBigDecimal.main(args);

        assertEquals(expected, stdout.toString());
    }

    @Test
    public void bigDecimalSortMoreThan2ItemsTest(){
        data = "9\n" +
                "-100\n" +
                "50\n" +
                "0\n" +
                "56.6\n" +
                "90\n" +
                "0.12\n" +
                ".12\n" +
                "02.34\n" +
                "000.000";
        expected = "90\n" +
                "56.6\n" +
                "50\n" +
                "02.34\n" +
                "0.12\n" +
                ".12\n" +
                "0\n" +
                "000.000\n" +
                "-100\n";

        System.setIn(new ByteArrayInputStream(data.getBytes()));

        JavaBigDecimal.main(args);

        assertEquals(expected, stdout.toString());
    }
}
