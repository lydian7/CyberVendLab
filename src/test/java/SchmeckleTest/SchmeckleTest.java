package SchmeckleTest;

import org.junit.Before;
import org.junit.Test;
import schmeckles.Schmeckle;
import schmeckles.SchmeckleType;

import static org.junit.Assert.assertEquals;

public class SchmeckleTest {

    Schmeckle schmeckle;

    @Before
    public void before(){
        schmeckle = new Schmeckle(SchmeckleType.MONKEY);
    }

    @Test
    public void canGetSchmeckle() {
        assertEquals(SchmeckleType.MONKEY, schmeckle.getSchmeckle());
    }
}
