package ProductTests;

import org.junit.Before;
import org.junit.Test;
import products.NeuraMass;

import static org.junit.Assert.assertEquals;

public class NeuraMassTest {

    NeuraMass neuraMass;

    @Before
    public void before(){
        neuraMass = new NeuraMass("NeuraRoids", 1000);
    }

    @Test
    public void hasName() {
        assertEquals("NeuraRoids", neuraMass.getName());
    }

    @Test
    public void hasPrice() {
        assertEquals(1000, neuraMass.getPrice());
    }
}
