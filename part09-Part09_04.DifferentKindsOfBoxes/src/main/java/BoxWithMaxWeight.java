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

public class BoxWithMaxWeight extends Box {

    private ArrayList<Item> itemsInMaxBox;
    private int capacity;

    public BoxWithMaxWeight(int capacity) {
        this.itemsInMaxBox = new ArrayList<>();
        this.capacity = capacity;
    }

    public int currentAmount() {
        int sum = 0;
        for (Item i : itemsInMaxBox) {
            sum += i.getWeight();
        }
        return sum;
    }

    public void add(Item item) {
        if (currentAmount() + item.getWeight() <= this.capacity) {
            itemsInMaxBox.add(item);
        }
    }

    public boolean isInBox(Item item) {
        return itemsInMaxBox.contains(item);
    }
}
