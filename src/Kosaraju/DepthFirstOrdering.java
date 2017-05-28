package Kosaraju;

import java.util.Stack;

public class DepthFirstOrdering {
	
	private Stack<Vertex> stack;
	DepthFirstOrdering(Graph graph){
		
		stack = new Stack<>();
		
		for(Vertex vertex : graph.getVertexList()){
			if(!vertex.isVisited()){
				dfs(vertex);
			}
		}
	}
	private void dfs(Vertex vertex){
		
		vertex.setVisited(true);
		
		for(Vertex v : vertex.getAdjacenlist()){
			
			if(!v.isVisited())
				dfs(v);
		}
		stack.push(vertex);
	}
	public Stack<Vertex> getReversedStack(){
		return stack;
	}

}
