package Kosaraju;

import java.util.ArrayList;
import java.util.List;

public class Vertex {

	private int id;
	private String name;
	private boolean visited;
	private List<Vertex> adjacenlist;
	private int componentId;
	public Vertex(int id, String name) {
		this.id = id;
		this.name = name;
		this.adjacenlist = new ArrayList<>();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isVisited() {
		return visited;
	}
	public void setVisited(boolean visited) {
		this.visited = visited;
	}
	public List<Vertex> getAdjacenlist() {
		return adjacenlist;
	}
	public void setAdjacenlist(List<Vertex> adjacenlist) {
		this.adjacenlist = adjacenlist;
	}
	public int getComponentId() {
		return componentId;
	}
	public void setComponentId(int componentId) {
		this.componentId = componentId;
	}
	public void addNeighbor(Vertex v){
		this.adjacenlist.add(v);
	}
	@Override
	public String toString(){
		return this.name;
	}
	
	
}
