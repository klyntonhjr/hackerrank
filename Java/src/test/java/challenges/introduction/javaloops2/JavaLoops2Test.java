package challenges.introduction.javaloops2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

/**
 * Created by nino on 3/17/17.
 */
public class JavaLoops2Test {
    private ByteArrayOutputStream stdout = new ByteArrayOutputStream();
    private InputStream stdin = System.in;

    /* Series Inputs */
    private int q; // 0 <= q <= 500
    private int a; // 0 <= a <= 50
    private int b; // 0 <= a <= 50
    private int n; // 1 <= n <= 15

    @Before
    public void setUp(){
        System.setOut(new PrintStream(stdout));
        System.setIn(stdin);
    }

    @After
    public void tearDown(){
        System.setOut(null);
        System.setIn(null);
        q = -1;
        a = -1;
        b = -1;
        n = -1;
    }

    @Test
    public void seriesLowestBoundTest(){
        String[] args = null;
        q = 1; a = 0; b = 0; n = 1;

        final String DATA = q + "\n" + a + " " + b + " " + n;
        System.setIn(new ByteArrayInputStream(DATA.getBytes()));

        JavaLoops2.main(args);

        String EXPECTED = "0";

        assertEquals(EXPECTED, stdout.toString().trim());
    }

    @Test
    public void seriesLowNTest(){
        String[] args = null;
        q = 1; a = 2; b = 2; n = 1;

        final String DATA = q + "\n" + a + " " + b + " " + n;
        System.setIn(new ByteArrayInputStream(DATA.getBytes()));

        JavaLoops2.main(args);

        String EXPECTED = "4";

        assertEquals(EXPECTED, stdout.toString().trim());
    }

    @Test
    public void seriesQIs2Test(){
        String[] args = null;
        q = 2; a = 2; b = 2; n = 2;

        final String DATA = q + "\n" + a + " " + b + " " + n + "\n" + a + " " + b + " " + n;
        System.setIn(new ByteArrayInputStream(DATA.getBytes()));

        JavaLoops2.main(args);

        String EXPECTED = "4 8\n4 8";

        assertEquals(EXPECTED, stdout.toString().trim());
    }
}
