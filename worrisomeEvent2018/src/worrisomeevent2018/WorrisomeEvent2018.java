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
        
        /*Graphs neighborhoodGrap=new Graphs(false);
        neighborhoodGrap.insert(new Neighborhood("Fatima", "5010", 3));
        neighborhoodGrap.insert(new Neighborhood("Bosque", "5011", 4));
        
        neighborhoodGrap.addRelationship("Fatima", "Bosque", 1);
        neighborhoodGrap.removeRelationship("Fatima", "Bosque");
        System.out.println("dfgh");*/
        
        Graphs eventTypeGrap=new Graphs(false);
        eventTypeGrap.insert(new EventType("Robo", "5010"));
        eventTypeGrap.insert(new EventType("Maltrato", "5011"));
        
        eventTypeGrap.addRelationship("Robo", "Maltrato", 5);
        
        //eventTypeGrap.removeRelationship("Robo", "Maltrato");
        
        System.out.println(eventTypeGrap.findWeight("Maltrato", "Robo"));
        
    }    
}
