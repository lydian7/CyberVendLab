package ProductTests;

import org.junit.Before;
import org.junit.Test;
import products.CyberEyez;

import static org.junit.Assert.assertEquals;

public class CyberEyezTest {

    CyberEyez cyberEyez;

    @Before
    public void before(){
        cyberEyez = new CyberEyez("Retinagasm", 250);
    }

    @Test
    public void hasName() {
        assertEquals("Retinagasm", cyberEyez.getName());
    }

    @Test
    public void hasPrice() {
        assertEquals(250, cyberEyez.getPrice());
    }
}
