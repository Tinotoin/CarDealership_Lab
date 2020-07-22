import Parts.Engine;
import Parts.Gearbox;
import Parts.Tyres;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PartTest {

    Gearbox gearbox;
    Engine engine;
    Tyres tyres;

    @Before
    public void before(){
        gearbox = new Gearbox("Tomy", 5);
        engine = new Engine("Honda", "Petrol");
        tyres = new Tyres("Dunlop", "Slick");
    }

    @Test
    public void canMakeCar(){
        assertEquals("Tomy", gearbox.getMake());
        assertEquals("Honda", engine.getMake());
        assertEquals("Dunlop", tyres.getMake());
    }

}
