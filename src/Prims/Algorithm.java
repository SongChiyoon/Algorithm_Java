package Prims;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class Algorithm {
	
	private List<Vertex> unvisitedList;
	private List<Edge> spanningTree;
	private PriorityQueue<Edge> edgeHeap;
	private double cost;
	
	Algorithm(List<Vertex> unvisitedList){
		this.unvisitedList = unvisitedList;
		this.spanningTree = new ArrayList<>();
		this.edgeHeap = new PriorityQueue<>();
	}
	
	public void prims(Vertex vertex){
		
		this.unvisitedList.remove(vertex);
		
		while(!this.unvisitedList.isEmpty()){
			
			for(Edge edge : vertex.getAdjacentList()){
				
				if(this.unvisitedList.contains(edge.getTargetVertex())){
					edgeHeap.add(edge);
				}
			}
			
			Edge minEdge = this.edgeHeap.remove();
			
			this.spanningTree.add(minEdge);
			vertex = minEdge.getTargetVertex();
			this.unvisitedList.remove(vertex);
		}
	}
	public void showPrim(){
		for(Edge e : this.spanningTree){
			System.out.println(e);
		}
	}

}
