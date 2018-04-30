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

    public boolean addRelationship(String vertexNameA, String vertexNameB, Entity entityName) {
        Vertex tempVertexA = find(vertexNameA);
        Vertex tempVertexB = find(vertexNameB);
        /***
         * Validar que  los vertices temporales no sean nulos
         */
        if (tempVertexA != null && tempVertexB != null) {
            /***
             * validar que la relacion no exista
             */
            if (!tempVertexA.find(vertexNameB)) {
                /***
                 * si no existen se agrega la nueva relacion
                 */
                tempVertexA.relationship.add(entityName);
                return true;
            }
        }
        return false;
    }
}
