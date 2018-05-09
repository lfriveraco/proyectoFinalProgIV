/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 * Case que almcena toda la infomcion referente a la relacion entre un vetice y
 * otro.
 *
 * @author avgrisalesgu
 */
public class Relationship {

    Entity entity;
    private int weight;
    private boolean visited;

    public Relationship(Entity nombre, int weight) {
        this.entity = nombre;
        this.weight = weight;
    }

    public Entity getEntity() {
        return entity;
    }

    public void setEntity(Entity entity) {
        this.entity = entity;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

}
