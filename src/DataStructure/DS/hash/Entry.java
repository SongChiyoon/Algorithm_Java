package DataStructure.DS.hash;

/**
 * Created by songchiyun on 2017. 6. 19..
 */
public class Entry<T> {
    int key;
    Object value;
    Entry next;

    public Entry(int key, Object value){
        this.key = key;
        this.value = value;
        next = null;
    }
    public Entry(){
        next = null;
    }
    public int getKey(){
        return this.key;
    }
    public Object getValue(){
        return this.value;
    }


}
