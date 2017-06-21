package DataStructure.DS.collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Created by songchiyun on 2017. 6. 21..
 */
public class myQueue {

    public static void main(String[] args){
        /*
            LinkedList : java 에서 제공되는 Queue는 LinkedList 형식으로 지원해준다
         */
        System.out.println("normal Queue");
        Queue<Integer> queue = new LinkedList<>();
        queue.add(12);
        queue.add(13);
        queue.add(14);
        queue.add(15);
        queue.add(16);
        System.out.println(queue.remove());

        System.out.println("Priority Queue");
        PriorityQueue<Integer> q = new PriorityQueue<>();
        q.add(12);
        q.add(16);
        q.add(20);
        q.add(1);
        q.add(3);
        System.out.println(q.poll());
        System.out.println(q.poll());
        System.out.println(q.poll());
        System.out.println(q.poll());
        System.out.println(q.poll());

        System.out.println("student Priority Queue");
        PriorityQueue<Student> pStudent = new PriorityQueue<>();
        pStudent.add(new Student("Song", 20));
        pStudent.add(new Student("Parko", 12));
        pStudent.add(new Student("Kim", 2));
        pStudent.add(new Student("Ahn", 30));
        System.out.println(pStudent.poll().name);
        System.out.println(pStudent.poll().name);
        System.out.println(pStudent.poll().name);
        System.out.println(pStudent.poll().name);


    }
}
