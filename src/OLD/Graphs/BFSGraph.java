package OLD.Graphs;

import java.util.LinkedList;

/*
 *Created by PRudrawar on 9/4/2018
 */
/*Shortest Path and Minimum Spanning Tree for unweighted graph
* broadcasting
* crawlers in search engine
* GPS navigation
* peer to peer network (bittorrent)
* */
public class BFSGraph {
    private int V;
    private LinkedList<Integer>[] adj;
    BFSGraph(int v){
        V=v;
        adj=new LinkedList[V];
        for(int i=0;i<v;i++){
            adj[i]=new LinkedList<>();
        }
    }

    void addEdge(int u,int v){
        adj[u].add(v);
    }

    private void BFS(int input) {
        boolean visited[]=new boolean[V];
        LinkedList<Integer> q=new LinkedList<>();
        q.add(input);


        while (!q.isEmpty()){
            int data=q.peek();
            q.poll();
            visited[data]=true;
            System.out.print(data +" ");
            for(int j:adj[data]){
                if(!visited[j])
                    q.add(j);
            }
        }
    }

    public static void main(String args[])
    {
        BFSGraph g = new BFSGraph(4);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);

        System.out.println("Following is Breadth First Traversal "+
                "(starting from vertex 2)");

        g.BFS(2);
    }

}
