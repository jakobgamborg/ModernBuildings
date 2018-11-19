/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModernBuildings;

/**
 *
 * @author Yourk
 */
public class TemperatureSensor extends Sensor {
    private double temperature;

    public TemperatureSensor() {
        super();
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }
    
}
