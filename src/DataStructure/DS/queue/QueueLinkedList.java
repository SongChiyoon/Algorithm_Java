package DataStructure.DS.queue;

/**
 * Created by songchiyun on 2017. 6. 21..
 * Queue를 Linkedlist로 구현하기 위해서는 Double linkedlist로 구현해야한다
 * front 와 Rear가 뒤, 앞으로 이동하기 떄문이다
 */
public class QueueLinkedList<T> {
    NodeD Rear;
    NodeD Front;

    public QueueLinkedList(){
        Rear = null;
        Front = null;
    }

    public void Queue(Object value){
        NodeD newNode = new NodeD(value, null, null);
        if(Front==null) {
            Front = newNode;
            Rear = newNode;
        }
        else{
            Rear.next = newNode;
            newNode.pre = Rear;
            Rear = newNode;

        }
    }
    public T Dequeue(){
        if(Rear == null || Front == null){
            System.out.println("Queue is empty");
            return null;
        }
        T value = (T)Front.value;
        Front = Front.next;

        if(Front != null)
            Front.pre = null;

        return value;
    }


}
