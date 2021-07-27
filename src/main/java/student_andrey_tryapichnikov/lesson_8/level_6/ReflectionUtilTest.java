package student_andrey_tryapichnikov.lesson_8.level_6;

public class ReflectionUtilTest {
    public static void main(String[] args) {
        var reflectionUtil = new ReflectionUtil();
        var className = "student_andrey_tryapichnikov.lesson_7.level_5.Rectangle";
        System.out.println(reflectionUtil.getClassAccessModifier(className));
        System.out.println(reflectionUtil.getSuperClassName(className));
        System.out.println(reflectionUtil.getSuperClassName("i.dont.exist"));
        reflectionUtil.printClassMethods("i.dont.exist.either");
        reflectionUtil.printClassMethods(className);
        reflectionUtil.printClassFields(className);
        reflectionUtil.printClassConstructors(className);
        var className2 = "student_andrey_tryapichnikov.lesson_8.level_6.Dog";
        var newObject = reflectionUtil.createClassInstanceUsingDefaultConstructor(className2);
        System.out.println(newObject.toString());
    }
}
