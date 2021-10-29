package student_andrey_tryapichnikov.lesson_16;

public class MultithreadingDemo {
    public static void main(String[] args) {
        new Thread(() -> System.out.println("Hello world!")).start();
    }
}
