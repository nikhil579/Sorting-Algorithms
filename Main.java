class Main
{
static int count = 0;
static void printArray(int arr[]) { 
    for (int i=0; i<arr.length; i++) 
        System.out.print(arr[i] + " "); 
    System.out.println(); 
    }
static void bubbleSort(int[] arr) {
    boolean sorted = false;
    int temp;
     while(!sorted) {
         sorted = true;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i+1]) {
                temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
                sorted = false;
                count++;           
            }
            //printArray(arr);
        }
        //System.out.println();
    }
}
static void insertionSort(int[] arr){
    for (int i = 1; i < arr.length; i++) {
        int value = arr[i];
        int j = i;
        while(j > 0 && value < arr[j-1]){
            arr[j] = arr[j-1];
            j = j-1;           
        }
        arr[j] = value;
        printArray(arr);
        System.out.println();
    }
}

static void selectionSort(int[] arr){
    for (int i = 0; i < arr.length-1; i++){
        int iMin = i;
        for (int j = i+1; j < arr.length; j++){
            if(arr[j] < arr[iMin])
               iMin = j;
        }
            int temp = arr[i];
            arr[i]=arr[iMin];
            arr[iMin]=temp;
        }
}
static int minNum(int[] arr){
     int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
}
    
static int maxNum(int[] arr){
    int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
}

public static void main(String[] args) {
    //{64, 34, 12, 96, 8};
    int arr[] = {2,4,7,1,5,3}; 
    //ob.bubbleSort(arr);
    //ob.insertionSort(arr); 
    selectionSort(arr);
    System.out.println("Sorted array"); 
    printArray(arr);
    //System.out.println("Total Comparisons: "+count);
    System.out.println("Max: "+maxNum(arr));
    System.out.println("Min: "+minNum(arr));
	}
}
