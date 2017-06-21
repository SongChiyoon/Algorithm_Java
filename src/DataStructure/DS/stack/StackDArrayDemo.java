package DataStructure.DS.stack;

/**
 * Created by songchiyun on 2017. 6. 21..
 */
public class StackDArrayDemo {

    public static void main(String[] args){
        StackDArray<Integer> st = new StackDArray<Integer>(2);
        System.out.println("size stack :" + st.getSize());
        st.push(12);
        st.push(13);
        st.push(14);
        System.out.println("size stack :" + st.getSize());
        st.push(15);
        st.push(16);
        System.out.println("size stack :" + st.getSize());

    }
}
