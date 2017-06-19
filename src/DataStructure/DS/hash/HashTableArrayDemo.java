package DataStructure.DS.hash;

/**
 * Created by songchiyun on 2017. 6. 19..
 */
public class HashTableArrayDemo {

    public static void main(String[] args){
        HashTableArray<String> hm =
                new HashTableArray<String>(10);
        hm.put(11, "song");
        hm.put(12, "hong");
        hm.put(13, "jong");
        hm.put(14, "song");
        hm.put(1, "park");
        System.out.println(hm.get(12));

    }
}
