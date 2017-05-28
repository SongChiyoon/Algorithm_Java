package Dijkstra;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by songchiyun on 2017. 3. 15..
 */
public class Vertex implements Comparable<Vertex>{

    private String name;
    private List<Edge> adjacenciesList;
    private boolean visited;
    private Vertex prodecessor;
    private double distance = Double.MAX_VALUE;

    Vertex(String name){
        this.name = name;
        adjacenciesList = new ArrayList<>();
    }

    public void addNeighbor(Edge edge){
        adjacenciesList.add(edge);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Edge> getAdjacenciesList() {
        return adjacenciesList;
    }

    public void setAdjacenciesList(List<Edge> adjacenciesList) {
        this.adjacenciesList = adjacenciesList;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public Vertex getProdecessor() {
        return prodecessor;
    }

    public void setProdecessor(Vertex prodecessor) {
        this.prodecessor = prodecessor;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    @Override
    public String toString(){
        return this.name;
    }

    @Override
    public int compareTo(Vertex otherVertex) {
        return Double.compare(this.distance, otherVertex.getDistance());
    }
}
