package DataStructure.DS.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.TreeSet;

/**
 * Created by songchiyun on 2017. 6. 21..
 */
public class mycollectionsets {

    public static void main(String[] args){
        /*
        TreeSet 의 경우 올림순의 정렬을 해준다
        (compareTo class를 implement 해줌으로 원하는 방향으로 sorting 되게 저장시킬 수 있다

        HashSet 은 HashMap 인터페이스를 기반으로 순서를 보장해주지 않는다
         */
        TreeSet<Integer> ls = new TreeSet<Integer>();
        ls.add(4);
        ls.add(10);
        ls.add(1);
        ls.add(2);

        Iterator<Integer> itr = ls.iterator();

        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
