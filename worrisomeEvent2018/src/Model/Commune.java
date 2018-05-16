/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Model;

import java.util.Hashtable;

/**
 *
 * @author Luis Fernando Rivera Cortés
 */
public class Commune extends Entity{

    private Hashtable<String, Neighborhood> neigborhoods;

    public Commune(String code, String name) {
        this.setName(name);
        this.setCode(code);
    }

    public Hashtable<String, Neighborhood> getNeigborhoods() {
        return neigborhoods;
    }

    public void setNeigborhoods(Hashtable<String, Neighborhood> neigborhoods) {
        this.neigborhoods = neigborhoods;
    }
}
