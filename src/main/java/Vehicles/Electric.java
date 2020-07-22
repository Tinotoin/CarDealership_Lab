package Vehicles;

import Parts.Part;

import java.util.ArrayList;

public class Electric extends Vehicle{
    public Electric(String name, int price, String colour, int damage, ArrayList<Part> parts) {
        super(name, price, colour, damage, parts);
    }
}
