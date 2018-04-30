/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author avgrisalesgu
 */
public class Entity {

    protected String name;
    protected int weight;
    protected boolean visited;
    protected String codigo;
    
    public Entity() {
    }

    public Entity(String name, int weight, boolean visited,String codigo) {
        this.name = name;
        this.weight = weight;
        this.visited = visited;
    }
    
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }   

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
