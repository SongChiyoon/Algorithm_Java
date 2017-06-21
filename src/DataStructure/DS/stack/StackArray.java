package DataStructure.DS.stack;

import java.util.Stack;

/**
 * Created by songchiyun on 2017. 6. 21..
 */
public class StackArray<T> {
    Object[] ArrayStack;
    int size;
    int top;
    public StackArray(int size){
        this.size = size;
        ArrayStack = new Object[this.size];
        top = -1;
    }

    public void push(Object newItem){
        if(isFull()){
            System.out.println("stack is full");
            return;
        }
        top = top+1;
        ArrayStack[top] = newItem;

    }
    private Boolean isFull(){
        return(top == size-1);
    }
    public Boolean isEmpty(){
        return(top == -1);
    }
    public T pop(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return null;
        }
        T item = (T) ArrayStack[top];
        top -= 1;
        return item;
    }
}
