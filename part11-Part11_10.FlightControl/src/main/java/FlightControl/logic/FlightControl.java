/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FlightControl.logic;

/**
 *
 * @author Velux
 */
import FlightControl.ui.UserInterface;
import FlightControl.domain.*;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class FlightControl {

    private final Map<String, Airport> airportsDataStorage;
    private final Map<String, Airplane> airplanesDataStorage;
    private final Map<String, Flight> flightsDataStorage;

    public FlightControl() {
        this.airplanesDataStorage = new HashMap<>();
        this.airportsDataStorage = new HashMap<>();
        this.flightsDataStorage = new HashMap<>();
    }

    public void addAirplane(String ID, int capacity) {
        airplanesDataStorage.putIfAbsent(ID, new Airplane(ID, capacity));
    }

    private void addAirport(String code, String location) {
        airportsDataStorage.putIfAbsent(code, new Airport(code, location));
    }

    private Flight createFlightAndGenerateCode(Airplane airplane, Airport departure, Airport destination) {
        return new Flight(airplane, departure, destination);
    }

    private Airport getAirportByID(String code) {
        addAirport(code, code);
        return airportsDataStorage.get(code);
    }

    public void addFlight(Airplane airplane, String departureID, String destinationID) {
        Flight tempFlight = createFlightAndGenerateCode(airplane, getAirportByID(departureID), getAirportByID(destinationID));
        flightsDataStorage.putIfAbsent(tempFlight.getCode(), tempFlight);
    }

    public Collection<Airplane> getAirplanes() {
        return airplanesDataStorage.values();
    }

    public Collection<Flight> getFlights() {
        return flightsDataStorage.values();
    }

    public Airplane getAirplane(String ID) {
        return airplanesDataStorage.get(ID);
    }
}
