package Kosaraju;

import java.util.Stack;

/*

 */
public class DepthFirstOrdering {
		private Stack<Vertex> stack;

	public DepthFirstOrdering(Graph graph) {

		stack = new Stack<>();

		for(Vertex vertex : graph.getVertexList()){

			if(!vertex.isVisited()){
				//non visited, then depth first search for finding strongly connected
				dfs(vertex);
			}
		}
	}
	private void dfs(Vertex vertex){
		// normal dfs algorithm

		vertex.setVisited(true);

		for(Vertex v : vertex.getAdjacenciesList()){

			if(!v.isVisited()){
				dfs(v);
			}
		}
		stack.push(vertex);
	}
	public Stack<Vertex> getReversedPost(){
		return this.stack;
	}
}
