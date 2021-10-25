package student_andrey_tryapichnikov.lesson_11.level_3;

public class MultiCatchExample {
    public static void main(String[] args) {
        try {
            System.out.println();
        } catch (ArithmeticException a) {
            // более специфичные исключения нужно ловить первыми
            System.out.println();
        } catch (Exception e) {
            System.out.println();
        }
    }
}
