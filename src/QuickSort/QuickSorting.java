package QuickSort;

public class QuickSorting {

    static int partition(int arr[], int low,int high){
        int pivot = arr[high];
        int idx = low -1;
        for(int j = low;j<high;j++){
            if(arr[j]< pivot) {
                idx++;


                int temp = arr[j];
                arr[j] = arr[idx];
                arr[idx] = temp;
            }
        }
        int temp = arr[idx+1];
        arr[idx+1] = arr[high];
        arr[high] = temp;

        return idx +1;
    }





    static void quickSort(int arr[], int low, int high)
    {
        if(low < high)
        {
            //here pi is the pivot index , partition function helps the pivot element to go to right index;
            int pi = partition(arr,low,high);

            quickSort(arr,low,pi-1);
            quickSort(arr,pi+1,high);
        }
    }

    public static void main(String[] args)
    {
        int arr[] = {90,79,60,3,89,1};
        quickSort(arr,0,arr.length-1);

        for(int i =0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
