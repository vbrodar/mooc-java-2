/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

/**
 *
 * @author Velux
 */
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AverageSensor implements Sensor {

    private List<Sensor> sensorCollection;
    private List<Integer> readings;

    public AverageSensor() {
        this.sensorCollection = new ArrayList<>();
        this.readings = new ArrayList<>();
    }

    private boolean manageStatus() {
        return (sensorCollection.stream().allMatch(x -> x.isOn()) && !sensorCollection.isEmpty());
    }

    public void addSensor(Sensor toAdd) {
        sensorCollection.add(toAdd);
    }

    public List<Integer> readings() {
        return readings;
    }

    @Override
    public boolean isOn() {
        return manageStatus();
    }

    @Override
    public void setOn() {
        sensorCollection.stream().forEach(sensor -> sensor.setOn());
    }

    @Override
    public void setOff() {
        sensorCollection.stream().forEach(sensor -> sensor.setOff());
    }

    @Override
    public int read() {
        if (!this.isOn() || sensorCollection.isEmpty()) {
            throw new IllegalStateException("sensor is off or empty");
        }
        int read = (int) sensorCollection.stream().mapToInt(sensor -> sensor.read()).average().getAsDouble();
        readings.add(read);
        return read;
    }
}
