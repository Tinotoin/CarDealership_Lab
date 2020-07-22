package Vehicles;

import Parts.Part;

import java.util.ArrayList;

public abstract class Vehicle {

    private String name;
    private int price;
    private String colour;
    private int damage;
    private ArrayList<Part> parts;

    public Vehicle(String name, int price, String colour, int damage, ArrayList<Part> parts) {
        this.name = name;
        this.price = price;
        this.colour = colour;
        this.damage = damage;
        this.parts = new ArrayList<Part>();
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public String getColour() {
        return colour;
    }

    public int getDamage() {
        return damage;
    }

    public ArrayList<Part> getParts() {
        return parts;
    }

//    public void addDamage(int dmgLevel){
//        this.price -= dmgLevel;
//        this.damage += dmgLevel;
//    }
}
