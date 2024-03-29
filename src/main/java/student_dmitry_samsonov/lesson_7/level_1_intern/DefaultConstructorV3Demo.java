package student_dmitry_samsonov.lesson_7.level_1_intern;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class DefaultConstructorV3Demo {
    public static void main(String[] args) {
        DefaultConstructorV3 defaultConstructorV3 = new DefaultConstructorV3();
        System.out.println(defaultConstructorV3.getFullName());
        System.out.println(defaultConstructorV3.getAge());
        System.out.println(defaultConstructorV3.getMale());
        System.out.println(defaultConstructorV3.getFemale());
    }
}
