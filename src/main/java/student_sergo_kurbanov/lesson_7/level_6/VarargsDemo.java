package student_sergo_kurbanov.lesson_7.level_6;

public class VarargsDemo {
    public static void main(String[] args) {
        System.out.println(Adder(1, 2, 3, 4, 5, 6, 7, 8, 9));
    }

    static int Adder(int... num) {
        int sum = 0;
        for (int n : num) {
            sum += n;
        }
        return sum;
    }
}
