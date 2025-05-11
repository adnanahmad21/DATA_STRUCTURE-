import java.util.*;
class DFS {
    static void dfsTraversal(List<List<Integer>> adjacencyList, int u, boolean visited[]) {
        if (visited[u] == true)
            return;
        visited[u] = true;

        for (int v : adjacencyList.get(u)) {
            if (!visited[v]) {
                System.out.println(u + " ->" + v);
                dfsTraversal(adjacencyList, v, visited);
            }
        }
    }

    public static void main(String[] args) {
        int edges[][] = { { 1, 2 }, { 2, 3 }, { 3, 4 }, { 4, 1 } }; // adjacency matrix
        List<List<Integer>> adjacencyList = new ArrayList<>(); // creating adjacency list
        for (int i = 0; i < 5; i++) {
            adjacencyList.add(new ArrayList<>());
        }
        for (int arr[] : edges) {
            int u = arr[0];
            int v = arr[1];
            adjacencyList.get(u).add(v);
            adjacencyList.get(v).add(u); // if graph is unidirected we can add u to as well as vto u if not then only u
                                         // to v
        }
        boolean visited[] = new boolean[5];
        for (int i = 0; i < 5; i++) {
            if (!visited[i])
                dfsTraversal(adjacencyList, i, visited);

        }

    }
}
