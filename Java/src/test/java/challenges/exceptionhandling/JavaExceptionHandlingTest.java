package challenges.exceptionhandling;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by nino on 3/25/17.
 */
public class JavaExceptionHandlingTest {
    int n, p, ans, expected;
    MyCalculator mc;

    @Before
    public void setUp(){
        n = p = ans = 0;
        expected = 1;
        mc = new MyCalculator();
    }

    @Test
    public void powerTest() throws Exception {
        ans = mc.power(n, p);

        assertEquals(expected, ans);
    }

    @Test
    public void powerSquaredTest() throws Exception {
        n = p = 2;
        expected = 4;
        ans = mc.power(n, p);

        assertEquals(expected, ans);
    }

    @Test(expected=Exception.class)
    public void powerNegSquaredTest() throws Exception {
        n = -2;
        p = 3;
        ans = mc.power(n, p);
    }

    @Test(expected=Exception.class)
    public void powerExceptionThrownTest() throws Exception {
        n = 1;
        p = -2;
        ans = mc.power(n, p);
    }
}
