package JAVADUplicate;

public class reverseDelement {


    static void reverseD(int arr[], int d){

        int n = arr.length;

        d = d%n;

        int temp[] = new int[n];

        for(int i = 0; i<n; i++)
        {
            temp[i] = arr[(i+d)%n];

        }

        for(int i = 0; i<temp.length;i++){
            System.out.print(temp[i] + " ");
        }

    }









    public static void main(String[] args){

        int arr[] = {1,2,3,4,5,6};

        reverseD(arr,2);

    }


}
