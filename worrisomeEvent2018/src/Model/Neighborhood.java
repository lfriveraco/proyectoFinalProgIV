/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author avgrisalesgu
 */
public class Neighborhood extends Entity {

    int stratum;
    ArrayList<EventType> eventTypes;

    public Neighborhood(String code, String name, int stratum) {
        super(code,name);
        this.stratum = stratum;
        this.eventTypes = new ArrayList<>();
    }

    public int getStratum() {
        return stratum;
    }

    public void setStratum(int stratum) {
        this.stratum = stratum;
    } 

    public ArrayList<EventType> getEventTypes() {
        return eventTypes;
    }

    @Override
    public String toString() {
        return "["+this.code+"]"+name+"-est."+stratum;
    }    
}
