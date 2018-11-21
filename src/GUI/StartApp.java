/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Database.Database;
import ModernBuildings.Actuator;
import ModernBuildings.Building;
import ModernBuildings.CO2Rule;
import ModernBuildings.CO2Sensor;
import ModernBuildings.TemperatureRule;
import ModernBuildings.TemperatureSensor;
import java.io.IOException;
import java.util.Arrays;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Yourk
 */
public class StartApp extends Application {
    
    @Override
    public void start(Stage primaryStage) throws IOException {
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
        Parent root = FXMLLoader.load(getClass().getResource("/App.fxml"));
        
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
