package challenges.datastructures;

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
public class JavaArrayListTest {
    private final String[] args = null;
    private final ByteArrayOutputStream stdout = new ByteArrayOutputStream();
    private String data, expected;

    @Before
    public void setUp(){
        System.setOut(new PrintStream(stdout));
        data = expected = null;
    }

    @After
    public  void tearDown(){
        System.setOut(null);
        stdout.reset();
    }

    @Test
    public void arrayListTest(){
        data = "5\n" +
                "5 41 77 74 22 44\n" +
                "1 12\n" +
                "4 37 34 36 52\n" +
                "0\n" +
                "3 20 22 33\n" +
                "5\n" +
                "1 3\n" +
                "3 4\n" +
                "3 1\n" +
                "4 3\n" +
                "5 5";
        expected = "74\n" +
                "52\n" +
                "37\n" +
                "ERROR!\n" +
                "ERROR!\n";

        System.setIn(new ByteArrayInputStream(data.getBytes()));

        JavaArrayList.main(args);

        assertEquals(expected, stdout.toString());
    }
}
