package challenges.introduction.javacurrencyformatter;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.text.NumberFormat;
import java.util.Locale;

import static org.junit.Assert.assertEquals;

/**
 * Created by nino on 3/19/17.
 */
public class JavaCurrencyFormatterTest {
    private ByteArrayOutputStream stdout = new ByteArrayOutputStream();

    @Test
    public void test(){
        String[] args = null;
        String data = "12324.134";
        System.setOut(new PrintStream(stdout));
        System.setIn(new ByteArrayInputStream(data.getBytes()));

        NumberFormat usFormatter = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat indiaFormatter = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
        NumberFormat chinaFormatter = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat franceFormatter = NumberFormat.getCurrencyInstance(Locale.FRANCE);

        String expectedOut =
                "US: " +usFormatter.format(Double.parseDouble(data))+ "\n" +
                "India: " +indiaFormatter.format(Double.parseDouble(data))+ "\n" +
                "China: " +chinaFormatter.format(Double.parseDouble(data))+ "\n" +
                "France: " +franceFormatter.format(Double.parseDouble(data))+ "\n";

        JavaCurrencyFormatter.main(args);

        assertEquals(expectedOut, stdout.toString());
    }
}
