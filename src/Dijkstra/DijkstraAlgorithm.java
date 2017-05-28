package Dijkstra;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

/**
 * Created by songchiyun on 2017. 3. 15..
 */
public class DijkstraAlgorithm {

    public void computePath(Vertex sourceVertex){

        sourceVertex.setDistance(0);
        PriorityQueue<Vertex> priorityQueue = new PriorityQueue<>();
        priorityQueue.offer(sourceVertex);

        while(!priorityQueue.isEmpty()){

            Vertex actualVertex = priorityQueue.poll();

            for(Edge edge : actualVertex.getAdjacenciesList()){

                Vertex v = edge.getTargetVertex();

                double newDistance = actualVertex.getDistance() + edge.getWeight();

                if(newDistance < v.getDistance()){
                    priorityQueue.remove(v);
                    v.setDistance(newDistance);
                    v.setProdecessor(actualVertex);
                    priorityQueue.offer(v);
                }
            }
        }
    }
    public List<Vertex> getShortestPathTo(Vertex targetVertex){

        List<Vertex> shortedPathToTarget = new ArrayList<>();

        for(Vertex vertex = targetVertex ; vertex != null; vertex = vertex.getProdecessor()){

            shortedPathToTarget.add(vertex);
        }

        Collections.reverse(shortedPathToTarget);
        return shortedPathToTarget;
    }
}
