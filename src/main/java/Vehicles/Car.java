package Vehicles;

import Parts.Part;

import java.util.ArrayList;

public class Car extends Vehicle{

    public Car(String name, int price, String colour, int damage, ArrayList<Part> parts) {
        super(name, price, colour, damage, parts);
    }
}
