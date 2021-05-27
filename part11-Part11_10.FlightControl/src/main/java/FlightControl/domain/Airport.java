/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FlightControl.domain;

/**
 *
 * @author Velux
 */
public class Airport {

    private final String code;
    private final String location;

    public Airport(String code, String location) {
        this.code = code;
        this.location = location;
    }

    public String getCode() {
        return code;
    }

    public String getLocation() {
        return location;
    }

    @Override
    public String toString() {
        return code + " (" + location + ")";
    }
}
