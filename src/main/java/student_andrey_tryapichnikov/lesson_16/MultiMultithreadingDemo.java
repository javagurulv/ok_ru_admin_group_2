package student_andrey_tryapichnikov.lesson_16;

public class MultiMultithreadingDemo {
    public static void main(String[] args) {
        int i = 0;
        while (i < 5) {
            final int threadN = i;
            new Thread(() -> System.out.printf("%s Hello world!\n", threadN)).start();
            i++;
        }
    }
}
