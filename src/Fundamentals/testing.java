package Fundamentals;


class Student {
    int marks = 50;
}

class Demo {
    static void change(int marks) {
        marks = 100;
    }

    public static void main(String[] args) {
        Student st = new Student();
        int marks = 10;

        change(marks);

        System.out.println(marks);
    }
}