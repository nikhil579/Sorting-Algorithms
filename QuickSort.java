//HACKER RANK SOLUTION
public class QuickSort {
	
	public static void quickSort(int[] array) {
		quickSort(array,0,array.length-1);
	}
	public static void quickSort(int[] array,int left, int right) {
		if(left>=right)	return;
		int pivot = array[(left+(right-left)/2)];
		int index = partition(array,left,right,pivot);
		quickSort(array, left, index-1);
		quickSort(array, index, right);
	}
	
	public static int partition(int[] array, int left, int right, int pivot) {
		while(left <= right) {
			while (array[left] < pivot) {
				left++;
			}
			while (array[right] > pivot) {
				right--;
			}
			if(left <= right) {
				swap(array, left, right);
				left++;
				right--;	
			}
		}
		return left;
	}
	
	public static void swap(int [] array, int left, int right){
		   int temp =0;
		   temp= array[right];
		   array[right]= array[left];
		   array[left]= temp;
		  }
	
	public static void main(String[] args) {
		int[] arr = {6,3,2,1,5,9,7,8,15};
		quickSort(arr);
		for (int i : arr) {
			System.out.print(i+" ");
		}
		

	}

}
