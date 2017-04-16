package challenges.advanced;

import org.junit.Test;

/**
 * Created by nino on 4/15/17.
 */
public class JavaSingletonPatternTest {
    @Test
    public void singletonTest(){
        JavaSingletonPattern singleton = JavaSingletonPattern.getSingleInstance();
    }
}
