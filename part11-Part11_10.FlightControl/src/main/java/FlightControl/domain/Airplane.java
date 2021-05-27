/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FlightControl.domain;

/**
 *
 * @author Velux
 */
public class Airplane {

    private final String ID;
    private final int capacity;

    public Airplane(String ID, int capacity) {
        this.ID = ID;
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getID() {
        return ID;
    }

    @Override
    public String toString() {
        return ID + " (" + capacity + " capacity)";
    }
}
