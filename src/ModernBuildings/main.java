package ModernBuildings;

import Database.Database;
import java.util.Arrays;

public class main {
    
    public static void main(String[] args) {
        CO2Rule cO2Rule1 = new CO2Rule(350, 600);
        TemperatureRule temperatureRule1 = new TemperatureRule(20, 23);
        
        TemperatureSensor temperatureSensor1 = new TemperatureSensor("Temperature Sensor1");
        TemperatureSensor temperatureSensor2 = new TemperatureSensor("Temperature Sensor2");
        TemperatureSensor temperatureSensor3 = new TemperatureSensor("Temperature Sensor3");
        
        CO2Sensor cO2Sensor1 = new CO2Sensor("CO2 Sensor1");
        CO2Sensor cO2Sensor2 = new CO2Sensor("CO2 Sensor2");
        CO2Sensor cO2Sensor3 = new CO2Sensor("CO2 Sensor3");
        
        Actuator window = new Actuator(false, "window");
        Actuator door = new Actuator(false, "door");
        Actuator ventilation = new Actuator(false, "ventilation");
        
        Building building = new Building("u140", "Campusvej 55, bygning 38", cO2Rule1, temperatureRule1);
        building.addSensors(Arrays.asList(temperatureSensor1, temperatureSensor2, temperatureSensor3, cO2Sensor1, cO2Sensor2, cO2Sensor3));
        building.addActuators(Arrays.asList(window, door, ventilation));
        
        building.checkTemperatureLimits();
        building.getSensors().forEach((sensor) -> { 
            if (sensor instanceof  TemperatureSensor) {
                TemperatureSensor tempSensor = (TemperatureSensor)sensor;
                System.out.println(tempSensor.getTemperature());
            }
        });
        building.getEvents().forEach((event) -> System.out.println(event.getTimeStamp() + " outofbounds " + event.isIsOutOfBounds()));
        building.getActuators().forEach(actuator -> System.out.println(actuator.isOpen()));
        
        Database db = new Database();
        db.addBuilding(building);
        db.getSensorInformation(building.getId()).forEach((key, value) -> System.out.println(key + " " + value));
    }
}
