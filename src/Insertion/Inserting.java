package Insertion;

public class Inserting {

    static void Inserting(int arr[]){
        for(int i = 1; i<arr.length; i++){
            int key = arr[i];
            int j = i-1;

            while(j>=0 && arr[j]>key){
                arr[j+1] = arr[j];
                j = j-1;

            }
            arr[j+1] = key;
        }
    }




    public static void main(String[] args){

        int arr[] = {95,85,5,96,20,40};
        Inserting(arr);

        for(int i = 0; i<arr.length; i++){
            System.out.println(arr[i]);
        }

    }
}
