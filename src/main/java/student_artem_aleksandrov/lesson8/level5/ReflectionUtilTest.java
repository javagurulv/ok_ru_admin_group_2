package student_artem_aleksandrov.lesson8.level5;

import java.lang.reflect.InvocationTargetException;

public class ReflectionUtilTest {
    public static void main(String[] args) throws ClassNotFoundException, InvocationTargetException,
            NoSuchMethodException, InstantiationException, IllegalAccessException {

        ReflectionUtil reflectionUtil = new ReflectionUtil();
        ReflectionUtilTest reflectionUtilTest = new ReflectionUtilTest();

        try {
            reflectionUtilTest.testGetClassAccessModifier(reflectionUtil);
            reflectionUtilTest.testGetSuperClassName(reflectionUtil);
        } catch (ClassNotFoundException classNotFoundException) {
            System.out.println("Test failed. Class not found: %s".formatted(String.valueOf(classNotFoundException)));
        }

        String fullClassName = "student_artem_aleksandrov.lesson8.level5.Dog";
        reflectionUtil.printClassMethods(fullClassName);
        reflectionUtil.printClassFields(fullClassName);
        reflectionUtil.printClassConstructors(fullClassName);
        reflectionUtil.createClassInstanceUsingDefaultConstructor(fullClassName);

    }

    void testGetClassAccessModifier(ReflectionUtil reflectionUtil) throws ClassNotFoundException {
        String testClassName = "student_artem_aleksandrov.lesson8.level5.ReflectionUtilTest";

        if (reflectionUtil.getClassAccessModifier(testClassName).equals("public")) {
            System.out.println("Test OK");
        } else {
            System.out.println("Test Failed");
        }

        testClassName = "student_artem_aleksandrov.lesson8.level5.PrivateClass";
        if (reflectionUtil.getClassAccessModifier(testClassName).equals("")) {
            System.out.println("Test OK");
        } else {
            System.out.println("Test Failed");
        }

    }

    void testGetSuperClassName(ReflectionUtil reflectionUtil) throws ClassNotFoundException {
        String testClassName = "student_artem_aleksandrov.lesson8.level5.PrivateClass";

        if (reflectionUtil.getSuperClassName(testClassName).equals("java.lang.Object")) {
            System.out.println("Test OK");
        } else {
            System.out.println("Test Failed");
        }
    }
}
