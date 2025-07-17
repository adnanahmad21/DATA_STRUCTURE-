import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class BellmanFordAlgorithm {
    public static void main(String[] args) {
        System.out.println("Enter No. of Nodes");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        List<int[]> adj=new ArrayList<>();
        System.out.println("Enter No.of Edges");
        int e=sc.nextInt();
        System.out.println("Enter edges u ,v and weight w");
        for(int i=0;i<e;i++)
        {
            int u=sc.nextInt();
            int v=sc.nextInt();
            int w=sc.nextInt();
            adj.add(new int[]{u,v,w});
        }
        System.out.println("Enter source from which you need single source shortest path in range 0 to n-1 nodes");
        int src= sc.nextInt();
        int result[]=new int[n];
        Arrays.fill(result,Integer.MAX_VALUE);
        result[src]=0;
        //relax n-1
        for(int i=0;i<n;i++)
        {
            for(int edge[]:adj)
            {

                int u=edge[0];
                int v=edge[1];
                int w=edge[2];
                if(result[u]!=Integer.MAX_VALUE)
                {
                    if(result[u]+w<result[v]) result[v]=result[u]+w;
                }
            }
        }
        // if we want to cech negative cycle do  a loop for n if  update in result happend then there is a negative wt cycle
        System.out.println("So shortest path from socurce "+src+" is "+Arrays.toString(result));
       // eg:5, edges[][] = [[1, 3, 2], [4, 3, -1], [2, 4, 1], [1, 2, 1], [0, 1, 5]
    }
}
