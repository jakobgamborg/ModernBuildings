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
public class CO2Event extends Event {
    private CO2Rule cO2Rule;

    public CO2Event(CO2Rule cO2Rule, boolean isOutOfBounds) {
        super(isOutOfBounds);
        this.cO2Rule = cO2Rule;
    }
    
    
    
}
