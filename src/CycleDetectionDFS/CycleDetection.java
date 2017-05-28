package CycleDetectionDFS;

import java.util.List;

/**
 * Created by songchiyun on 2017. 3. 12..
 */
public class CycleDetection {

    public void detectCycle(List<Vertex> vertexList){

        for(Vertex v : vertexList){
            if(!v.isVisited()){
                dfs(v);
            }
        }
    }

    private void dfs(Vertex vertex) {
        System.out.println("DFS on vertex :"+vertex);
        vertex.setBeingVisited(true);

        for(Vertex v : vertex.getAdjacentList()){

            if(v.isBeingVisited()) {
                System.out.println("detect cycle");
                return;
            }

            if(!v.isVisited()){
                System.out.println("vising "+v+" recursively");
                v.setVisited(true);
                dfs(v);
            }
        }
        System.out.println("set vertex "+vertex+"setBeingVisited(false) setVisited(true)");
        vertex.setBeingVisited(false);
        vertex.setVisited(true);
    }
}
