/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import ModernBuildings.Actuator;
import ModernBuildings.Building;
import ModernBuildings.CO2Sensor;
import java.util.Map;
import java.util.UUID;
import ModernBuildings.IBuildingManagementSystem;
import ModernBuildings.TemperatureSensor;
import java.util.HashMap;
import java.util.stream.Collectors;

/**
 *
 * @author Yourk
 */
public class Database implements IBuildingManagementSystem {
    private Map<UUID, Building> buildings = new HashMap<>();
    
    public void addBuilding(Building building) {
        this.buildings.put(building.getId(), building);
    }
    
    public void removeBuilding(UUID id) {
        this.buildings.remove(id);
    }
    
    @Override
    public Map<UUID, String> getBuildingInformation() {
        return this.buildings.entrySet().stream().collect(Collectors.toMap(e -> e.getKey(), e -> e.getValue().getName()));
    }

    @Override
    public Map<UUID, String> getSensorInformation(UUID buildingId) {
        Building build = this.buildings.get(buildingId);
        if (build != null) {
            return build.getSensors().stream().collect(Collectors.toMap(e -> e.getId(),e -> e.getName()));
        }
        return null;
    }

    @Override
    public Map<UUID, String> getActuatorInformation(UUID buildingId) {
        Building build = this.buildings.get(buildingId);
        if (build != null) {
            return build.getActuators().stream().collect(Collectors.toMap(e -> e.getId(),e -> e.isOpen() + ""));
        }
        return null;
    }

    @Override
    public UUID addTemperatureSensor(UUID buildingId, String name) {
        Building building = this.buildings.get(buildingId);
        if (building != null) {
            return building.addSensor(new TemperatureSensor(name));
        }
        return null;
    }
        
    @Override
    public UUID addCo2Sensor(UUID buildingId, String name) {
        Building building = this.buildings.get(buildingId);
        if (building != null) {
            return building.addSensor(new CO2Sensor(name));
        }
        return null;
    }

    @Override
    public void removeSensor(UUID buildingId, UUID sensorId) {
        this.buildings.get(buildingId).removeSensor(sensorId);
    }

    @Override
    public UUID addActuator(UUID buildingId, String name) {
        Building building = this.buildings.get(buildingId);
        if (building != null) {
            return building.addActuator(new Actuator(false, name));
        }
        return null;
    }

    @Override
    public void removeActuator(UUID buildingId, UUID actuatorId) {
        this.buildings.get(buildingId).removeActuator(buildingId);
    }
}
