/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package worrisomeevent2018;

import Controller.Contract;
import Controller.GraphController;
import Model.EventType;
import Model.Graph;
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

        Graph neighborhoodGrap = new Graph(false);
        Graph eventsGraph = new Graph(true);
        GraphController controller = new GraphController();
        
        controller.loadGraphNeigborhood(neighborhoodGrap);
        controller.makeRelations(neighborhoodGrap);
        
        System.out.println(neighborhoodGrap.showGraph());
        System.out.println(neighborhoodGrap.orderGraph());
        
        controller.inserEvents(eventsGraph);
        
        System.out.println(neighborhoodGrap.findPath(
                neighborhoodGrap.getVertex().get(0).getEntity().getName(),
                neighborhoodGrap.getVertex().get(neighborhoodGrap.getVertex().size()-1).getEntity().getName()));
        
//        neighborhoodGrap.insert(new Neighborhood("Fatima", "5010", 3));
//        neighborhoodGrap.insert(new Neighborhood("Bosque", "5011", 4));
//        neighborhoodGrap.insert(new Neighborhood("Comuneros", "5012", 2));
//        neighborhoodGrap.insert(new Neighborhood("Carola", "5013", 3));
//        
//        neighborhoodGrap.addRelationship("Fatima", "Bosque", 1);
//        neighborhoodGrap.addRelationship("Comuneros", "Carola", 2);
//        neighborhoodGrap.addRelationship("Fatima", "Carola", 3);
//        neighborhoodGrap.addRelationship("Fatima", "Comuneros", 4);
        //neighborhoodGrap.infoVertex("Fatima");
//        boolean res = neighborhoodGrap.findPath("Comuneros", "Bosque");
        //neighborhoodGrap.guardarGrafo();
        //neighborhoodGrap.removeRelationship("Fatima", "Bosque");
        //neighborhoodGrap.showVertex("Fatima");        
//        System.out.println(res);
//        int i = 0;
//        while(i <1000){
//            int dor = Contract.random(78, 99999);
//            if(dor < 78){
//                System.out.println("erro minimo : "+dor);
//            }
//            if(dor > 99999){
//                System.out.println("erro MAXIMO: "+dor);
//            }
//            i++;
//        }

        /*Graph eventTypeGrap=new Graph(false);
        eventTypeGrap.insert(new EventType("Robo", "5010"));
        eventTypeGrap.insert(new EventType("Maltrato", "5011"));
        
        eventTypeGrap.guardarGrafo();
        //eventTypeGrap.addRelationship("Robo", "Maltrato", 5);
        //eventTypeGrap.ListVertex("Robo");
        
        //eventTypeGrap.removeRelationship("Robo", "Maltrato");
        
        //System.out.println(eventTypeGrap.findWeight("Maltrato", "Robo"));*/
    }
}
