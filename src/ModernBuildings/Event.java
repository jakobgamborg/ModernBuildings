/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModernBuildings;

import java.util.Date;
import java.util.UUID;

/**
 *
 * @author Yourk
 */
public class Event {
    private UUID id;
    private Date timeStamp;
    private boolean isOutOfBounds;
    
    public Event(boolean isOutOfBounds) {
        this.id = UUID.randomUUID();
        this.timeStamp = new Date();
        this.isOutOfBounds = isOutOfBounds;
    }

    public Date getTimeStamp() {
        return timeStamp;
    }

    public boolean isIsOutOfBounds() {
        return isOutOfBounds;
    }
    
}
