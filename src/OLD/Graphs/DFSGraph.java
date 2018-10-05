package OLD.Graphs;

import java.util.LinkedList;

/*
 *Created by PRudrawar on 9/5/2018
 */
/*
* Detecting cycle in a graph
*  Path Finding
*  To test if a graph is bipartite
*  */
public class DFSGraph {
    private int V;
    private LinkedList<Integer>[] adj;

    DFSGraph(int G){
        V=G;
        adj=new LinkedList[V];
        for (int i=0;i<V;i++){
            adj[i]=new LinkedList<Integer>();
        }
    }

    public void addEdge(int u,int v){
        adj[u].add(v);
    }


    private void DFS(int i) {
        boolean visited[]=new boolean[V];
        DFSUtil(i,visited);

    }

    private void DFSUtil(int input, boolean[] visited) {
        visited[input]=true;
        System.out.print(input +" ");

        for(int j:adj[input]){
            if(!visited[j])
                DFSUtil(j,visited);
        }
    }

    public static void main(String[] args) {
        DFSGraph graph=new DFSGraph(4);
        graph.addEdge(0,1);
        graph.addEdge(0,2);
        graph.addEdge(2,0);
        graph.addEdge(1,2);
        graph.addEdge(2,3);
        graph.addEdge(3,3);

        graph.DFS(2);
    }

}
