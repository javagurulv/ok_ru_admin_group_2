package student_dmitry_samsonov.lesson_8_objects_equality_reflection.level_5_middle;

import java.lang.reflect.*;
import java.util.Arrays;

class ReflectionUtil {
    public String testX;
    private Integer textY;

    public ReflectionUtil() {
    }

    public ReflectionUtil(String testX){
        this.testX = testX;
    }

    public ReflectionUtil(String testX, Integer textY) {
        this.testX = testX;
        this.textY = textY;
    }

    public String getClassAccessModifier(String fullClassName) throws ClassNotFoundException {
        Class c = Class.forName(fullClassName);
        return(Modifier.toString(c.getModifiers()));
    }
    public String getSuperClassName(String fullClassName) throws ClassNotFoundException {
        Class c = Class.forName(fullClassName);
        return(c.getSuperclass().getName());
    }
    public void printClassMethods(String fullClassName) throws ClassNotFoundException {
        ReflectionUtil reflectionUtil = new ReflectionUtil();
        Class c = Class.forName(fullClassName);
        Method[] methods = c.getDeclaredMethods();
        for (Method method:methods) {
            System.out.println("Method Name: " + method.getName());
            System.out.println("Modifier: " + Modifier.toString(method.getModifiers()));
            System.out.println("Params: " + Arrays.toString(method.getParameters()));
            System.out.println("Return Types: " + method.getReturnType());
            System.out.println("");
        }
    }
    public void printClassFields(String fullClassName) throws ClassNotFoundException {
        ReflectionUtil reflectionUtil = new ReflectionUtil();
        Class c = Class.forName(fullClassName);
        Field[] fields = c.getDeclaredFields();
        for (Field field:fields) {
            System.out.println("Field Name: " + field.getName());
            System.out.println("Modifiers: " + Modifier.toString(field.getModifiers()));
            System.out.println("Type: " + field.getType());
            System.out.println();
        }
    }
    public void printClassConstructors(String fullClassName) throws ClassNotFoundException {
        ReflectionUtil reflectionUtil = new ReflectionUtil();
        Class c = Class.forName(fullClassName);
        Constructor[] constructors = c.getDeclaredConstructors();
        for (Constructor constructor:constructors) {
            System.out.println("Constructor Name: " + constructor.getName());
            System.out.println("Modifiers: " + Modifier.toString(constructor.getModifiers()));
            System.out.println("Params: " + Arrays.toString(constructor.getParameters()));
            System.out.println("");
        }
    }
    public Object createClassInstanceUsingDefaultConstructor(String fullClassName) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class c = Class.forName(fullClassName);
        return(c.getDeclaredConstructor().newInstance());
    }
}
