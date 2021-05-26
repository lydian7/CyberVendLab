package ProductTests;

import org.junit.Before;
import org.junit.Test;
import products.GorillaArmz;

import static org.junit.Assert.assertEquals;

public class GorillaArmzTest {

    GorillaArmz gorillaArmz;

    @Before
    public void before(){
        gorillaArmz = new GorillaArmz("Smasherz", 500);
    }

    @Test
    public void hasName() {
        assertEquals("Smasherz", gorillaArmz.getName());
    }

    @Test
    public void hasPrice() {
        assertEquals(500, gorillaArmz.getPrice());
    }

}
