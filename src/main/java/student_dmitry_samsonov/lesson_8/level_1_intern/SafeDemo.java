package student_dmitry_samsonov.lesson_8.level_1_intern;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class SafeDemo {
    public static void main(String[] args) {
        Safe safe = new Safe();
        safe.password = 123;
        safe.sum = 0;
    }
}
