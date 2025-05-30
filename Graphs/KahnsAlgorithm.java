import java.util.*;

public class KahnsAlgorithm {
 static  List<Integer> bfsTopoSort(List<List<Integer>> adjacencyList)
 {
    List<Integer> ans=new ArrayList<>();
     int indegree[]=new int[adjacencyList.size()];
     for(int i=0;i<adjacencyList.size();i++ )
     {
         for(int v:adjacencyList.get(i))
         {
             indegree[v]++;
         }
     }
         Queue<Integer> q=new ArrayDeque<>();
     for(int i=0;i<adjacencyList.size();i++)
     {
         if(indegree[i]==0) {
             q.add(i);

         }
     }
     while (q.size()>0)
     {
         int x=q.poll();
         ans.add(x);
      for(int v: adjacencyList.get(x) )
      {
          indegree[v]--;
          if(indegree[v]==0)
          {
              q.add(v);
          }
      }
     }
     if (ans.size() != adjacencyList.size()) {
         System.out.println("Graph has a cycle. Topological sort not possible.");
         return new ArrayList<>();
     }
         return ans;
 }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();

        System.out.print("Enter number of edges: ");
        int e = sc.nextInt();
        List<List<Integer>> adjacencyList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adjacencyList.add(new ArrayList<>());
        }
        System.out.println("Enter edges (u v) one per line:");
        for (int i = 0; i < e; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            adjacencyList.get(u).add(v);
//            adjacencyList.get(v).add(u);
        }
 for (int x:  bfsTopoSort(adjacencyList))
        {
            System.out.print(x+"-> ");
        }

    }
}
