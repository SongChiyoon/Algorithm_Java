package DataStructure.DS.graph;

/**
 * Created by songchiyun on 2017. 7. 9..
 */
public class BFSDemo {

    public static void main(String[] args){

        BFSgraph g = new BFSgraph(6);
        g.add(0,2);
        g.add(0, 1);
        g.add(1,4);
        g.add(1,3);
        g.add(2,5);

        g.add(2,0);
        g.add(1, 0);
        g.add(3,1);
        g.add(4,1);
        g.add(5,2);

        g.BFS(0);
    }
}
