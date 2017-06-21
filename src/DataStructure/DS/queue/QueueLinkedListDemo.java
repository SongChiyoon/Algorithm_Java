package DataStructure.DS.queue;

/**
 * Created by songchiyun on 2017. 6. 21..
 */
public class QueueLinkedListDemo {

    public static void main(String[] args){
        QueueLinkedList<String> q =
                new QueueLinkedList<String>();
        q.Queue("Song");
        q.Queue("Hong");
        q.Queue("Kong");
        q.Queue("Tong");
        q.Queue("Qong");
        System.out.println(q.Dequeue());
        System.out.println(q.Dequeue());
        System.out.println(q.Dequeue());
        System.out.println(q.Dequeue());
        System.out.println(q.Dequeue());
        System.out.println(q.Dequeue());

    }
}
