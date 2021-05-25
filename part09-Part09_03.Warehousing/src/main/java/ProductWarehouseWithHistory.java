/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Velux
 */
public class ProductWarehouseWithHistory extends ProductWarehouse {

    private ChangeHistory historyListObject = new ChangeHistory();

    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
        super(productName, capacity);
        super.addToWarehouse(initialBalance);
        historyListObject.add(initialBalance);
    }

    public void addToWarehouse(double amount) {
        double result = 0;

        result = (double) super.getBalance() + amount;

        historyListObject.add(result);

        super.addToWarehouse(amount);
    }

    public double takeFromWarehouse(double amount) {
        double result = 0;

        result = (double) super.getBalance() - amount;

        //the difference is added not just the amount
        historyListObject.add(result);

        return super.takeFromWarehouse(amount);

    }

    public String history() {
        return historyListObject.toString();
    }

    public void printAnalysis() {

        System.out.println("Product: " + this.getName());

        System.out.println("History: " + historyListObject.toString());

        System.out.println("Largest amount of product: " + historyListObject.maxValue());

        System.out.println("Smallest amount of product:" + historyListObject.minValue());

        System.out.println("Average: " + historyListObject.average());

    }
}
