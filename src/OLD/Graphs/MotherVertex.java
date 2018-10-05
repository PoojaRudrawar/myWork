package OLD.Graphs;

import java.util.LinkedList;

/*
 *Created by PRudrawar on 9/5/2018
 */
/*
* Do DFS traversal of the given graph.
* While doing traversal keep track of last finished vertex ‘v’. This step takes O(V+E) time.
If there exist mother vertex (or vetices), then v must be one (or one of them).
Check if v is a mother vertex by doing DFS/BFS from v.
This step also takes O(V+E) time.*/
public class MotherVertex {
    private int V;
    private LinkedList<Integer>[] adj;

    MotherVertex(int G){
        V=G;
        adj=new LinkedList[V];
        for (int i=0;i<V;i++){
            adj[i]=new LinkedList<Integer>();
        }
    }

    public void addEdge(int u,int v){
        adj[u].add(v);
    }


    private int DFS(int i) {
        boolean visited[]=new boolean[V];
        int lastVisited=Integer.MAX_VALUE;
       lastVisited= DFSUtil(i,visited,lastVisited);
        return lastVisited;
    }

    private int DFSUtil(int input, boolean[] visited,int lastVisited) {
        visited[input]=true;
        System.out.print(input +" ");

        for(int j:adj[input]){
            lastVisited=j;
            if(!visited[j])
                DFSUtil(j,visited,lastVisited);
        }
        return lastVisited;
    }


    private void fineOneOfTheMotherVertex(int i) {
        int oneOfTheMotherVertex=DFS(2);
        System.out.println("One of the mother vertex is:"+oneOfTheMotherVertex);
        boolean visited[]=new boolean[V];
        boolean found=true;
        DFSUtil(oneOfTheMotherVertex,visited,0);
        for(boolean b:visited) {
            if (!b) {
                found = false;
                System.out.println("No Mother vertex");
                break;
            }
        }
        if(found)
            System.out.println("Mother Vertex is "+oneOfTheMotherVertex);

    }
    public static void main(String[] args) {
        MotherVertex graph=new MotherVertex(4);
        graph.addEdge(0,1);
        graph.addEdge(0,2);
        graph.addEdge(2,0);
        graph.addEdge(1,2);
        graph.addEdge(2,3);
        graph.addEdge(3,3);

        graph.fineOneOfTheMotherVertex(2);
    }


}
