import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class TopologicalSortDFS {
    static  void  topologicalsort(List<List<Integer>> adjacencyList,Stack<Integer> st,boolean vis[],int u)
    {
        vis[u]=true;
        for (int v:adjacencyList.get(u))
        {
            if(!vis[v]) topologicalsort(adjacencyList,st,vis,v);
        }
        st.push(u);
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
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<n;i++)
        {
            if ( visited[i]==false ) topologicalsort(adjacencyList,st,visited,i);



        }
        while(st.size()>0)
        {
            System.out.print(st.pop() +"-> ");

    }
}
}
