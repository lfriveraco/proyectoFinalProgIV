/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package worrisomeevent2018;

import Model.EventType;
import Model.Graphs;
import Model.Neighborhood;

/**
 *
 * @author avgrisalesgu
 */
public class WorrisomeEvent2018 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Graphs neighborhoodGrap=new Graphs(false);
        neighborhoodGrap.insert(new Neighborhood("Fatima", "5010", 3));
        neighborhoodGrap.insert(new Neighborhood("Bosque", "5011", 4));
        
        neighborhoodGrap.addRelationship("Fatima", "Bosque", 1);
        
        System.out.println("dfgh");
        
        Graphs eventTypeGrap=new Graphs(true);
        eventTypeGrap.insert(new EventType("Fatima", "5010"));
        eventTypeGrap.insert(new EventType("Bosque", "5011"));
        
        eventTypeGrap.addRelationship("Fatima", "Bosque", 1);
        
        System.out.println("dfgh");
        
    }    
}
