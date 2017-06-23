package DataStructure.DS.search;

/**
 * Created by songchiyun on 2017. 6. 23..
 */
public class DataSet {
    int size;
    int[] data;
    int numberTry;
    public DataSet(int size){
        this.size = size;
        this.data = new int[size];
        this.numberTry = 0;

        for(int i=1;i<=size;i++)
            data[i-1] = i;
    }
    public int getSize(){
        return data.length;
    }
}
