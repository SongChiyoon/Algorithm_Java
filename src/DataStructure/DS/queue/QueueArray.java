package DataStructure.DS.queue;

/**
 * Created by songchiyun on 2017. 6. 21..
 */
public class QueueArray<T> {
    Object[] ArrayQueue;
    int Rear;
    int Front;
    int size;

    public QueueArray(int size){
        this.size = size;
        this.ArrayQueue = new Object[this.size];
        this.Front = -1;
        this.Rear = -1;
    }

    public Boolean isFull(){
        return(Rear == size-1);
    }
    public Boolean isEmpty(){
        return(Front == -1 || Front> Rear);
    }
    public void Queue(Object newItem){
        if(isFull()){
            System.out.println("Queue is full");
            return;
        }
        this.Rear += 1;
        ArrayQueue[Rear] = newItem;
        if(Front == -1)
            Front = 0;
    }
    public T DeQueue(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return null;
        }
        T value = (T)ArrayQueue[Front];
        Front += 1;
        return value;
    }
}
