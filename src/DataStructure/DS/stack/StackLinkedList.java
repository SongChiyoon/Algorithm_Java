package DataStructure.DS.stack;



/**
 * Created by songchiyun on 2017. 6. 21..
 */
public class StackLinkedList<T> {
    Node top;

    public StackLinkedList(){
        this.top = null;
    }
    public void push(Object item){
        Node newNode = new Node(item, null);
        if(top == null)
            top = newNode;
        else{
            newNode.next = top;
            top = newNode;
        }
    }
    public T pop(){
        if(top == null){
            System.out.println("Stack is empty");
            return null;
        }
        T pop = (T)top.value;
        top = top.next;
        return pop;
    }

}
