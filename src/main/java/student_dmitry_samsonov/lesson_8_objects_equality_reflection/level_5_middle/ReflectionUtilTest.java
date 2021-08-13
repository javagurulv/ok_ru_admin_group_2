package student_dmitry_samsonov.lesson_8_objects_equality_reflection.level_5_middle;


import java.lang.reflect.InvocationTargetException;
import java.sql.Ref;

class ReflectionUtilTest {
    public static void main(String[] args) throws ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        ReflectionUtilTest.accessModifierTest();
        ReflectionUtilTest.parentNameTest();
        ReflectionUtilTest.defaultConstructorTest();
    }
    static void printTestResult(String name, boolean result) {
        String reportName = name + " test = ";
        String reportResult;
        if (result) {
            reportResult = "OK";
        } else {
            reportResult = "FAIL";
        }
        System.out.println(reportName + reportResult);
    }
    static void accessModifierTest() throws ClassNotFoundException {
        ReflectionUtil reflectionUtil = new ReflectionUtil();
        String result = reflectionUtil.getClassAccessModifier("java.util.Scanner");
        String expectedResult = "public final";
        printTestResult("access modifier", result.equals(expectedResult));
    }
    static void parentNameTest() throws ClassNotFoundException {
        ReflectionUtil reflectionUtil = new ReflectionUtil();
        String result = reflectionUtil.getSuperClassName("java.util.Scanner");
        String expectedResult = "java.lang.Object";
        printTestResult("parent name", result.equals(expectedResult));
    }
    static void defaultConstructorTest() throws ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        ReflectionUtil reflectionUtil = new ReflectionUtil();
        Object result = reflectionUtil.createClassInstanceUsingDefaultConstructor("student_dmitry_samsonov.lesson_8_objects_equality_reflection.level_5_middle.ReflectionUtil");
        Object expectedResult = reflectionUtil;
        printTestResult("default constructor", expectedResult.getClass() == result.getClass());
    }
}