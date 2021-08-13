package student_dmitry_samsonov.lesson_8_objects_equality_reflection.level_7_senior;


import org.junit.Test;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class TestRunner {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        TestRunner testRunner = new TestRunner();
        testRunner.run(TestRunner.class);
    }

    @Test
    public static Boolean test1(){
        return(true);
    }
    @Test
    public static Boolean test2(){
        return(false);
    }
    public void run(Class testClass) throws InvocationTargetException, IllegalAccessException {
        for (Method method: testClass.getDeclaredMethods()){
            if (method.isAnnotationPresent(Test.class)){
                System.out.print("Starting " + method.getName() + "... ");
                Boolean result = (Boolean) method.invoke(null);
                if (result) {
                    System.out.println("PASSED");
                } else {
                    System.out.println("FAILED");
                }

            }
        }
    }
}
