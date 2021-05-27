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
import java.util.Random;

public class TemperatureSensor implements Sensor {

    private int value;
    private boolean status;

    public TemperatureSensor() {
        this.status = false;
    }

    @Override
    public boolean isOn() {
        return status;
    }

    @Override
    public void setOn() {
        status = true;
    }

    @Override
    public void setOff() {
        status = false;
    }

    @Override
    public int read() {
        if (!this.isOn()) {
            throw new IllegalStateException("sensor is off");
        }
        Random random = new Random();
        int max = 30;
        int min = -30;
        value = random.nextInt((max - min) + 1) + min;
        return value;
    }
}
