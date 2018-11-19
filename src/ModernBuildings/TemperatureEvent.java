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
public class TemperatureEvent extends Event {
    private TemperatureRule temperatureRule;
    
    public TemperatureEvent(TemperatureRule temperatureRule, boolean isOutOfBounds) {
        super(isOutOfBounds);
        this.temperatureRule = temperatureRule;
    }
    
}
