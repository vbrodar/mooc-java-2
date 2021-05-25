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

public class MisplacingBox extends Box {

    private ArrayList<Item> misplacingBoxList;

    public MisplacingBox() {
        this.misplacingBoxList = new ArrayList<>();
    }

    public void add(Item item) {
        this.misplacingBoxList.add(item);
    }

    public boolean isInBox(Item item) {
        return false;
    }

}
