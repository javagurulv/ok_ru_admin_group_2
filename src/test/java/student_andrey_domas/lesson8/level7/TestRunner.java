package student_andrey_domas.lesson8.level7;

import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Objects;

public class TestRunner {
    public void run(Class testClass) {

        Object obj = null;

        // create instance of testClass
        try {
            obj = testClass.getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }

        // no default constructor or not public class
        if (Objects.isNull(obj)) {
            return;
        }

        for (Method m: testClass.getDeclaredMethods()) {
            if (m.isAnnotationPresent(Before.class)) {
                try {
                    m.invoke(obj);
                } catch (Exception e) {
                    e.printStackTrace();
                    return;
                }
            }
            if (m.isAnnotationPresent(Test.class)) {

                Class<? extends Throwable> throwableClass = m.getAnnotation(Test.class).expected();

                System.out.print("Test " + m.getName() + ": ");
                try {
                    m.invoke(obj);
                    System.out.println("OK");
                } catch (Exception e) {
                    if (e.getCause().getClass().isAssignableFrom(throwableClass)) {
                        System.out.println("OK");
                        continue;
                    }
                    System.out.println("FAIL");
                    e.printStackTrace(System.out);
                }
            }
        }
    }

    public static void main(String[] args) {
        new TestRunner().run(student_andrey_domas.lesson8.level5.ReflectionUtilTest.class);
    }
}
