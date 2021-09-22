package student_alexander_fateev.lesson8.level_7.task25;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class TestRunner {
    public void run(Class testClass) {
        for (Method m : testClass.getDeclaredMethods()) {
            if (m.isAnnotationPresent(Test.class)) {
                try {
                    m.invoke(null);
                    System.out.println(m + ": PASSED");
                } catch (InvocationTargetException wrappedExc) {
                    Throwable exc = wrappedExc.getCause();
                    System.out.println(m + " failed: " + exc);
                } catch (IllegalAccessException exc) {
                    System.out.println("Invalid @Test: " + m);
                }
            }
        }
    }
}
