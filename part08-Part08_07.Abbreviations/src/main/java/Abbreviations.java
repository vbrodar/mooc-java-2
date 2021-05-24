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

public class Abbreviations {

    private HashMap<String, String> abbreviationsMap;

    public Abbreviations() {
        this.abbreviationsMap = new HashMap<>();

    }

    public void addAbbreviation(String abbreviation, String explanation) {
        abbreviationsMap.put(abbreviation, explanation);
    }

    public boolean hasAbbreviation(String abbreviation) {
        return abbreviationsMap.get(abbreviation) != null;
    }

    public String findExplanationFor(String abbreviation) {
        return abbreviationsMap.get(abbreviation);
    }
}
