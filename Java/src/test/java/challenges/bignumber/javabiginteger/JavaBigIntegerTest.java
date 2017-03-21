package challenges.bignumber.javabiginteger;

import challenges.bignumber.javabiginteger.JavaBigInteger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.math.BigInteger;

import static org.junit.Assert.assertEquals;

/**
 * Created by nino on 3/21/17.
 */
public class JavaBigIntegerTest {
    private final String[] args = null;
    private ByteArrayOutputStream stdout = new ByteArrayOutputStream();
    private String data;
    private String expected;
    private BigInteger a, b;

    private final String LONG_MAX_VALUE = "9223372036854775808";

    @Before
    public void setUp(){
        System.setOut(new PrintStream(stdout));
        data = null;
        expected = null;
        a = null;
        b = null;
    }

    @After
    public void tearDown(){
        System.setOut(null);
        stdout.reset();
    }

    @Test
    public void addAndMultiplyTwoBigIntsTest(){
        a = new BigInteger(LONG_MAX_VALUE);
        b = new BigInteger("2");
        data = a.toString() + "\n" + b.toString();
        
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        
        JavaBigInteger.main(args);

        expected = a.add(b).toString() + "\n" + a.multiply(b).toString() + "\n";
        assertEquals(expected, stdout.toString());
    }
}
