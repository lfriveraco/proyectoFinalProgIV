/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package worrisomeevent2018;

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
        Graphs graphs=new Graphs(true);
        graphs.insert(new Neighborhood("Fatima", 3, true, "5010", 3));
        graphs.insert(new Neighborhood("Bosque", 4, true, "5011", 3));
        
        graphs.addRelationship("Fatima", "Bosque", new Neighborhood("Bosque", 4, false, "5011", 3));
        graphs.addRelationship("Fatima", "Bosque", new Neighborhood("Bosque", 4, false, "5011", 3));
    }    
}
