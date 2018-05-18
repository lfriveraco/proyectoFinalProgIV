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

    /**
     * Permite insertar vetices aleatoriamente al grafo.
     *
     * @param graph
     */
    public void loadGraphNeigborhood(Graph graph) {
        int i = 0;
        /**
         * Se utiliza la funcion random para calcular un numero de vertices
         * aleatorio.
         */
        while (i < Contract.random(Contract.MIN_VERTEX, Contract.NEIGHBORHOODS.length)) {
            /**
             * cada vez, se obtiene un barrio aleatorio de la lista. En caso de
             * repetirse, el metodo insert del grafo controla esta situacion
             * para no insertarlo.
             */
            graph.insert(Contract.NEIGHBORHOODS[Contract.random(0, Contract.NEIGHBORHOODS.length - 1)]);
            i++;
        }
    }

    /**
     * Genera automaticamente las relaciones entre un barrio y otro
     */
    public void makeRelations(Graph graph) {
        /**
         * iteramos cada vetice para irle metiendo las relaciones.
         */
        for (Vertex vertex : graph.getVertex()) {
            /**
             * Se defien un numero aleatorio de relaciones para el vertice
             * (barrio) partiendo como minimo el valor del contrato, y como
             * máximo le numero de vertices partido en dos.
             */
            int nRelations = Contract.random(Contract.MIN_RELATIONS, (int) graph.orderGraph() / 2);

            /**
             * Se insertan tantas relaciones(aleatorias) al vertico como indique
             * la variable nRelations
             */
            for (int i = 0; i < nRelations; i++) {
                int iVertexToRelate = Contract.random(0, graph.orderGraph());
                int weight = Contract.random(10, 40);

                /**
                 * Insertamos la relacion al vertice pasandoe el nombre del
                 * vertice que almacena la relacion, despues el nombre del
                 * vertice a relacionar y finalmente el peso que tendra esta
                 * nueva relacion.
                 */
                graph.addRelationship(
                        vertex.getEntity().getName(),
                        graph.getVertex().get(iVertexToRelate).getEntity().getName(),
                        weight);

            }

        }

    }

    /**
     * Permite insertar aleatoriamente eventos preocupates a cada uno de los
     * barrios (vertices) del grafo.
     *
     * @param graph
     */
    public void inserEvents(Graph graph) {
        /**
         * Generamos una excepcion cuando se intente agregar eventos a un grafo 
         * que no es de tipo barrio. (es dirigido) 
         */
        if (graph.isAddressed()) {
           throw new UnsupportedOperationException("Solo puede insertar eventos en un grafo tipo barrio"); //To change body of generated methods, choose Tools | Templates.
        }
        
        for (Vertex vertex : graph.getVertex()) {
            int nOcurrency = Contract.random(10, 100);
            
            
        }
        
        
        
        
    }


}
