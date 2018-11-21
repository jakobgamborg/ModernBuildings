/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import ModernBuildings.Building;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Yourk
 */
public class Database {
    private List<Building> buildings = new ArrayList<>();
    
    public Database() {
    }

    
    public Database(List<Building> buildings) {
        this.buildings = buildings;
    }

    public List<Building> getBuildings() {
        return buildings;
    }

    public void setBuildings(List<Building> buildings) {
        this.buildings = buildings;
    }
    
    public void addBuilding(Building building) {
        this.buildings.add(building);
    }
    
    public void removeBuilding(Building building) {
        this.buildings.remove(building);
    } 
    
    public void printBuildings() {
        this.buildings.forEach((building)->System.out.println(building));
    }
}
