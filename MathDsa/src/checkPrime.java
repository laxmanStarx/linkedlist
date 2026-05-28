import java.util.Scanner;

public class checkPrime {

    static boolean isPrime(int n)
    {
        for(int i =2;i<=n-1; i++){
            if(n%i != 0){
                return true;
            }else{
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(isPrime(n) == true){
            System.out.println("yes it is prime");
        }else{
            System.out.println("no it is not prime");
        }

    }
}
