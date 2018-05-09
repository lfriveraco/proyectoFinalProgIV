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
public class Vertex {
   
    private Entity entity;
    ArrayList<Relationship> relationship;

    public Vertex() {
    }

    public Vertex(Entity entity) {
        this.entity = entity;
        this.relationship = new ArrayList<>();
    }

    public ArrayList<Relationship> getRelationship() {
        return relationship;
    }

    public void setRelationship(ArrayList<Relationship> relationship) {
        this.relationship = relationship;
    }

    public Entity getEntity() {
        return entity;
    }

    public void setEntity(Entity entity) {
        this.entity = entity;
    }

    /**
     * Dado el nombre de la relación devuelve el nodo e la relaciòn.
     *
     * @param name
     * @return
     */
    public Relationship search(String relationName) {
        for (Relationship relationship : relationship) {
            if (relationship.getEntity().getName().equals(relationName)) {
                return relationship;
            }
        }
        return null;
    }

    /**
     * *
     * Peermite buscar ua relació en el vertice
     *
     * @param relationName Nombre de la relaciòn.
     * @return
     */
    public boolean find(String relationName) {
        for (Relationship relationship : relationship) {
            if (relationship.getEntity().getName().equals(relationName)) {
                return true;
            }
        }
        return false;
    }
}
