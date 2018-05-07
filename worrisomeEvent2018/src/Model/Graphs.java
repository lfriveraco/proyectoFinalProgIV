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
public class Graphs {

    ArrayList<Vertex> vertex;
    boolean addressed;
    /***
         * si es no dirigido son los neighborhood se pone false para los eventtype(delitos) True
         */
    public Graphs(boolean addressed) {
        this.addressed = addressed;
        this.vertex = new ArrayList<>();
    }

    public ArrayList<Vertex> getVertex() {
        return vertex;
    }

    public void setVertex(ArrayList<Vertex> vertex) {
        this.vertex = vertex;
    }

    /**
     * *
     * datos de tipo boolen se crean como is en vez de get ya que este indica
     * yes or not
     *
     * @return
     */
    public boolean isAddressed() {
        return addressed;
    }

    public void setAddressed(boolean addressed) {
        this.addressed = addressed;
    }

    /**
     * *
     * se crea el buscar un vertex por nombre
     *
     * @param name
     * @return
     */
    public Vertex find(String name) {
        for (Vertex vertex : vertex) {
            if (vertex.getEntity().getName().equals(name)) {
                return vertex;
            }
        }
        return null;
    }

    /**
     * *
     * se inserta un vertice
     *
     * @param entity
     * @return
     */
    public boolean insert(Entity entity) {
        Vertex tempVertice = find(entity.getName());
        if (tempVertice == null) {
            Vertex vertex = new Vertex(entity);
            this.vertex.add(vertex);
            return true;
        }
        return false;
    }

    /**
     * *
     * almacenar las relaciones ya sean eventos ventos
     */
    public boolean addRelationship(String vertexNameA, String vertexNameB, int  weight) {
        Vertex tempVertexA = find(vertexNameA);
        Vertex tempVertexB = find(vertexNameB);
        
        /**
         * *
         * Validar que los vertices temporales no sean nulos
         */
        if (tempVertexA != null && tempVertexB != null) {
            /**
             * *
             * validar que la relacion no exista de a en b
             */
            if (!tempVertexA.find(vertexNameB)) {
                Entity entityB=tempVertexB.getEntity();
                Relationship relationshipB=new Relationship(entityB, weight);
                /**
                 * *
                 * si no existen se agrega la nueva relacion a
                 */
                tempVertexA.relationship.add(relationshipB);
                /**
                     * *
                     * si el grafo es dirigido se prodra agrgar la segunda lista en el primer vrtice
                     */
                if (!this.isAddressed()) {
                    Entity entityA=tempVertexA.getEntity();
                    Relationship relationshipA=new Relationship(entityA, weight);
                    /**
                     * *
                     * si no existen b en a se agrega la nueva relacion solo si
                     */
                    if (!tempVertexB.find(vertexNameA)) {
                        tempVertexB.relationship.add(relationshipA);
                    }
                }
                return true;
            }
        }
        return false;
    }
}
