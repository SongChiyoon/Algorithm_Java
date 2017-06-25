package DataStructure.DS.sort;

/**
 * Created by songchiyun on 2017. 6. 25..
 * time complexity : O(n*log(n))
 */
public class MergeSort {

    public int[] temp;
    public int[] arr;
    public void prepare(int[] arr){
        this.arr= arr;
        this.temp = new int[arr.length];
    }
    public static void main(String[] args) {
        MergeSort sort = new MergeSort();
        int[] arr = {1, 50, 30, 10, 60, 80};

        sort.prepare(arr);

        System.out.println("Before Sort");
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");

        sort.divide(0, arr.length-1);

        System.out.println("\nAfter Sort");
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }

    public void MergeSort(int low, int high, int mid) {

        for (int i = low; i <= high; i++)
            temp[i] = arr[i];
        int i = low;
        int index = low;
        int j = mid+1;
        while (i <= mid && j <= high) {
            if (temp[i] > temp[j]) {
                arr[index] = temp[j];
                j++;
                index++;
            } else {
                arr[index] = temp[i];
                i++;
                index++;
            }
        }
        while (index != high + 1) {
            if (i > mid) {
                arr[index] = temp[j];
                j++;
                index++;
                continue;
            }
            if (j > high) {
                arr[index] = temp[i];
                i++;
                index++;
            }
        }

    }

    public void divide(int low, int high) {
        if (low < high) {
            int mid =low+ (high - low) / 2;
            divide(low, mid);
            divide(mid+1, high);
            MergeSort(low, high, mid);
        }
    }
}
