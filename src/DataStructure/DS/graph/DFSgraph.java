package DataStructure.DS.graph;

import java.util.Stack;

/**
 * Created by songchiyun on 2017. 7. 4..
 */
public class DFSgraph {
    int size;
    adjList[] array;

    public DFSgraph(int size){

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
    public void DFS(int startVertex){
        Boolean[] visited = new Boolean[this.size];

        for(int i=0;i<this.size;i++)
            visited[i] = false;

        Stack<Integer> st = new Stack<Integer>();
        st.push(startVertex);

        while( !st.isEmpty()){

            int n = st.pop();
            st.push(n);
            visited[n] = true;
            Node head = array[n].head;
            Boolean isDone = true;
            while(head != null){
                if(!visited[head.value]){
                    st.push(head.value);
                    visited[head.value] = true;
                    isDone = false;
                    break;
                }else{
                    head = head.next;
                }
            }
            if(isDone){
                int out = st.pop();
                System.out.println("visited Node: "+out);
            }

        }
    }
}
