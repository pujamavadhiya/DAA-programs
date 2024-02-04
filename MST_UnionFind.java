
import java.util.*;

class Edge implements Comparable<Edge> {
    int src, dest, weight;

    public int compareTo(Edge edge) {
        return this.weight - edge.weight;
    }
};

class Graph {
    int V, E;
    Edge[] edges;

    Graph(int V, int E) {
        this.V = V;
        this.E = E;
        edges = new Edge[E];
        for (int i = 0; i < E; i++)
            edges[i] = new Edge();
    }

    int find(int[] parent, int i) {
        if (parent[i] == -1)
            return i;
        return find(parent, parent[i]);
    }

    void union(int[] parent, int x, int y) {
        int xset = find(parent, x);
        int yset = find(parent, y);
        parent[xset] = yset;
    }

    void KruskalMST() {
        Edge[] result = new Edge[V];
        int e = 0;
        int i = 0;
        for (i = 0; i < V; i++)
            result[i] = new Edge();

        Arrays.sort(edges);

        int[] parent = new int[V];
        Arrays.fill(parent, -1);

        i = 0;
        while (e < V - 1) {
            Edge next_edge = edges[i++];

            int x = find(parent, next_edge.src);
            int y = find(parent, next_edge.dest);

            if (x != y) {
                result[e++] = next_edge;
                union(parent, x, y);
            }
        }

        System.out.println("Following are the edges in the constructed MST");
        for (i = 0; i < e; ++i)
            System.out.println(result[i].src + " -- " + result[i].dest + " == " + result[i].weight);
    }
}

public class MST_UnionFind {
    public static void main(String[] args) {
        int V = 4;
        int E = 5;
        Graph graph = new Graph(V, E);

        graph.edges[0].src = 0;
        graph.edges[0].dest = 1;
        graph.edges[0].weight = 8;

        graph.edges[1].src = 0;
        graph.edges[1].dest = 2;
        graph.edges[1].weight = 10;

        graph.edges[2].src = 1;
        graph.edges[2].dest = 3;
        graph.edges[2].weight = 14;

        graph.edges[3].src = 2;
        graph.edges[3].dest = 3;
        graph.edges[3].weight = 12;

        graph.edges[4].src = 2;
        graph.edges[4].dest = 1;
        graph.edges[4].weight = 16;

        graph.KruskalMST();
    }
}
