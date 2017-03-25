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
public class JavaListTest {
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
    public void insertCmdTest() throws Exception {
        data = "1\n" +
                "0\n" +
                "1\n" +
                "Insert\n" +
                "1 7";
        expected = "0 7";

        System.setIn(new ByteArrayInputStream(data.getBytes()));

        JavaList.main(args);

        assertEquals(expected, stdout.toString());
    }

    @Test
    public void deleteCmdTest() throws Exception {
        data = "2\n" +
                "0 7\n" +
                "1\n" +
                "Delete\n" +
                "1";
        expected = "0";

        System.setIn(new ByteArrayInputStream(data.getBytes()));

        JavaList.main(args);

        assertEquals(expected, stdout.toString());
    }
}
