package Kosaraju;

public class KosarjuAlgorithm {

	private int count;
	private boolean[] marked;
	private int[] id;
	public KosarjuAlgorithm(Graph graph) {
	
		DepthFirstOrdering dfo = new DepthFirstOrdering(graph.getTransposeGraph());
		
		marked = new boolean[graph.getVertexList().size()];
		id = new int[graph.getVertexList().size()];
		
		for(Vertex vertex : dfo.getReversedStack()){
			if(!marked[vertex.getId()]){
				dfs(vertex);
				count++;
			}
		}
	}
	private void dfs(Vertex vertex) {
		
		marked[vertex.getId()] = true;
		id[vertex.getId()] = count;
		vertex.setComponentId(count);
		
		for(Vertex v : vertex.getAdjacenlist()){
			
			if(!marked[v.getId()]){
				dfs(v);
			}
		}
	}
	
}
