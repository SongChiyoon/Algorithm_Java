package DataStructure.DS.sort;

/**
 * Created by songchiyun on 2017. 6. 25..
 * 참고영상 : https://opentutorials.org/course/543/2725
 */
public class InsertSort {

    public static void InsertSort(int[] arr){
        int index = 0;
        int temp = 0;
        int high = arr.length-1;

        for(int i = 1; i < high; i++){
            index = i;
            for(int j = i-1; j >= 0; j--){
                if(arr[index] < arr[j]){
                    temp = arr[index];
                    arr[index] = arr[j];
                    arr[j] = temp;
                    index = j;
                }
                else
                    break;
            }
        }
    }
    public static void main(String[] args){
        int[] arr = {1,50,30,10,60,80};
        System.out.println("Before Sort");
        for(int i =0; i< arr.length; i++)
            System.out.print(arr[i] + " ");
        InsertSort(arr);
        System.out.println("\nAfter Sort");
        for(int i =0; i< arr.length; i++)
            System.out.print(arr[i]+ " ");
    }
}
