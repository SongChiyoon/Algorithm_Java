package DataStructure.DS.graph;


import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by songchiyun on 2017. 7. 9..
 */
public class BFSgraph {
    int size;
    adjList[] array;

    public BFSgraph(int size){

        this.size = size;
        array = new adjList[this.size];
        for(int i=0;i<this.size;i++){
            array[i] = new adjList();
            array[i].head = null;
        }

    }

    public void add(int src, int dest){
        Node n = new Node(dest, null);
        n.next = array[src].head;
        array[src].head = n;
    }
    public void BFS(int startVertex){
        Boolean[] visited = new Boolean[this.size];

        for(int i=0;i<this.size;i++)
            visited[i] = false;

        Queue<Integer> queue = new LinkedList<>();
        queue.add(startVertex);

        while( !queue.isEmpty()){

            int node = queue.poll();
            System.out.println("visited Node: "+node);

            visited[node] = true;
            Node head = array[node].head;
            while(head != null){
                if(!visited[head.value]){
                    queue.add(head.value);
                    visited[head.value] = true;
                }else{
                    head = head.next;
                }
            }


        }
    }
}
