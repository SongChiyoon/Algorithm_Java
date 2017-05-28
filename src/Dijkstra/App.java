package Dijkstra;

/**
 * Created by songchiyun on 2017. 3. 15..
 */
public class App {

    public static void main(String[] args){

        Vertex v0 = new Vertex("A");
        Vertex v1 = new Vertex("B");
        Vertex v2 = new Vertex("C");

        v0.addNeighbor(new Edge(1, v0, v1));
        v0.addNeighbor(new Edge(-1, v0, v2));

        v1.addNeighbor(new Edge(1, v1, v2));

        DijkstraAlgorithm algorithm = new DijkstraAlgorithm();
        algorithm.computePath(v0);

        System.out.println(algorithm.getShortestPathTo(v2));

    }

}
