package Prims;

public class Edge implements Comparable<Edge>{
	private double weight;
	private Vertex startVertex;
	private Vertex targetVertex;
	Edge(Vertex start, Vertex target,double weight){
		this.weight = weight;
		this.startVertex = start;
		this.targetVertex = target;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public Vertex getStartVertex() {
		return startVertex;
	}
	public void setStartVertex(Vertex startVertex) {
		this.startVertex = startVertex;
	}
	public Vertex getTargetVertex() {
		return targetVertex;
	}
	public void setTargetVertex(Vertex targetVertex) {
		this.targetVertex = targetVertex;
	}
	@Override
	public int compareTo(Edge compare) {
		return Double.compare(this.weight, compare.getWeight());
	}
	
	
}

