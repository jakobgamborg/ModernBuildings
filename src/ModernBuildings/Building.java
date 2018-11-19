/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModernBuildings;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 *
 * @author Yourk
 */
public class Building {
    private UUID id;
    private String name;
    private String address;
    private List<Sensor> sensors = new ArrayList<>();
    private List<Actuator> actuators = new ArrayList<>();
    private CO2Rule cO2Rule;
    private TemperatureRule temperatureRule;
    
    public Building(String name, String address) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.address = address;
    }

    public Building(String name, String address, CO2Rule cO2Rule, TemperatureRule temperatureRule) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.address = address;
        this.cO2Rule = cO2Rule;
        this.temperatureRule = temperatureRule;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    public List<Sensor> getSensors() {
        return sensors;
    }

    public void setSensors(List<Sensor> sensors) {
        this.sensors = sensors;
    }

    public List<Actuator> getActuators() {
        return actuators;
    }

    public void setActuators(List<Actuator> actuators) {
        this.actuators = actuators;
    }

    public CO2Rule getcO2Rule() {
        return cO2Rule;
    }

    public void setcO2Rule(CO2Rule cO2Rule) {
        this.cO2Rule = cO2Rule;
    }

    public TemperatureRule getTemperatureRule() {
        return temperatureRule;
    }

    public void setTemperatureRule(TemperatureRule temperatureRule) {
        this.temperatureRule = temperatureRule;
    }
    
}
