package exceptionpropogation;


public class Task {

    void m1() {
        int x = 10 / 0;
    }

    void m2() {
        m1();
    }

    void m3() {
        try {
            m2();
        }
        catch(ArithmeticException e) {
            System.out.println("Handled");
        }
    }

    public static void main(String[] args) {
        Task t = new Task();
        t.m3();
    }
}