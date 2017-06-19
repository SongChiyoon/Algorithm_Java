package DataStructure;

/**
 * Created by songchiyun on 2017. 6. 19..
 */
public class LinkedListU<T> {
    Node head;

    public LinkedListU(){
        head = null;
    }
    public void add(Object value){
        Node newNode = new Node(value, null);
        if(head==null)
            head = newNode;
        else{
            newNode.next = head;
            head = newNode;
        }
    }
    public void delete(){
        head = head.next;
    }
    public void display(){
        Node temp = head;

        while(temp != null){
            System.out.println(temp.value);
            temp = temp.next;
        }
    }
}
