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
import java.util.List;

public class Herd implements Movable {

    private List<Movable> herdList;

    public Herd() {
        this.herdList = new ArrayList<>();
    }

    public void addToHerd(Movable movable) {
        herdList.add(movable);
    }

    public void move(int dx, int dy) {
        for (Movable object : herdList) {
            object.move(dx, dy);
        }
    }

    public String toString() {
        String newString = "";

        for (Movable mov : herdList) {

            newString += mov.toString().trim() + "\n";
        }

        return newString;

    }
}
