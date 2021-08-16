package student_dmitry_samsonov.lesson_8_objects_equality_reflection.level_1_intern;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class SafeDemo {
    public static void main(String[] args) {
        Safe safe = new Safe();
        safe.password = 123;
        safe.sum = 0;
    }
}
