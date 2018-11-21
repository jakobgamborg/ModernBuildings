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
public class Actuator {
    private UUID id;
    private String name;
    private boolean isOpen;

    public Actuator(boolean isOpen, String name) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.isOpen = isOpen;
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

    public boolean isOpen() {
        return isOpen;
    }

    public void setIsOpen(boolean isOpen) {
        this.isOpen = isOpen;
    }
    
    public void open() {
        this.isOpen = true;
    }
    
    public void close() {
        this.isOpen = false;
    }
    
}
