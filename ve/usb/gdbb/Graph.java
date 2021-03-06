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

public interface Graph {
    
    public int V();
    public int E();
    public void addNode(String nodeId);
    public boolean addEdge(Edge e);
    public Iterator<String> adj(String nodeId);
    public Iterator<Edge> getEdges ();
    public Iterator<String> getNodes ();
    public Integer getInDegree (String nodeId);
    public Integer getOutDegree (String nodeId);
    public Graph subGraph(int n);
    public void print(String File);
}
