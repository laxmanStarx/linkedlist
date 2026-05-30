public class GCD {

    static int gcd(int a, int b)
    {
        while(b !=0){

            int lastValue = b;
            b = a%b;
            a = lastValue;

        }
        int ans = a;
       return ans;
    }

    public static void main(String[] args)
    {

        System.out.println(gcd(18,12));


    }
}
