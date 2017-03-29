package challenges.oop;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by nino on 3/28/17.
 */
public class JavaInheritanceITest {
    private final String[] args = null;
    private final ByteArrayOutputStream stdout = new ByteArrayOutputStream();
    private String output;

    @Before
    public void setUp(){
        System.setOut(new PrintStream(stdout));
    }

    @After
    public void tearDown(){
        System.setOut(null);
        stdout.reset();
        output = null;
    }

    @Test
    public void animalWalkTest(){
        Animal a = new Animal();
        a.walk();

        output = "I am walking\n";
        assertEquals(output, stdout.toString());
    }

    @Test
    public void birdWalkTest(){
        Bird b = new Bird();
        b.walk();

        output = "I am walking\n";
        assertEquals(output, stdout.toString());
    }

    @Test
    public void birdFlyTest(){
        Bird b = new Bird();
        b.fly();

        output = "I am flying\n";
        assertEquals(output, stdout.toString());
    }

    @Test
    public void birdSingTest(){
        Bird b = new Bird();
        b.sing();

        output = "I am singing\n";
        assertEquals(output, stdout.toString());
    }

    @Test
    public void javaInheritanceTest(){
        JavaInheritanceI.main(args);

        output = "I am walking\n" +
                "I am flying\n" +
                "I am singing\n";
        assertEquals(output, stdout.toString());
    }
}
