package DataStructure.DS.stack;

/**
 * Created by songchiyun on 2017. 6. 21..
 */
public class StackLinkedListDemo {

    public static void main(String[] args){
        StackLinkedList<String> st =
                new StackLinkedList<String>();

        st.pop();
        st.push("Song");
        st.push("Hong");
        st.push("Kong");
        st.push("Tong");
        st.push("Pong");

        System.out.println(st.pop());
        System.out.println(st.pop());


    }
}
