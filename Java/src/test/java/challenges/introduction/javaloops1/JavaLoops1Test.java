package challenges.introduction.javaloops1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.*;
import java.util.concurrent.ThreadLocalRandom;

import static org.junit.Assert.assertEquals;

/**
 * Created by nino on 3/16/17.
 */
public class JavaLoops1Test {
    private final ByteArrayOutputStream stdout = new ByteArrayOutputStream();
    private final InputStream stdin = System.in;
    private final int MIN = 2;
    private final int MAX = 20;

    @Before
    public void setUp(){
        System.setOut(new PrintStream(stdout));
        System.setIn(stdin);
    }

    @After
    public void tearDown(){
        System.setOut(null);
        System.setIn(null);
    }

    @Test
    public void xTimeTablesTest(){
        String[] args = null;
        final int DATA = ThreadLocalRandom.current().nextInt(MIN, MAX+1);
        System.setIn(new ByteArrayInputStream(Integer.toString(DATA).getBytes()));

        JavaLoops1.main(args);

        String EXPECTED = "";
        for(int i=1; i<=10; i++){
            EXPECTED += DATA + " x " + i + " = " + DATA*i + "\n";
        }
        EXPECTED = EXPECTED.trim();

        assertEquals(EXPECTED, stdout.toString().trim());
    }
}
