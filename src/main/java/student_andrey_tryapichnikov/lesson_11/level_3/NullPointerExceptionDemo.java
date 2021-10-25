package student_andrey_tryapichnikov.lesson_11.level_3;

public class NullPointerExceptionDemo {
    Object empty;

    public static void main(String[] args) {
        var demo = new NullPointerExceptionDemo();
        // NPE is caused by calling a method or a property of a null object
        demo.iAmFail().hashCode();
    }

    Object iAmFail() {
        return empty;
    }
}
