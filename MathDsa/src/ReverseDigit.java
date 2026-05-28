public class ReverseDigit {

    static void reverseDigits(int n)
    {

        int remainder = 0;
        int number = 0;


        while(n > 0){
              remainder = n%10;

           number = (number*10) + (remainder);

             n = n/10;
//            System.out.println(remainder);

        }

        System.out.println(number);




    }
    public static void main(String[] args)
    {
        int n = 98765;
       reverseDigits(n);





    }
}
