package sort;

public class quickSort2 {

	public void sort(int left, int right, int[] arr){
		
		if(left >= right)
			return;
		int pivot = left;
		int i = left+1;
		int j = right;
		
		while(i < j){
			
			while(i<j && arr[i] < arr[pivot]){i++;}
			while(i<j && arr[j] > arr[pivot]){j--;}
			if(i < j)
				swap(arr, i, j);
		}
		
		int tmp = arr[pivot];
		arr[pivot] = arr[i];
		arr[i] = tmp;
		sort(left, i, arr);
		sort(i+1, right, arr);
		
		
	}
	public void swap(int[] arr, int i, int j){
		int tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;
	}
}
