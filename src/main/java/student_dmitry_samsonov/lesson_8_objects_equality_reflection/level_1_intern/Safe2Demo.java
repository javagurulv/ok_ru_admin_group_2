package student_dmitry_samsonov.lesson_8_objects_equality_reflection.level_1_intern;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Safe2Demo {
    public static void main(String[] args) {
        Safe2 safe2 = new Safe2(123, 0);
        System.out.println(safe2.putMoney(123, 1));
        System.out.println(safe2.getMoney(1, 0));
        System.out.println(safe2.getMoney(123, 10));
    }
}