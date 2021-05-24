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

public class StorageFacility {

    private HashMap<String, ArrayList<String>> storageHashMap;

    public StorageFacility() {
        this.storageHashMap = new HashMap<>();
    }

    public void add(String unit, String item) {
        this.storageHashMap.putIfAbsent(unit, new ArrayList<>());
        this.storageHashMap.get(unit).add(item);
    }

    public ArrayList<String> contents(String storageUnit) {
        ArrayList<String> emptyList = new ArrayList<>();
        return this.storageHashMap.getOrDefault(storageUnit, emptyList); // Contents is returning either value of storageUnit or newly initiated emptyList
    }

    public void remove(String storageUnit, String item) {
        this.storageHashMap.get(storageUnit).remove(item);
        if (this.storageHashMap.get(storageUnit).isEmpty()) {
            this.storageHashMap.remove(storageUnit);
        }
    }

    public ArrayList<String> storageUnits() {
        ArrayList<String> storageUnitKeys = new ArrayList<>();
        for (String item : storageHashMap.keySet()) {
            if (!storageHashMap.get(item).isEmpty()) {
                storageUnitKeys.add(item);
            }
        }
        return storageUnitKeys;
    }
}
