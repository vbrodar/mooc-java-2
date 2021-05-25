/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Velux
 */
import java.util.ArrayList;

public class Box implements Packable {

    private double maxCapacity;
    private ArrayList<Packable> itemsInBox;

    public Box(double maxCapacity) {
        this.maxCapacity = maxCapacity;
        this.itemsInBox = new ArrayList<>();
    }

    public double weight() {
        double sum = 0;
        for (Packable item : itemsInBox) {
            sum += item.weight();
        }
        return (double) sum;
    }

    public void add(Packable itemToPack) {
        if (this.weight() + itemToPack.weight() <= maxCapacity) {
            itemsInBox.add(itemToPack);
        }
    }

    public String toString() {
        return "Box: " + itemsInBox.size() + " items, total weight " + this.weight() + " kg";
    }
}
