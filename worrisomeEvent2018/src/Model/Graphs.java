/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import javax.swing.JFileChooser;

/**
 * Clase que representa la logia general del grafo.
 *
 * @param addressed Valor de verdad que inda si el grafo es o no dirigido.
 * Dirigidos seràn los Tipos de Delitos. No dirigios seràn los Barrios.
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
     * Dado el nombre de un vertice, lo busca y lo retorna.
     *
     * @param name Nombre del vertice a buscar.
     * @return retorna un objeto de tipo Vertex si existe el vertie, si no
     * retorna nulo.
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
    public boolean addRelationship(String vertexNameA, String vertexNameB, int weight) {
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
                Entity entityB = tempVertexB.getEntity();
                Relationship relationshipB = new Relationship(entityB, weight);
                /**
                 * *
                 * si no existen se agrega la nueva relacion a
                 */
                tempVertexA.relationship.add(relationshipB);
                /**
                 * *
                 * si el grafo es dirigido se prodra agrgar la segunda lista en
                 * el primer vrtice
                 */
                if (!this.isAddressed()) {
                    Entity entityA = tempVertexA.getEntity();
                    Relationship relationshipA = new Relationship(entityA, weight);
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

    /**
     * Permite eliminar la relaciòn existente entre dos vertices.
     *
     * @param vertexNameA
     * @param vertexNameB
     * @return
     */
    public boolean removeRelationship(String vertexNameA, String vertexNameB) {
        Relationship tempRelationship = null;
        Vertex tempVetexA = find(vertexNameA);
        Vertex tempVetexB = find(vertexNameB);
        /**
         * *
         * Validar que los vertices existan
         */
        if (tempVetexA != null && tempVetexB != null) {

            tempRelationship = tempVetexA.search(vertexNameB);

            /**
             * *
             * Validad si dos datos del VerticeB estan en VerticeA
             */
            if (tempRelationship != null) {
                tempVetexA.getRelationship().remove(tempRelationship);
                /**
                 * validar si no es dirigido con el fin de eliminar la relacion
                 * de otro sentido.
                 */
                if (!this.isAddressed()) {
                    tempRelationship = tempVetexB.search(vertexNameA);
                    if (tempRelationship != null) {
                        tempVetexB.getRelationship().remove(tempRelationship);
                    }
                }
                return true;
            }
        }
        return false;
    }

    /**
     * dado vertice A y vetice B retorna el peso de la relacion entre estos dos
     * vertices en caso de que no exista la relacion retorna 0
     *
     * @param vertexNameA Nombre del vertice A
     * @param vertexNameB Nombre del vertice B
     * @return Retorna el valor del pero de la relacion, retorna 0 si no hay
     * relacion
     *
     */
    public int findWeight(String vertexNameA, String vertexNameB) {
        Vertex temVertexNameA = this.find(vertexNameA);
        Vertex temVertexNameB = null;

        if (temVertexNameA != null) {
            temVertexNameB = this.find(vertexNameB);
            if (temVertexNameB != null) {
                /**
                 * *
                 * Buscamos que exista la relacion de B en A
                 */
                Relationship relationship = temVertexNameA.search(vertexNameB);
                if (relationship != null) {
                    return relationship.getWeight();
                } else {
                    /**
                     * *
                     * Buscamos que exista la relacion de A en B
                     */
                    relationship = temVertexNameB.search(vertexNameA);
                    if (relationship != null) {
                        return relationship.getWeight();
                    }
                }
            }
        }
        return 0;
    }

    /**
     * dado el nombe de un vertice mustra sus datos y susu relaciones.
     *
     * @param vertexName nombre del vertice que se quiere mostrar
     * @return
     */
    public ArrayList showVertex(String vertexName) {
        Vertex temVertexName = this.find(vertexName);
        if (temVertexName != null) {
            System.out.println(temVertexName);
        }
        return null;
    }

    /**
     * permite consultar la cantidad de vertices del grafo
     *
     * @return
     */
    public int orderGraph() {
        return this.getVertex().size();
    }

    /**
     * permite obtener los datos del vertice.
     *
     * @param vertexName
     * @return
     */
    public Entity infoVertex(String vertexName) {
        Vertex temVertex = find(vertexName);
        if (temVertex != null) {
            return temVertex.getEntity();
        }
        return null;
    }

    /**
     * permite guardar la informacion que contiene en grafo.
     */
    public void guardarGrafo() {
        JFileChooser mfFileChooser = new JFileChooser();
        mfFileChooser.showSaveDialog(null);
        File archivoGrafo = mfFileChooser.getSelectedFile();
        String cadena = "";
        try {
            /**
             * Abrimos el archivo seleccionado y se guarda tal como lo queremos*
             */
            FileWriter escribir = new FileWriter(archivoGrafo, false);
            for (Vertex vertex : this.getVertex()) {
                cadena = cadena + vertex.getEntity() + ";";
                cadena = cadena + vertex.getRelationship() + "\n";
                escribir.write(cadena);
            }
            escribir.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    /**
     * permite marcar la relacion entre dos vertices como visitado o no visitado
     *
     * @param VertexNameA Nombre vertice A
     * @param vertexNameB Nombre vertice B
     * @param status
     */
    public void markVertex(String VertexNameA, String vertexNameB, boolean status) {
        Vertex tempVertex = find(VertexNameA);
        if (tempVertex != null) {
            tempVertex.setVisited(status);
        }
    }
    /**
     * permite buscar si hay un camino entre dos vertices
     *
     * @param VertexNameA Nombre vertice A
     * @param vertexNameB Nombre vertice B
     * @return
     */
    public boolean encontar(String VertexNameA, String vertexNameB) {
        boolean encontro = false;
        if (VertexNameA.equals(vertexNameB)) {
            encontro = true;
        } else {
            Vertex temVertexNameA = find(VertexNameA);
            if (!temVertexNameA.isVisited()) {
                temVertexNameA.setVisited(true);
                ArrayList<Relationship> arrayList = temVertexNameA.getRelationship();
                for (Relationship relationship : arrayList) {
                    if (encontar(relationship.getEntity().getName(), vertexNameB)) {
                        encontro = true;
                        return true;
                    }
                }
                encontro = false;
            }
        }
        return encontro;
    }
}
