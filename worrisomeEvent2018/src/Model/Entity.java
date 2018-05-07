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
    protected String codigo;    
    public Entity() {
    }
    public Entity(String name,String codigo) {
        this.name = name;        
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
}
