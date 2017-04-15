package challenges.datastructures;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

/**
 * Created by nino on 4/13/17.
 */
public class JavaPriorityQueueTest {
    private final String[] args = null;
    private final ByteArrayOutputStream stdout = new ByteArrayOutputStream();
    private String data, expectedOut;

    @Before
    public void setUp(){
        System.setOut(new PrintStream(stdout));
        data = expectedOut = null;
    }

    @After
    public void tearDown(){
        System.setOut(null);
        stdout.reset();
    }

    @Test
    public void enterAndServeStudentTest(){
        data = "1\n"
                + "ENTER John 3.75 50\n";
        expectedOut = "John\n";
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        JavaPriorityQueue.main(args);
        assertEquals(expectedOut, stdout.toString());
    }

    @Test
    public void prioritizeByCGPAStudentTest(){
        data = "3\n"
                + "ENTER John 3.75 50\n"
                + "ENTER Nino 4.00 40\n"
                + "SERVED";
        expectedOut = "John\n";
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        JavaPriorityQueue.main(args);
        assertEquals(expectedOut, stdout.toString());
    }

    @Test
    public void prioritizeByNameGivenEqualCGPAsStudentTest(){
        data = "3\n"
                + "ENTER Acb 4.00 50\n"
                + "ENTER Abc 4.00 40\n"
                + "SERVED";
        expectedOut = "Acb\n";
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        JavaPriorityQueue.main(args);
        assertEquals(expectedOut, stdout.toString());
    }

    @Test
    public void prioritizeByIdGivenEqualCGPAsAndNameStudentTest(){
        data = "3\n"
                + "ENTER John 4.00 50\n"
                + "ENTER John 4.00 40\n"
                + "SERVED";
        expectedOut = "John\n";
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        JavaPriorityQueue.main(args);
        assertEquals(expectedOut, stdout.toString());
    }

    @Test
    public void hackerrankCase0Test(){
        data = "12\n" +
                "ENTER John 3.75 50\n" +
                "ENTER Mark 3.8 24\n" +
                "ENTER Shafaet 3.7 35\n" +
                "SERVED\n" +
                "SERVED\n" +
                "ENTER Samiha 3.85 36\n" +
                "SERVED\n" +
                "ENTER Ashley 3.9 42\n" +
                "ENTER Maria 3.6 46\n" +
                "ENTER Anik 3.95 49\n" +
                "ENTER Dan 3.95 50\n" +
                "SERVED";
        expectedOut = "Dan\n" +
                "Ashley\n" +
                "Shafaet\n" +
                "Maria\n";
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        JavaPriorityQueue.main(args);
        assertEquals(expectedOut, stdout.toString());
    }

    @Test
    public void hackerrankCase1Test(){
        data = "21\n" +
                "ENTER Bidhan 3.75 50\n" +
                "ENTER Rijul 3.8 24\n" +
                "ENTER Shafaet 3.7 35\n" +
                "SERVED\n" +
                "SERVED\n" +
                "ENTER Samiha 3.85 36\n" +
                "SERVED\n" +
                "ENTER Ratul 3.9 42\n" +
                "ENTER Tanvir 3.6 46\n" +
                "ENTER Anik 3.95 49\n" +
                "ENTER Nisha 3.95 50\n" +
                "SERVED\n" +
                "SERVED\n" +
                "SERVED\n" +
                "SERVED\n" +
                "SERVED\n" +
                "SERVED\n" +
                "SERVED\n" +
                "SERVED\n" +
                "SERVED\n" +
                "SERVED";
        expectedOut = "EMPTY\n";
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        JavaPriorityQueue.main(args);
        assertEquals(expectedOut, stdout.toString());
    }
}
