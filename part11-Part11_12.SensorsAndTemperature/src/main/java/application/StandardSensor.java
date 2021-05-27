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
public class StandardSensor implements Sensor {

    private int value;

    public StandardSensor(int value) {
        this.value = value;
    }

    public boolean isOn() {
        return true;
    }

    @Override
    public void setOn() {
    }

    @Override
    public void setOff() {
    }

    @Override
    public int read() {
        return value;
    }
}
