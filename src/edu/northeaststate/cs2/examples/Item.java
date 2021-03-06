/**
 * -------------------------------------------------
 * File name: Item.java
 * Project name: CS2 Examples
 * -------------------------------------------------
 * Creator's name: John McMeen
 * Email: jnmcmeen@northeaststate.edu
 * Course and section: CISP 1020
 * Creation date: Feb 6, 2021
 * -------------------------------------------------
 */
package edu.northeaststate.cs2.examples;
/**
 * Models a role playing game Item
 */
public class Item {
    private String name;
    private double value;

    /**
     * Default class constructor that uses default values
     * @return None
     */
    public Item() {
        this.name = "";
        this.value = 0;
    }

    /**
     * Parameterized class constructor specifying the items name and value
     * @return None
     */
    public Item(String name, double value) {
        this.name = name;
        this.value = value;
    }

    /**
     * Returns the name attribute for Item
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name attribute for Item
     * @param name the item's name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Returns the value attribute for Item
     * @return
     */
    public double getValue() {
        return value;
    }


    /**
     * Method description: Sets the value attribute for Item
     * @param value the item's worth in unspecified units
     */
    public void setValue(double value) {
        this.value = value;
    }

    /**
     * Creates a string representation of the object
     * @return generated string
     */
    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", value=" + value +
                '}';
    }
}
