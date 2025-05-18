import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class CycleDetectionDirectedDFS {
    static boolean dfsTraversal(List<List<Integer>> adjacenctList, int u, boolean vis[], boolean inRec[]) {

        vis[u] = true;
        inRec[u] = true;
        for (int v : adjacenctList.get(u)) {
            if (!vis[v] && dfsTraversal(adjacenctList, v, vis, inRec)) {
                return  true;
            } else if (inRec[v] == true) return true;
        }
        inRec[u]=false;
        return false;
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
//            adjacencyList.get(v).add(u);
        }


        boolean visited[] = new boolean[n + 1];
        boolean inRecursion[] = new boolean[n + 1];
 int x=0;

      for(int i=1;i<n+1;i++)
      {
          if ( visited[i]==false && dfsTraversal(adjacencyList, i, visited, inRecursion))
              x++;


      }
      if(x!=0)  System.out.println("Cycle detected");
      else System.out.println(" NO Cycle detected");
    }
}
