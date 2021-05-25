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
import java.util.Collections;
import java.util.Objects;

public class ChangeHistory {

    private ArrayList<Double> historyList;

    public ChangeHistory() {
        this.historyList = new ArrayList<>();
    }

    public void add(double status) {
        historyList.add(status);
    }

    public void clear() {
        historyList.clear();
    }

    public double maxValue() {
        if (historyList.isEmpty()) {
            return 0.0;
        }
        return Collections.max(historyList);
    }

    public double minValue() {
        if (historyList.isEmpty()) {
            return 0.0;
        }
        return Collections.min(historyList);
    }

    public double average() {
        int sum = 0;
        if (historyList.isEmpty()) {
            return 0.0;
        }
        for (double item : historyList) {
            sum += item;
        }
        return 1.0 * sum / historyList.size();
    }

    public String toString() {
        return historyList.toString();
    }
}
