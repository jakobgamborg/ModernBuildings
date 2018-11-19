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
    private boolean isOpen;

    public Actuator(boolean isOpen) {
        this.id = UUID.randomUUID();
        this.isOpen = isOpen;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public boolean isIsOpen() {
        return isOpen;
    }

    public void setIsOpen(boolean isOpen) {
        this.isOpen = isOpen;
    }
    
}
