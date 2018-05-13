/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author avgrisalesgu
 */
public class EventType extends Entity {

    public EventType(String name, String code) {
        super(name, code);
    }

    @Override
    public String toString() {
        return "["+this.code+"]"+this.name;
    }

    
    
}
