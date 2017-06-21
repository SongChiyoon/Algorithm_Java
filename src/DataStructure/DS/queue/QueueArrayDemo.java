package DataStructure.DS.queue;

/**
 * Created by songchiyun on 2017. 6. 21..
 */
public class QueueArrayDemo {

    public static void main(String[] args){

        QueueArray<Integer> q = new QueueArray<Integer>(5);

        q.Queue(10);
        q.Queue(11);
        q.Queue(12);
        q.Queue(13);
        q.Queue(14);
        q.Queue(15);

        while(!q.isEmpty()){
            System.out.println(q.DeQueue());
        }
        System.out.println(q.DeQueue());
    }
}
