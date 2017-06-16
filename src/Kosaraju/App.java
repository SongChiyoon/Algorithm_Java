package Kosaraju;
import java.util.ArrayList;
import java.util.List;

// Song
/* Description for Strong connected graph Algorithm
	- use stack for DFS
	 1) DFS and keep pushing the nodes to stack
	 2) Transpose the graph -> reverse the graph (using temp Stack)
	 3) keep poping the nodes from the stack, and keep constructing the strongly connected components

	 @@ Strongly connected graph search 의 활용 사례
	 	군집화 된 cluster를 찾거나 혹은 recommendation algorithm에 쓰인다.

 */
public class App {

	public static void main(String[] args) {

		List<Vertex> vertexList = new ArrayList<>();

		vertexList.add(new Vertex(0, "a"));
		vertexList.add(new Vertex(1, "b"));
		vertexList.add(new Vertex(2, "c"));
		vertexList.add(new Vertex(3, "d"));
		vertexList.add(new Vertex(4, "e"));
		vertexList.add(new Vertex(5, "f"));
		vertexList.add(new Vertex(6, "g"));
		vertexList.add(new Vertex(7, "h"));
		
		
		List<Edge> edgeList = new ArrayList<Edge>();
		
		edgeList.add(new Edge(1, vertexList.get(0), vertexList.get(1)));
		
		edgeList.add(new Edge(1, vertexList.get(1), vertexList.get(2)));
		edgeList.add(new Edge(1, vertexList.get(1), vertexList.get(4)));
		edgeList.add(new Edge(1, vertexList.get(1), vertexList.get(5)));
		
		edgeList.add(new Edge(1, vertexList.get(2), vertexList.get(3)));
		edgeList.add(new Edge(1, vertexList.get(2), vertexList.get(6)));
		
		edgeList.add(new Edge(1, vertexList.get(3), vertexList.get(2)));
		edgeList.add(new Edge(1, vertexList.get(3), vertexList.get(7)));
		
		edgeList.add(new Edge(1, vertexList.get(4), vertexList.get(0)));
		edgeList.add(new Edge(1, vertexList.get(4), vertexList.get(5)));
		
		edgeList.add(new Edge(1, vertexList.get(5), vertexList.get(6)));
		
		edgeList.add(new Edge(1, vertexList.get(6), vertexList.get(5)));
		
		edgeList.add(new Edge(1, vertexList.get(7), vertexList.get(3)));
		edgeList.add(new Edge(1, vertexList.get(7), vertexList.get(6)));
		
		
		
		Graph graph = new Graph(vertexList,edgeList);

//		for(Vertex v : graph.getTransposeGraph().getVertexList()){
//			for(Vertex u : v.getAdjaenciesList()){
//				System.out.println(v+"->"+u);
//			}
//		}
		
		KosarjuAlgorithm kosarajuAlgorithm = new KosarjuAlgorithm(graph);
		
//		System.out.println(kosarajuAlgorithm.count);
		
		for(Vertex vertex : vertexList){
			System.out.println(vertex+" - "+vertex.getComponentId());
		}
		
	}
}
