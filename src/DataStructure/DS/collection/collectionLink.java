package DataStructure.DS.collection;


import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created by songchiyun on 2017. 6. 21..
 */
public class collectionLink {

    public static void main(String[] args){
        LinkedList<String> ls = new LinkedList<String>();
        ls.add("song");
        ls.add("park");
        ls.add("kim");
        ls.add("Ahn");

        Iterator<String> itr = ls.iterator();
        /*
            Iterator : collection의 정보를 갖고오는 Object
            hasNext
            next 를 사용가능하게 만들어준다
         */

        while(!itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
