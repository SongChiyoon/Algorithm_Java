package DataStructure;

/**
 * Created by songchiyun on 2017. 6. 19..
 */
public class LinkedListD<T> {
    NodeD head;

    public LinkedListD(){
        head = null;
    }
    public void add(Object value){
        NodeD newNode = new NodeD(value, null, null);
        if(head==null)
            head = newNode;
        else{
            newNode.next = head;
            head.pre = newNode;
            head = newNode;
        }
    }
    public void delete(){
        head = head.next;
        head.pre = null;
    }
    public void display(){
        NodeD temp = head;

        while(temp != null){
            System.out.println((T)temp.value);
            temp = temp.next;
        }
    }
}
