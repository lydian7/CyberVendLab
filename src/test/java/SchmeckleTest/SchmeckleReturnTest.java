package SchmeckleTest;

import org.junit.Before;
import org.junit.Test;
import schmeckles.Schmeckle;
import schmeckles.SchmeckleReturn;
import schmeckles.SchmeckleType;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class SchmeckleReturnTest {

    SchmeckleReturn schmeckleReturn;
    Schmeckle schmeckle;
    ArrayList<Schmeckle> schmeckles;

    @Before
    public void setUp(){
        schmeckle = new Schmeckle(SchmeckleType.MONKEY);
        schmeckles = new ArrayList<>();
        schmeckles.add(schmeckle);
        schmeckleReturn = new SchmeckleReturn(schmeckles);
    }

    @Test
    public void canAddSchmeckleToList() {
        Schmeckle schmeckle = new Schmeckle(SchmeckleType.FIDY);
        schmeckleReturn.addSchmeckle(schmeckle);
        assertEquals(2, schmeckleReturn.getSchmeckles().size());
    }

    @Test
    public void canGetTotal() {
        assertEquals(500, schmeckleReturn.getTotal());
    }
}
