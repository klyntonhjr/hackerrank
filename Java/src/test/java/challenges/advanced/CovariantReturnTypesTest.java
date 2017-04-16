package challenges.advanced;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by nino on 4/15/17.
 */
public class CovariantReturnTypesTest {
    private String expeceted, result;

    @Before
    public void setUp(){
        expeceted = result = null;
    }

    @Test
    public void flowerTest(){
        expeceted = "I have many names and types.";
        result = new Flower().whatsYourName();
        assertEquals(expeceted, result);
    }

    @Test
    public void jasmineTest(){
        expeceted = "Jasmine";
        result = new Jasmine().whatsYourName();
        assertEquals(expeceted, result);
    }

    @Test
    public void lilyTest(){
        expeceted = "Lily";
        result = new Lily().whatsYourName();
        assertEquals(expeceted, result);
    }

    @Test
    public void lotusTest(){
        expeceted = "Lotus";
        result = new Lotus().whatsYourName();
        assertEquals(expeceted, result);
    }

    @Test
    public void chekcReturnTypesTest(){
        Flower f = new State().yourNationalFlower();
        Jasmine j = new WestBengal().yourNationalFlower();
        Lotus l0 = new Karnataka().yourNationalFlower();
        Lily l1 = new AndhraPradesh().yourNationalFlower();
    }
}
