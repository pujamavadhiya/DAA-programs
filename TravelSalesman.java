public class TravelSalesman {
    static int N = 4;
    static int final_path[] = new int[N + 1];
    static int final_res = Integer.MAX_VALUE;
    static void TSPRec(int[][] cost,
                       int[] tempPath,
                       boolean[] visited,
                       int currentPos,
                       int currentCost,
                       int n)
    {
        if (n == N) {
            int tempRes = currentCost + cost[currentPos][0];
            if (tempRes < final_res) {
                copyToFinal(tempPath);
                final_res = tempRes;
            }
            return;
        }
        for (int i = 0; i < N; i++) {
            if (visited[i] == false) {
                int tempPathArray[] = new int[N + 1];
                copyToTemp(tempPath, tempPathArray);
                tempPathArray[n] = i;
                if (cost[currentPos][i] != 0) {
                    visited[i] = true;
                    TSPRec(cost, tempPathArray, visited,
                            i, currentCost + cost[currentPos][i],
                            n + 1);
                    visited[i] = false;
                }
            }
        }
    }
    static void copyToFinal(int tempPath[])
    {
        for (int i = 0; i < N + 1; i++)
            final_path[i] = tempPath[i];
    }
    static void copyToTemp(int tempPath[], int currentPath[])
    {
        for (int i = 0; i < N + 1; i++)
            currentPath[i] = tempPath[i];
    }
    static void display(int final_path[])
    {
        System.out.print("Minimum cost: " + final_res + "\nPath: ");
        for (int i = 0; i <= N; i++)
            System.out.print(final_path[i] + " ");
        System.out.println();
    }
    static void TSP(int[][] cost)
    {
        int tempPath[] = new int[N + 1];
        boolean[] visited = new boolean[N];
        visited[0] = true;
        tempPath[0] = 0;
        TSPRec(cost, tempPath, visited, 0, 0, 1);
        display(final_path);
    }

    public static void main(String args[])
    {
        int cost[][] = { { 0, 10, 15, 20 },
                { 10, 0, 35, 25 },
                { 15, 35, 0, 30 },
                { 20, 25, 30, 0 }
        };

        TSP(cost);
    }
}