package DataStructure.DS.queue;

/**
 * Created by songchiyun on 2017. 6. 21..
 */
public class QueueDArrayDemo {

    public static void main(String[] args){
        QueueDArray<Integer> q = new QueueDArray<Integer>(2);
        System.out.println(q.getSize());
        q.Queue(10);
        q.Queue(11);
        q.Queue(12);
        System.out.println(q.getSize());

    }
}
