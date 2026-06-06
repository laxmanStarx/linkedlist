package MergeSorting;

public class MergingEle {


    static void merge(int arr[], int left,int mid, int right)
    {
        int n1 = mid - left +1;

        int n2 = right - mid;

        int[] L1 = new int[n1];
        int[] L2 = new int[n2];

        for(int i = 0; i<n1; i++){
            L1[i] = arr[left+i];
        }
        for(int j = 0; j<n2; j++){
            L2[j] = arr[mid+1 + j];
        }

        int i = 0; //Index of L[];
        int j = 0; //Index of R[];
        int k = left; //index of merged array

        while(i < n1 && j<n2){
            if(L1[i] <= L2[j]){
                arr[k] = L1[i];
                i++;

            }else{
                arr[k] = L2[j];
                j++;
            }
            k++;
        }
        while(i < n1){
            arr[k] = L1[i];
            i++;
            k++;
        }
        while(j < n2){
            arr[k] = L2[j];
            j++;
            k++;
        }

    }






    static void mergeSort(int arr[], int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;

            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            merge(arr,left,mid,right);
        }
    }






    public static void main(String[] args)
    {
        int arr[] = {95,94,93,2,92,1};
        mergeSort(arr,0,arr.length-1);

        for(int num: arr){
            System.out.println(num + " ");
        }

    }
}
