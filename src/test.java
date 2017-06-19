import java.util.ArrayList;
import java.util.List;

/**
 * Created by songchiyun on 2017. 6. 16..
 */
public class test {
    public static void main(String[] args){
        List<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        int k = 3;
        for(int i : a){
            a.get(k);
            k--;
        }
        for(int n : a){
            System.out.println(n);
        }
    }
}
