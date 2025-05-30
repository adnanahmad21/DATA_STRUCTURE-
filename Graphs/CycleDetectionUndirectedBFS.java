import javax.management.Query;
import java.util.*;



public class CycleDetectionUndirectedBFS {
    public  static class Pair{
        int source;
        int parent;
        Pair(int source,int parent)
        {
            this.source=source;
            this.parent=parent;
        }

    }
    static boolean bfsTraversal(List<List<Integer>> adjacencyList)
    {
        boolean visited[]=new boolean[adjacencyList.size()+1];
        Queue<Pair> q=new ArrayDeque<>();
        q.add(new Pair(1,-1));
        visited[1]=true;
        while(!q.isEmpty())
        {
            Pair x=q.poll();
            int u=x.source;
            int parent= x.parent;
            for(int v:adjacencyList.get(u))
            {
                if(!visited[v])
                {
                    q.add(new Pair(v,u));
                    visited[v]=true;
                }
                else if(parent!=u) return  true;
            }
        }
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
            adjacencyList.get(v).add(u);
        }
        if(bfsTraversal(adjacencyList))
            System.out.println("Cycle detected");
        else  System.out.println(" NO Cycle detected");

    }

}
