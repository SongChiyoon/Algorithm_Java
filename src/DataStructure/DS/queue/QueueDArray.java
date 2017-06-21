package DataStructure.DS.queue;

import java.util.Arrays;

/**
 * Created by songchiyun on 2017. 6. 21..
 */
public class QueueDArray<T> {
    Object[] ArrayQueue;
    int Rear;
    int Front;
    int size;

    public QueueDArray(int size){
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
        ensureCapacity(Rear+2);
        this.Rear += 1;
        ArrayQueue[Rear] = newItem;
        if(Front == -1)
            Front = 0;
    }
    public void ensureCapacity(int minCapacity){
        int oldCapacity = getSize();
        if(oldCapacity < minCapacity){
            int newCapacity = oldCapacity*2;
            if(newCapacity < minCapacity)
                newCapacity = minCapacity;
            ArrayQueue = Arrays.copyOf(ArrayQueue, newCapacity);
        }
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
    public int getSize(){
        return this.ArrayQueue.length;
    }
}
