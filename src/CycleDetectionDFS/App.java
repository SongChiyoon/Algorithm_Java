package CycleDetectionDFS;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by songchiyun on 2017. 3. 12..
 */
public class App {

    public static void main(String[] args){

        Vertex v1 = new Vertex("1");
        Vertex v2 = new Vertex("2");
        Vertex v3 = new Vertex("3");
        Vertex v4 = new Vertex("4");
        Vertex v5 = new Vertex("5");
        Vertex v6 = new Vertex("6");

        v1.addNeighbor(v2);
        v1.addNeighbor(v3);

        v2.addNeighbor(v3);

        v4.addNeighbor(v1);
        v4.addNeighbor(v5);

        v5.addNeighbor(v6);

        v6.addNeighbor(v4);

        List<Vertex> vertexList = new ArrayList<>();
        vertexList.add(v1);
        vertexList.add(v2);
        vertexList.add(v3);
        vertexList.add(v4);
        vertexList.add(v5);
        vertexList.add(v6);

        CycleDetection cycleDetection = new CycleDetection();

        cycleDetection.detectCycle(vertexList);
    }
}
