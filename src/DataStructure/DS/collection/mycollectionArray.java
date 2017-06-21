package DataStructure.DS.collection;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by songchiyun on 2017. 6. 21..
 */
public class mycollectionArray {

    public static void main(String[] args){
        ArrayList<String> ar = new ArrayList<String>();
        ar.add("song");
        ar.add("hong");
        ar.add("Park");
        ar.add("Kim");


        ar.remove(1);
        Iterator<String> itr = ar.iterator();

        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        for(String st : ar){
            System.out.println(st);
        }

        ArrayList<employee> emp = new ArrayList<employee>();
        emp.add(new employee("song", 12));
        emp.add(new employee("kim", 23));
        emp.add(new employee("park", 40));
        for(employee e : emp){
            System.out.println("name : "+e.name);
        }



    }
    static class employee{
        String name;
        int age;
        public employee(String name, int age){
            this.name = name;
            this.age = age;
        }
    }
}
