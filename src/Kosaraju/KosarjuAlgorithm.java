package Kosaraju;

public class KosarjuAlgorithm {

	private int[] id; // index is the id of vertex for checking strogly connected vertex
	// storngly connected 된 vertex들을 분류하기 위해서
	private int count;
	private boolean[] marked;

	public KosarjuAlgorithm(Graph graph) {

		DepthFirstOrdering dfs = new DepthFirstOrdering(graph.getTransposedGraph());

		marked = new boolean[graph.getVertexList().size()];
		id = new int[graph.getVertexList().size()];

		for(Vertex vertex : dfs.getReversedPost()){

			if(!marked[vertex.getId()]){
				dfs(vertex);
				count++;
			}
		}
	}
	private void dfs(Vertex vertex){

		marked[vertex.getId()] = true;
		id[vertex.getId()] = count;
		vertex.setComponentId(count);

		for(Vertex v : vertex.getAdjacenciesList()){

			if(!marked[v.getId()]){
				dfs(vertex);
			}
		}
	}
}
