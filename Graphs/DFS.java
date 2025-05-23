import java.util.*;
class DFS {
    static void dfsTraversal(List<List<Integer>> adjacencyList, int u, boolean visited[]) {
        if (visited[u] == true)
            return;
        visited[u] = true;

        for (int v : adjacencyList.get(u)) {
            System.out.println(u + " ->" + v);
            if (!visited[v]) {

                dfsTraversal(adjacencyList, v, visited);
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();

        System.out.print("Enter number of edges: ");
        int e = sc.nextInt();
        List<List<Integer>> adjacencyList = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            adjacencyList.add(new ArrayList<>());
        }
        System.out.println("Enter edges (u v) one per line:");
        for (int i = 0; i < e; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            adjacencyList.get(u).add(v);
            adjacencyList.get(v).add(u);
        }



        boolean visited[] = new boolean[n+1];
        for (int i = 0; i < 5; i++) {
            if (!visited[i])
                dfsTraversal(adjacencyList, i, visited);

        }

    }
}
