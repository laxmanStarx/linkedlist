package RotateArrayD;

import java.util.Arrays;

public class DtimesArray {

    public static void reverse(int[] arr, int start, int end)
    {



        while(start < end){
            int temp = arr[start];
            arr[start ] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void reverseD(int arr[],  int d)
    {

        int n = arr.length;
        d = d%10;

        reverse(arr,0,d-1);
        reverse(arr, d,n-1);
        reverse(arr,0,n-1);
    }


    public static void main(String[] args)
    {
        int arr[] = {1, 2, 3, 4, 5, 6};
        int d = 2;

        reverseD(arr,2);
        System.out.println(Arrays.toString(arr));

    }


}
