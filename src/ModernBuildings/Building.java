/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModernBuildings;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

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
    private List<Event> events = new ArrayList<>();

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

    public List<Event> getEvents() {
        return events;
    }

    public void setEvents(List<Event> events) {
        this.events = events;
    }

    public void setEvent(Event event) {
        this.events.add(event);
    }

    public String toString() {
        return this.getName() + " " + this.getId();
    }

    public void checkTemperatureLimits() {
        List<TemperatureSensor> temperatureSensors = this.sensors.stream().filter((sensor) -> sensor instanceof TemperatureSensor).map(sensor -> (TemperatureSensor) sensor).collect(Collectors.toList());
        double avgTemp = temperatureSensors.stream().mapToDouble(sensor -> sensor.getTemperature()).average().orElse(Double.NaN);
        if (temperatureRule.getMaxTemperature() <= avgTemp) {
            this.events.add(new TemperatureEvent(temperatureRule, true));
            this.actuators.forEach(actuator -> actuator.open());
        } else if (temperatureRule.getMinTemperature() >= avgTemp) {
            this.events.add(new TemperatureEvent(temperatureRule, true));
            this.actuators.forEach(actuator -> actuator.close());
        } else {
            this.events.add(new TemperatureEvent(temperatureRule, false));
        }
    }

    public void checkCO2Limits() {
         List<CO2Sensor> cO2Sensors = this.sensors.stream().filter((sensor) -> sensor instanceof CO2Sensor).map(sensor -> (CO2Sensor) sensor).collect(Collectors.toList());
        double avgCO2 = cO2Sensors.stream().mapToDouble(sensor -> sensor.getLevelCO2()).average().orElse(Double.NaN);
        if (cO2Rule.getMaxCO2Level()<= avgCO2) {
            this.events.add(new CO2Event(cO2Rule, true));
            this.actuators.forEach(actuator -> actuator.open());
        } else if (cO2Rule.getMinCO2Level()>= avgCO2) {
            this.events.add(new CO2Event(cO2Rule, true));
            this.actuators.forEach(actuator -> actuator.close());
        } else {
            this.events.add(new CO2Event(cO2Rule, false));
        }
    }

}
