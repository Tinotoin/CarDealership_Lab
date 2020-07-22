import Parts.Engine;
import Parts.Gearbox;
import Parts.Part;
import Parts.Tyres;
import Vehicles.Car;
import Vehicles.Vehicle;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    Customer customer;
    Car car;
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
        customer = new Customer(5000);

    }

    @Test
    public void canBuyCar(){
        customer.buyCar(car);
        assertEquals(4000, customer.getMoney());
        assertEquals(1, customer.getVehicles().size());
    }



}
