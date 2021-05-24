/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Velux
 */
import java.util.HashMap;

public class IOU {

    private HashMap<String, Double> mapOfIOU;

    public IOU() {
        this.mapOfIOU = new HashMap<>();
    }

    public void setSum(String toWhom, double amount) {
        mapOfIOU.put(toWhom, amount);
    }

    public double howMuchDoIOweTo(String toWhom) {
        return mapOfIOU.getOrDefault(toWhom, 0.0);
    }

}
