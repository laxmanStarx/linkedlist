public class Test {

    static boolean checkPalindrome(String str){
        int start = 0;
        int end = str.length() -1;

        str = str.toLowerCase();

        while(start < end)
        {
            if(str.charAt(start) != str.charAt(end)){
                return false;

            }
            start++;
            end--;
        }
        return str.charAt(start) == str.charAt(end);
    }

    public static void main(String[] args)
    {
        String str = "exise";
        if(checkPalindrome(str) == true){
            System.out.println("Yes it is palindrome");
        }else{
            System.out.println("No it is not palindrome");
        }

    }
}
