/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModernBuildings;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author Yourk
 */
public class TemperatureSensor extends Sensor {
    private double temperature;
    
    public TemperatureSensor() {
        super();
        this.temperature = ThreadLocalRandom.current().nextDouble(18.0, 24.0);
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }
    
}
