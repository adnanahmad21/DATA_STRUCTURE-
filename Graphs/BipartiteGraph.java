import javax.swing.text.html.parser.Entity;
import java.util.*;
public class BipartiteGraph {
//dfs way
    static boolean dfsisGraphBipartite(List<List<Integer>> adj, int u, int currcolor, int[] color) {
       color[u]=currcolor;
       for (int v:adj.get(u))
       {
           if(color[u]==color[v])  return  true;
           else if(color[v]==-1)
           {
               color[v]=1-currcolor;
               dfsisGraphBipartite(adj,v,color[v],color);
           }
       }

        return  false;
    }
    // bfs way
    static boolean bfsisGraphBipartite(List<List<Integer>> adj, int x, int currcolor, int[] color) {

        Queue<Integer> q=new ArrayDeque<>();
        q.add(x);
        color[x]=currcolor;
        while(q.size()>0)
        {
            int u=q.poll();
            for(int v:adj.get(u))
            {
                if(color[u]==color[v]) return  true;
                else if(color[v]==-1)
                {
                    color[v]=1-color[u];
                    q.add(v);

                }
                                    }
        }



        return  false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Nodes (0-based");
        int n=sc.nextInt();
        System.out.print("Enter number of edges: ");
        int e = sc.nextInt();
       System.out.println("Enter edges (u v) one per line:");
        List<List<Integer>> adj=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<e;i++)
        {
             int u=sc.nextInt();
             int v= sc.nextInt();
             adj.get(u).add(v);
             adj.get(v).add(u);
        }
        // logic
        int color[]=new int[n];
        Arrays.fill(color,-1);
        for(int i=0;i<n;i++)
        {
            if(color[i]==-1)
            {
//                if(dfsisGraphBipartite(adj,i,0,color))
//                {
//                    System.out.println("Not a valid Bi partite Graph");
//                    break;
//                }
                if(bfsisGraphBipartite(adj,i,0,color))
                {
                    System.out.println("Not a valid Bi partite Graph");
                    break;
                }
                else
                {
                    System.out.println("Bi partite Graph is Valid");
                    break;
                }
            }
        }


    }


}
