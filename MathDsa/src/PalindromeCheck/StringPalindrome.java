package PalindromeCheck;

public class StringPalindrome {


    static boolean isPalindrome(String str){
        str = str.toLowerCase();
        char arr[] = str.toCharArray();

        int start = 0;

        int end = arr.length-1;
        str = str.toLowerCase();

        while(start < end)
        {
//            if(arr[start] > arr[end]){
//                char temp = arr[start];
//                arr[start] = arr[end];
//                arr[end] = temp;
//
//                start++;
//                end--;
//            }


            if(arr[start]!= arr[end]){
                return false;
            }
            start++;
            end--;





        }
        return true;

    }




    public static void main(String[] args)
    {
        String str = "RacECar";
        if(isPalindrome(str) == true){
            System.out.println("Yes it is palindrome");

        }else{
            System.out.println("No it is palindrome");
        }


    }
}
