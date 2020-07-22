import Parts.Part;
import Parts.Engine;
import Parts.Gearbox;
import Parts.Tyres;
import Vehicles.Car;
import Vehicles.Vehicle;
import Vehicles.Electric;
import Vehicles.Hybrid;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class VehicleTest {

    Car car;
    Electric electric;
    Hybrid hybrid;
    Gearbox gearbox;
    Engine engine;
    Tyres tyres;
    ArrayList<Part> parts;

    @Before
    public void before(){
        gearbox = new Gearbox("Tomy", 5);
        engine = new Engine("Honda", "Petrol");
        tyres = new Tyres("Dunlop", "Slick");
        parts = new ArrayList<Part>();
        parts.add(engine);
        parts.add(gearbox);
        parts.add(tyres);
        car = new Car("Mondeo", 1000, "white", 0, parts);

    }

    @Test
    public void makeCar(){
        assertEquals("Mondeo", car.getName());
        assertEquals(1000, car.getPrice());
        assertEquals("white", car.getColour());
        assertEquals(3, car.getParts().size());

    }

//    @Test
//    public void canCalculateDamage(){
//        car.addDamage(100);
//        assertEquals(900, car.getPrice());
//        assertEquals(100, car.getPrice());
//    }
}
