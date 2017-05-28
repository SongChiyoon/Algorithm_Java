package Prims;

import java.util.ArrayList;
import java.util.List;

public class Vertex {
	
	private String name;
	private List<Edge> adjacentList;
	private boolean visited;
	private Vertex previous;
	Vertex(String name){
		this.name = name;
		this.adjacentList = new ArrayList<>();
	}
	public void addEdge(Edge edge){
		this.adjacentList.add(edge);
	}
	
	public List<Edge> getAdjacentList() {
		return adjacentList;
	}
	public void setAdjacentList(List<Edge> adjacentList) {
		this.adjacentList = adjacentList;
	}
	public boolean isVisited() {
		return visited;
	}
	public void setVisited(boolean visited) {
		this.visited = visited;
	}
	public Vertex getPrevious() {
		return previous;
	}
	public void setPrevious(Vertex previous) {
		this.previous = previous;
	}
	@Override
	public String toString(){
		return this.name;
	}

}
