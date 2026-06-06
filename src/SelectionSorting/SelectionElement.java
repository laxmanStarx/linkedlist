package SelectionSorting;

public class SelectionElement {


    static void selectionSort(int arr[])
    {
        for(int i = 0; i<arr.length-1;i++ ){
            int minIndex = i;

            for(int j = i+1; j<arr.length; j++){
                if(arr[j]< arr[minIndex]){
                    minIndex = j;
                }

            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;



        }
    }





    public static void main(String[] args){

        int arr[] = {90,56,89,3,67};
        selectionSort(arr);
        for(int i = 0; i< arr.length; i++){
            System.out.println(arr[i]);;
        }

    }
}
