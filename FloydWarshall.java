import java.util.*;
class FloydWarshall {
    final static int INF = 100000;

    void floydWarshall(int graph[][], int V) {
        int dist[][] = new int[V][V];
        int i, j, k;

        for (i = 0; i < V; i++)
            for (j = 0; j < V; j++)
                dist[i][j] = graph[i][j];

        for (k = 0; k < V; k++) {
            for (i = 0; i < V; i++) {
                for (j = 0; j < V; j++) {
                    if (dist[i][k] + dist[k][j] < dist[i][j])
                        dist[i][j] = dist[i][k] + dist[k][j];
                }
            }
        }
        printSolution(dist, V);
    }

    void printSolution(int dist[][], int V) {
        System.out.println("The following matrix shows the shortest distances between every pair of vertices");
        for (int i = 0; i < V; ++i) {
            for (int j = 0; j < V; ++j) {
                if (dist[i][j] == INF)
                    System.out.print("INF ");
                else
                    System.out.print(dist[i][j] + "   ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int graph[][] = { { 0, 4, INF, 10 },
                { INF, 0, 3, INF },
                { INF, INF, 0, 9 },
                { 4, INF, INF, 0 } };

        FloydWarshall fw = new FloydWarshall();
        fw.floydWarshall(graph,4);
}
}