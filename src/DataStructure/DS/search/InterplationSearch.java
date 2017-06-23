package DataStructure.DS.search;

/**
 * Created by songchiyun on 2017. 6. 23..
 */
public class InterplationSearch {

    public static void main(String[] args){
        DataSet data = new DataSet(10000000);
        int search = 7778889;
        Boolean IsFound = false;
        int low = 0;
        int high = data.getSize()-1;
        int mid = 0;
        while(!IsFound){
            if(low > high){
                System.out.println("not found");
                break;
            }
            //Interpolation search
            mid = low + (search - data.data[low]) * ((high-low)/(data.data[high] -
                    data.data[low]));

            data.numberTry += 1;
            if(data.data[mid] == search){
                System.out.println("find number " + data.numberTry +" try");
                break;
            }
            if(data.data[mid] < search){
                low = mid+1;
                continue;
            }
            else{
                high = mid-1;
                continue;
            }
        }
    }
}
