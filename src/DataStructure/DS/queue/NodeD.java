package DataStructure.DS.queue;

/**
 * Created by songchiyun on 2017. 6. 19..
 */
public class NodeD {
    Object value;
    NodeD next;
    NodeD pre;

    public NodeD(Object value, NodeD next, NodeD pre){
        this.value = value;
        this.next = next;
        this.pre = pre;
    }
}
