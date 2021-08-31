package student_alexey_krenev.lesson_7.level_1;


class DefaultConstructorDemoV3 {
    public static void main(String[] args) {
        DefaultConstructorV3 defaultConstructorV3 = new DefaultConstructorV3();
        System.out.println("age = " + defaultConstructorV3.getAge());
        System.out.println("fullName = " + defaultConstructorV3.getFullName());
        System.out.println("female = " + defaultConstructorV3.getFemale());
        System.out.println("male = " + defaultConstructorV3.isMale());
    }
}
