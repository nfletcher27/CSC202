import java.util.ArrayList;

public class edgeWeightedGraphAdjList {
    private class Edge {
        int u, v, edgeWeight;

        public Edge(int u, int v, int edgeWeight) {
            this.u = u;
            this.v = v;
            this.edgeWeight = edgeWeight;
        }
    }
    ArrayList<Edge>[] adj;
    public edgeWeightedGraphAdjList(int nodesCount) {
        this.adj = new ArrayList[nodesCount];
        for(int i = 0; i < nodesCount; i++)
            this.adj[i] = new ArrayList<>();
    }

    public void addEdge(int u, int v, int edgeWeight) {
        this.adj[u].add(new Edge(u, v, edgeWeight));
    }

    @Override
    public String toString() {
        String res = "";
        for (int i = 0; i < adj.length; i++) {
            res += (i + ":");
            for (int j = 0; j < adj[i].size(); j++) {
                Edge edge = adj[i].get(j);
                res += (" " + edge.v + "(" + edge.edgeWeight + ")");
            }
            if (i + 1 < adj.length)
                res += "\n";
        }
        return res;
    }

    public static void main(String [] args) {
        edgeWeightedGraphAdjList g = new edgeWeightedGraphAdjList(6);
        g.addEdge(0, 1, 1);
        g.addEdge(0, 3, 4);
        g.addEdge(1, 4, 3);
        g.addEdge(2, 4, 10);
        g.addEdge(2, 5, 4);
        g.addEdge(3, 1, 5);
        g.addEdge(4, 3, 1);
        g.addEdge(5, 5, 2);
        System.out.println(g);
    }
}
