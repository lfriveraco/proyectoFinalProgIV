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
    ArrayList<Relationship> relationship;
    private Entity entity;

    public Vertex() {
    }

    public Vertex( Entity entity) {        
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
    /***
     * Se crea el buscar relaciones por nombre,dentro del vertice
     * @param name
     * @return 
     */
     public boolean find(String name){     
        for (Relationship entity : relationship ) {
            if(entity.getEntity().getName().equals(name)){
                return true;
            }
        }        
        return false;       
    }       
}
