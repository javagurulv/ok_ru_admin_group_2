package student_andrey_domas.lesson7.level1;

public class DefaultConstructorV3Demo {
    public static void main(String[] args) {
        var dcv3 = new DefaultConstructorV3();
        System.out.println("age = " + dcv3.getAge());
        System.out.println("fullName = " + dcv3.getFullName());
        System.out.println("female = " + dcv3.getFemale());
        System.out.println("male = " + dcv3.isMale());
    }
}
