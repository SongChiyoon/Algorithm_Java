package DataStructure;

/**
 * Created by songchiyun on 2017. 6. 19..
 */
public class DynamicArrayDemo {

    public static void main(String[] args){
        DynamicArray<Integer> da = new DynamicArray<Integer>();
        da.put(11);
        System.out.println("size:"+da.getSize());
        da.put(12);
        System.out.println("size:"+da.getSize());
        da.put(13);
        System.out.println("size:"+da.getSize());
        da.put(14);
        System.out.println("size:"+da.getSize());
        da.put(15);
        System.out.println("size:"+da.getSize());
        da.put(16);
        System.out.println("size:"+da.getSize());

        for(int i = 0; i < da.getSize(); i++){
            System.out.println(da.get(i));
        }
    }
}
