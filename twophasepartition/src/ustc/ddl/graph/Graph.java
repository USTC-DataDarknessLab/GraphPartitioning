package ustc.ddl.graph;

import ustc.ddl.graph.Edge;

import java.util.ArrayList;

public interface Graph {
    public void readGraphFromFile();
    public int getVCount();
    public int getECount();
    public void addEdge(int srcVId, int destVId);
    public ArrayList<Edge> getEdgeList();
    public void clear();
    public Edge readStep();
}
