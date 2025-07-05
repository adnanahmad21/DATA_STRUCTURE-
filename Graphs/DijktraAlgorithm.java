import java.util.*;


public class DijktraAlgorithm {
   static  class Pair
    {
        int node;
        int dist;
        Pair(int node,int dist)
        {
            this.node=node;
            this.dist=dist;
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter No. of Nodes");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        List<List<int[]>> adj=new ArrayList<>();
        System.out.println("Enter No.of Edges");
        int e=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            adj.add(new ArrayList<>());
        }
        System.out.println("Enter edges u ,v and weight w");
        for(int i=0;i<e;i++)
        {
            int u=sc.nextInt();
            int v=sc.nextInt();
            int w=sc.nextInt();
            adj.get(u).add(new int[]{v,w});
            adj.get(v).add(new int[]{u,w});
        }
        System.out.println("Enter source from which you need single source shortest path in range 0 to n-1 nodes");
        int src= sc.nextInt();
        int result[]=new int[n];
        Arrays.fill(result,Integer.MAX_VALUE);
        result[src]=0;
        //logic
        PriorityQueue<Pair> pq=new PriorityQueue<>(Comparator.comparingInt(p->p.dist));
        pq.add(new Pair(src,0));
        while(pq.size()>0)
        {
            Pair curr=pq.poll();
            int d=curr.dist;
            int u=curr.node;
            for(int arr[]:adj.get(u))
            {
                int w=arr[1];
                int v=arr[0];
                if(d+w<result[v])
                {
                    result[v]=d+w;
                    pq.add(new Pair(v,d+w));
                }
            }
        }
        System.out.println("So shortest path from socurce "+src+" is "+Arrays.toString(result));

    }
}
