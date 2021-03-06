/*
 *  Copyright (C) 2013, Universidad Simon Bolivar
 *
 *  This program is free software; you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation; either version 2 of the License, or
 *  (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with this program; if not, write to the Free Software
 *  Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 */

package ve.usb.gdbb;

import java.util.Iterator;

public class Adjacencies {
    
    public Adjacencies() {
    }
    /*
     * Funcion que dado un Grafo y un id (en String) de dos nodos
     * devuelve un booleano indicando si dichos nodos son o no
     * adyacentes. Dos nodos son adjacentes en el grafo dirigido
     * si existe algun arco, independientemente de su direccion,
     * que los une o si ambos nodos resultan ser el mismo.
     */
    public boolean adjNodes(Graph g, String node1, String node2) {
        if (node1.compareTo(node2) == 0) return true;
        Iterator<String> adjacents = g.adj(node1);
        String cur;
        while (adjacents.hasNext()) {
            cur = adjacents.next();
            if (cur.compareTo(node2) == 0) {
                return true;
            }
        }
        adjacents = g.adj(node2);
        while (adjacents.hasNext()) {
            cur = adjacents.next();
            if (cur.compareTo(node1) == 0) {
                return true;
            }
        }
        return false;
    }
    
    /*
     * Funcion que dado un Grafo y un id (en String) de dos nodos
     * devuelve un booleano indicando si dichos nodos son o no
     * adyacentes.En este caso, dos nodos son adyacentes si solo si
     * existe un arcos que vaya desde node1 a node2.
     */
    public boolean adjNodesRestricted(Graph g, String node1, String node2) {
        Iterator<String> adjacents = g.adj(node1);
        String cur;
        while (adjacents.hasNext()) {
            cur = adjacents.next();
            if (cur.compareTo(node2) == 0) {
                return true;
            }
        }
       	return false;
    }

    /*
     * Funcion que dado un grafo y dos arcos (Edges),
     * devuelve un booleano indicando si dichos arcos son adyacentes.
     * Dos arcos son adyacentes si comparten un nodo, bien sea fuente
     * o destino.
     */
    public boolean adjEdges(Graph g, Edge edge1, Edge edge2) {
        return (edge1.getSrc().compareTo(edge2.getDst()) == 0
                    || edge1.getDst().compareTo(edge2.getSrc()) == 0
                    || edge1.getSrc().compareTo(edge2.getSrc()) == 0
                    || edge1.getDst().compareTo(edge2.getDst()) == 0);
    }
    
}
