/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Velux
 */
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;

public class Warehouse {

    private Map<String, Integer> prices;
    private Map<String, Integer> stockBalance;

    public Warehouse() {
        this.prices = new HashMap<>();
        this.stockBalance = new HashMap<>();
    }

    public int price(String product) {
        return prices.getOrDefault(product, -99);
    }

    public void addProduct(String product, int price, int stock) {
        prices.put(product, price);
        stockBalance.put(product, stock);
    }

    public int stock(String product) {
        return stockBalance.getOrDefault(product, 0);
    }

    public boolean take(String product) {
        if (this.stock(product) > 0) {
            stockBalance.put(product, stockBalance.get(product) - 1);
            return true;
        }
        return false;
    }

    public Set<String> products() {
        Set<String> productNameSet = new HashSet<>();
        for (String key : prices.keySet()) {
            productNameSet.add(key);
        }
        return productNameSet;
    }
}
