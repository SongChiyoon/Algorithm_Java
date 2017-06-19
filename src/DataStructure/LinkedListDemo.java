package DataStructure;

/**
 * Created by songchiyun on 2017. 6. 19..
 */
public class LinkedListDemo {

    public static void main(String[] args){
        LinkedListU<String> ls = new LinkedListU<String>();
        ls.add("Song");
        ls.add("Hong");
        ls.add("Kong");
        ls.add("Tong");
        ls.add("Aong");
        ls.display();
        ls.delete();
        System.out.println("after delete");
        ls.display();
    }
}
