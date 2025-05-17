import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CycleDetectionUndirectedDFS {
    static boolean dfsTraversal(List<List<Integer>> adjacencyList, int u, boolean visited[],int parent) {
        visited[u]=true;
        for (int v : adjacencyList.get(u)) {

            if (v== parent) continue;
            if(visited[v]==true) return  true;
           return dfsTraversal(adjacencyList, v, visited, u);



        }
        return  false;
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


                if(dfsTraversal(adjacencyList, 1, visited,-1))
                    System.out.println("Cycle detected");
            else  System.out.println(" NO Cycle detected");

        }

    }

