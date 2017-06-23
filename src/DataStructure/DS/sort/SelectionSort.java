package DataStructure.DS.sort;

/**
 * Created by songchiyun on 2017. 6. 23..
 */
public class SelectionSort {
    static void SelectionSort(int[] arr){
        int n = arr.length;
        int temp = 0;
        for(int i = 0; i < n-1; i++){
            int index = i;

            for(int j = i+1; j < n; j++){

                if(arr[j] < arr[index]){
                    index = j;
                }
            }
            if(i != index) {
                temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;
            }
        }
    }
    public static void main(String[] args){
        int[] arr = {1,50,30,10,60,80};
        System.out.println("Before Sort");
        for(int i =0; i< arr.length; i++)
            System.out.print(arr[i] + " ");
        SelectionSort(arr);
        System.out.println("\nAfter Sort");
        for(int i =0; i< arr.length; i++)
            System.out.print(arr[i]+ " ");
    }
}
