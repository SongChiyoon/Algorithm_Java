package DataStructure.DS.stack;

/**
 * Created by songchiyun on 2017. 6. 21..
 */
public class StackArrayDemo {

    public static void main(String[] args){
        StackArray<Integer> st = new StackArray<Integer>(5);

        st.push(10);
        st.push(11);
        st.push(12);
        st.push(13);
        st.push(14);
        st.push(15);
        st.push(16);

        while(!st.isEmpty()){
            System.out.println(st.pop());
        }
        System.out.println(st.pop());



    }
}
