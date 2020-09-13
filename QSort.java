//CLRS SOLUTION
public class QSort {
    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = (low-1);
        for (int j = low; j < high; j++) {
            if(arr[j] < pivot){
                i++;
                swap(arr,i,j);
            }
        }
        swap(arr, i+1, high);
        return i+1 ;
    }
    public static void quickSort(int[] arr,int low,int high) {
        if(low < high) {
            int part = partition(arr,low,high);
            quickSort(arr,low,part-1);
            quickSort(arr,part+1,high);
        }
    }
    public static void swap(int [] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {6,3,2,1,5,9,7,8,15,6,3,2,1,5,9,7,8,15,6,3,2,1,5,9,7,8,15,6,3,2,1,5,9,7,8,15};
        quickSort(arr, 0, arr.length-1);
        printArray(arr);

    }

}
