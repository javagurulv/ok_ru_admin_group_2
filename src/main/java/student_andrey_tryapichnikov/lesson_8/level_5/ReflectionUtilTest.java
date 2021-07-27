package student_andrey_tryapichnikov.lesson_8.level_5;

public class ReflectionUtilTest {
    public static void main(String[] args) {
        var reflectionUtil = new ReflectionUtil();
        var className = "student_andrey_tryapichnikov.lesson_7.level_5.Square";
        System.out.println(reflectionUtil.getClassAccessModifier(className));
        System.out.println(reflectionUtil.getSuperClassName(className));
        System.out.println(reflectionUtil.getSuperClassName("i.dont.exist"));
    }
}
