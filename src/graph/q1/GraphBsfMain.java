package graph.q1;

public class GraphBsfMain {

	public static void main(String[] args) {
		GraphBfs g = new GraphBfs(5);
		 g.addEdge(0, 1);
	        g.addEdge(0, 2);
	        g.addEdge(1, 2);
	        g.addEdge(2, 0);
	        g.addEdge(2, 3);
	        g.addEdge(3, 3);
	 
	        System.out.println(
	            " Breadth First Traversal for graph: (starting from vertex 0)");
	 
	        g.BFS(0);

	}

}
