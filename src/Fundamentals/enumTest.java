package Fundamentals;

enum Status{
    Running, pending, stopped,started;
}

public class enumTest {

    public static void main(String args[]){
        Status s = Status.Running;
        System.out.println(s);
    }

}
