package julypractice;

import java.util.Iterator;
import java.util.LinkedList;

public class BFS {
	
	private int v;
	private LinkedList<Integer> adj[];
	
	BFS(int v)
	{
		this.v = v;
		adj = new LinkedList[v];
		
		for(int i = 0 ; i< v; ++i){
			adj[i] = new LinkedList();
		}
	}
	
	void addedge(int v, int w){
		adj[v].add(w);
	}
	
	void doBFS(int s){
		boolean visited[] = new boolean[v];
		
		LinkedList<Integer> queue = new LinkedList<Integer>();
		
		visited[s] = true;
		queue.add(s);
		
		while(queue.size() !=0 ){
			
			s = queue.poll();
			System.out.print(s+" ");
			
			Iterator<Integer> i = adj[s].listIterator();
			
			while(i.hasNext()){
				int n = i.next();
				if(!visited[n]){
					visited[n] = true;
					queue.add(n);
				}
				//System.out.println("in "+n+" ");
			}
		}
	}
	//BFS
	/* start from 2
	 * 2(0,3) 0(1,2) 3(3) 1(2) 
	 */
	
	/* start from 1
	 * 1(2), 2(0,3), 0(1,2), 3(3)
	 */
	
	
	
	
	void DFSUtil(int v,boolean visited[])
    {
        // Mark the current node as visited and print it
        visited[v] = true;
        System.out.print(v+" ");
 
        // Recur for all the vertices adjacent to this vertex
        Iterator<Integer> i = adj[v].listIterator();
        while (i.hasNext())
        {
            int n = i.next();
            if (!visited[n])
                DFSUtil(n, visited);
        }
    }
 
    // The function to do DFS traversal. It uses recursive DFSUtil()
    void DFS(int v)
    {
        // Mark all the vertices as not visited(set as
        // false by default in java)
        boolean visited[] = new boolean[this.v];
 
        // Call the recursive helper function to print DFS traversal
        DFSUtil(v, visited);
    }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BFS bfs = new BFS(5);
		
		bfs.addedge(0, 1);
		bfs.addedge(0, 2);
		bfs.addedge(1, 2);
		bfs.addedge(2, 0);
		bfs.addedge(2, 3);
		bfs.addedge(3, 3);
		
		System.out.println("Following is Breadth First Traversal "+"(starting from vertex 2)");
		
		bfs.doBFS(2);
		
		System.out.println();
		System.out.println("\nFollowing is Depth First Traversal "+"(starting from vertex 2)");
		
		bfs.DFS(2);
		//DFS is recursively because DFS can implement by stack...
	}

}


