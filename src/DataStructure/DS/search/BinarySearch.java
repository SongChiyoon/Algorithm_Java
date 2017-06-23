package DataStructure.DS.search;

/**
 * Created by songchiyun on 2017. 6. 23..
 */
public class BinarySearch {

    public static void main(String[] args){

        DataSet data = new DataSet(10000000);
        int search = 998888;
        Boolean IsFound = false;
        int low = 0;
        int high = data.getSize()-1;
        int mid = 0;
        while(!IsFound){
            if(low > high){
                System.out.println("not found");
                break;
            }
            mid = low + ((high-low)/2);
            if(data.data[mid] == search){
                System.out.println("find number " + data.numberTry +" try");
                break;
            }
            if(data.data[mid] < search){
                data.numberTry += 1;
                low = mid+1;
                continue;
            }
            else{
                data.numberTry += 1;
                high = mid-1;
                continue;
            }
        }
    }
}
