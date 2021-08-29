package student_artem_aleksandrov.lesson8.level7;

// Создайте свой собственный мини тест фреймворк.
//
//Объявите класс TestRunner, в этом классе нужно оеализовать
//всего один метод:
//
//    public void run(Class testClass);
//
//Это метод должен:
//- создавать инстанцию класса с помощью дефолтного конструктора
//- находить все методы с аннотацией @Test и вызывать их печатая
//  на консоль результат их работы (если тест выполнился без ошибки
//  то тест признаётся пройденным успешно, если из теста вылетела
//  ошибка, то тест считается проваленным).

import org.junit.Test;
import student_artem_aleksandrov.lesson8.level5.ReflectionUtil;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestRunner {

    public static void main(String[] args) throws ClassNotFoundException, InvocationTargetException,
            NoSuchMethodException, InstantiationException, IllegalAccessException {
        TestRunner testRunner = new TestRunner();

        Class testClass = Class.forName("student_artem_aleksandrov.lesson8.level7.SomeTestClass");
        testRunner.run(testClass);
    }
    public void run(Class testClass) throws NoSuchMethodException, InvocationTargetException,
            InstantiationException, IllegalAccessException, ClassNotFoundException {

        ReflectionUtil reflectionUtil = new ReflectionUtil();

        Object testInstance = reflectionUtil.createClassInstanceUsingDefaultConstructor(testClass.getName());

        for (Method method: testClass.getDeclaredMethods()) {
            if (method.isAnnotationPresent(Test.class)) {
                System.out.printf("Running %s test...".formatted(method.getName()));
                Object value = method.invoke(testInstance);
                boolean result = (Boolean) value;
                if (result) {
                    System.out.println("PASSED");
                } else {
                    System.out.println("FAILED");
                }
            }
        }
    }
}
