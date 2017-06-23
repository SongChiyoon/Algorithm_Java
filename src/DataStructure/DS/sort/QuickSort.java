package DataStructure.DS.sort;

/**
 * Created by songchiyun on 2017. 6. 23..
 * 이해를 도와주는 동영상 : https://opentutorials.org/course/543/2723
 */
public class QuickSort {
    static void QuickSort(int[] arr, int low, int high){

        if(low > high) return;
        int mid = low + (high-low)/2;
        int pivot = arr[mid];
        int i = low;
        int j = high;
        while(i <= j){
            while(arr[i] < pivot)
                i++;
            while(arr[j] > pivot)
                j--;
            if(i <= j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        if(low < j)
            QuickSort(arr, low, j);
        if(i < high)
            QuickSort(arr, i, high);

    }
    public static void main(String[] args){
        int[] arr = {1,50,30,10,60,80};
        System.out.println("Before Sort");
        for(int i =0; i< arr.length; i++)
            System.out.print(arr[i] + " ");
        QuickSort(arr, 0, arr.length-1);
        System.out.println("\nAfter Sort");
        for(int i =0; i< arr.length; i++)
            System.out.print(arr[i]+ " ");
    }
}
