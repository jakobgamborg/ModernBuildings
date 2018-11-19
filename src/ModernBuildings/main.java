package ModernBuildings;

import java.util.Arrays;

public class main {
    
    public static void main(String[] args) {
        CO2Rule cO2Rule1 = new CO2Rule(350, 600);
        TemperatureRule temperatureRule1 = new TemperatureRule(20, 23);
        
        TemperatureSensor temperatureSensor1 = new TemperatureSensor();
        TemperatureSensor temperatureSensor2 = new TemperatureSensor();
        TemperatureSensor temperatureSensor3 = new TemperatureSensor();
        
        CO2Sensor cO2Sensor1 = new CO2Sensor();
        CO2Sensor cO2Sensor2 = new CO2Sensor();
        CO2Sensor cO2Sensor3 = new CO2Sensor();
        
        Actuator window = new Actuator(false);
        Actuator door = new Actuator(false);
        Actuator ventilation = new Actuator(false);
        
        Building building = new Building("u140", "Campusvej 55, bygning 38", cO2Rule1, temperatureRule1);
        building.setSensors(Arrays.asList(temperatureSensor1, temperatureSensor2, temperatureSensor3, cO2Sensor1, cO2Sensor2, cO2Sensor3));
        building.setActuators(Arrays.asList(window, door, ventilation));
        
        building.checkTemperatureLimits();
        building.getSensors().forEach((sensor) -> { 
            if (sensor instanceof  TemperatureSensor) {
                TemperatureSensor tempSensor = (TemperatureSensor)sensor;
                System.out.println(tempSensor.getTemperature());
            }
        });
        building.getEvents().forEach((event) -> System.out.println(event.getTimeStamp() + " outofbounds " + event.isIsOutOfBounds()));
        building.getActuators().forEach(actuator -> System.out.println(actuator.isOpen()));
    }
}
