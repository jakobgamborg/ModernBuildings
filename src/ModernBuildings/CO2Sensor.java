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
public class CO2Sensor extends Sensor{
    private double levelCO2;

    public CO2Sensor() {
        super();
    }

    public double getLevelCO2() {
        return levelCO2;
    }

    public void setLevelCO2(double levelCO2) {
        this.levelCO2 = levelCO2;
    }
    
    
}
