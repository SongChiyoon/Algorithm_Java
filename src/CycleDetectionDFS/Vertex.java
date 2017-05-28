package CycleDetectionDFS;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by songchiyun on 2017. 3. 12..
 */
public class Vertex {
    private String name;
    private boolean visited;
    private boolean beingVisited;
    private List<Vertex> adjacentList;

    Vertex(String name){
        this.name = name;
        this.adjacentList = new ArrayList<>();
    }

    @Override
    public String toString() {
        return ""+name;
    }
    public void addNeighbor(Vertex v){
        adjacentList.add(v);
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

    public boolean isBeingVisited() {
        return beingVisited;
    }

    public void setBeingVisited(boolean beingVisited) {
        this.beingVisited = beingVisited;
    }

    public List<Vertex> getAdjacentList() {
        return adjacentList;
    }

    public void setAdjacentList(List<Vertex> adjacentList) {
        this.adjacentList = adjacentList;
    }
}
