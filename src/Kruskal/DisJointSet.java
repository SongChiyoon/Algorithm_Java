package Kruskal;

import java.util.ArrayList;
import java.util.List;

public class DisJointSet {
	
	private int nodeCount = 0;
	private int setCount = 0;
	private List<Node> rootNode;
	
	DisJointSet(List<Vertex> vertexes){
		this.rootNode = new ArrayList<>(vertexes.size());
		makeSets(vertexes);
	}
	public int find(Node n){
		
		Node currentNode = n;
		
		while(currentNode.getParent() != null){
			currentNode = currentNode.getParent();
		}
		
		Node rootNode = currentNode;
		
		currentNode = n;
		
		while(currentNode != rootNode){
			Node temp = currentNode.getParent();
			currentNode.setParent(rootNode);
			currentNode = temp;
		}
		return rootNode.getId();
	}
	public void union(Node node1, Node node2){
		
		int index1 = find(node1);
		int index2 = find(node2);
		
		if(index1 == index2){
			return;
		}
		
		Node root1 = this.rootNode.get(index1);
		Node root2 = this.rootNode.get(index2);
		
		if(root1.getRank() < root2.getRank()){
			root1.setParent(root2);
		}
		else if(root2.getRank() > root1.getRank())
			root2.setParent(root1);
		else{
			root2.setParent(root1);
			root1.setRank(root1.getRank()+1);
		}
		
		this.setCount--;
	}
	private void makeSets(List<Vertex> vertexes) {
		for(Vertex v : vertexes){
			makeSet(v);
		}
	}

	private void makeSet(Vertex vertex) {
		Node n = new Node(0, rootNode.size(), null);
		vertex.setNode(n);
		this.rootNode.add(n);
		this.setCount++;
		this.nodeCount++;
	}
}
