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
import java.util.HashMap;

public class VehicleRegistry {

    private HashMap<LicensePlate, String> liPlatehashMap;

    public VehicleRegistry() {
        this.liPlatehashMap = new HashMap<>();

    }

    public boolean add(LicensePlate liPlate, String owner) {
        for (LicensePlate item : liPlatehashMap.keySet()) {
            if (item.equals(liPlate)) {
                return false;
            }
        }
        liPlatehashMap.put(liPlate, owner);
        return true;
    }

    public String get(LicensePlate licensePlate) {
        return liPlatehashMap.getOrDefault(licensePlate, null);
    }

    public boolean remove(LicensePlate licensePlate) {
        if (!liPlatehashMap.containsKey(licensePlate)) {
            return false;
        }
        liPlatehashMap.remove(licensePlate);
        return true;
    }

    public void printLicensePlates() {
        for (LicensePlate item : liPlatehashMap.keySet()) {
            System.out.println(item);
        }
    }

    public void printOwners() {
        ArrayList<String> ownerList = new ArrayList<>();
        for (String item : liPlatehashMap.values()) {
            if (!ownerList.contains(item)) {
                ownerList.add(item);
            }
        }
        for (String item : ownerList) {
            System.out.println(item);
        }
    }
}
