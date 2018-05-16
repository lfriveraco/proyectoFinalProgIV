/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Graph;
import Model.Neighborhood;
import Model.Vertex;
import java.util.ArrayList;

/**
 *
 * @author Luis Fernando Rivera Cortés
 */
public class GraphController {

    private Graph neigborhoodGraph;

    public void loadGraphNeigborhood(Graph graph) {
        int i = 0;
        while (i < 2) {
            graph.insert(Contract.NEIGHBORHOODS[Contract.random(0, Contract.NEIGHBORHOODS.length)]);
            i++;
        }

    }

    public void makeRelations(Graph graph) {
        for (Vertex vertex : graph.getVertex()) {
            int nRelations = Contract.random(0, (int) graph.orderGraph() / 2);

            for (int i = 0; i < nRelations; i++) {
                int iVertexToRelate = Contract.random(0, graph.orderGraph());
                int weight = 0;

                weight = Contract.random(10, 40);

                graph.addRelationship(
                        vertex.getEntity().getName(),
                        graph.getVertex().get(iVertexToRelate).getEntity().getName(),
                        weight);

            }

        }

    }
}
