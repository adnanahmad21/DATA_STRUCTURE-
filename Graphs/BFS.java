import java.util.*;

public class BFS {
   static  void bfsTraversal(List<List<Integer>> adjacencyList)
    {
        boolean visited[]=new boolean[5];
        Queue<Integer>q=new ArrayDeque<>();
        q.add(1);
        visited[1]=true;
        while(q.size()>0)
        {
            int u=q.remove();

            for (int v:adjacencyList.get(u))
            {
                System.out.println(u+"->"+v);
                if(!visited[v])
                {

                    visited[v]=true;
                    q.add(v);
                }
            }
            //System.out.println();
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
//            adjacencyList.get(v).add(u); // for directed graph only one edge u -> v not v -> u
        }
        bfsTraversal(adjacencyList);



    }
}
