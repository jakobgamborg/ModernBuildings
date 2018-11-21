/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModernBuildings;

import java.util.UUID;

/**
 *
 * @author Yourk
 */
public class Sensor {
    private UUID id;
    private String name;

    public Sensor(String name) {
        this.id = UUID.randomUUID();
        this.name = name;
    }

    public UUID getId() {
        return id;
    }
    
    public String getName() {
        return this.name;
    }
}
