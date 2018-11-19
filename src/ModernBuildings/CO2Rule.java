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
public class CO2Rule extends Rule {
    private double minCO2Level;
    private double maxCO2Level;

    public CO2Rule(double minCO2Level, double maxCO2Level) {
        super();
        this.minCO2Level = minCO2Level;
        this.maxCO2Level = maxCO2Level;
    }

    public double getMinCO2Level() {
        return minCO2Level;
    }

    public void setMinCO2Level(double minCO2Level) {
        this.minCO2Level = minCO2Level;
    }

    public double getMaxCO2Level() {
        return maxCO2Level;
    }

    public void setMaxCO2Level(double maxCO2Level) {
        this.maxCO2Level = maxCO2Level;
    }
    
}
