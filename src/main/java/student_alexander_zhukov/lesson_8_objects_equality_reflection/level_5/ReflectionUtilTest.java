package student_alexander_zhukov.lesson_8_objects_equality_reflection.level_5;

class ReflectionUtilTest {
    public static void main(String[] args) {
        ReflectionUtilTest test = new ReflectionUtilTest();
        test.getClassAccessModifierTest("java.lang.String", "public final");
        test.getSuperClassNameTest("java.lang.String", "java.lang.Object");

        ReflectionUtil reflectionUtil = new ReflectionUtil();
        String testClass = null;
        try {
            reflectionUtil.printClassConstructors("java.lang.String");
        } catch (ClassNotFoundException e) {
            System.out.println(e);
        }
    }

    public void getClassAccessModifierTest(String className, String answer) {
        ReflectionUtil reflectionUtil = new ReflectionUtil();
        String testClass = null;
        try {
            testClass = reflectionUtil.getClassAccessModifier(className);
        } catch (ClassNotFoundException e) {
            System.out.println(e);
        }
        checkResults(testClass.equals(answer), "getClassAccessModifierTest");
    }

    public void getSuperClassNameTest(String className, String answer) {
        ReflectionUtil reflectionUtil = new ReflectionUtil();
        String testClass = null;
        try {
            testClass = reflectionUtil.getSuperClassName(className);
        } catch (ClassNotFoundException e) {
            System.out.println(e);
        }
        checkResults(testClass.equals(answer), "getSuperClassNameTest");
    }

    public void checkResults(boolean result, String name) {
        if (result) {
            System.out.println("Test " + name + " - OK");
        } else {
            System.out.println("Test " + name + " - FAIL");
        }
    }
}
