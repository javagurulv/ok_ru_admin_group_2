package student_alexander_fateev.lesson8.level_5_6.task19_24;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

class ReflectionUtil {
    public String getClassAccessModifier(String fullClassName) throws ClassNotFoundException {
        Class refDemo = Class.forName(fullClassName);
        return Modifier.toString(refDemo.getModifiers());
    }

    public String getSuperClassName(String fullClassName) throws ClassNotFoundException {
        Class refDemo = Class.forName(fullClassName);
        return refDemo.getSuperclass().getName();
    }

    public void printClassMethods(String fullClassName) throws ClassNotFoundException {
        Class refDemo = Class.forName(fullClassName);
        for (Method m: refDemo.getDeclaredMethods()) {
            System.out.println("Modifier: " + Modifier.toString(m.getModifiers()));
            System.out.println("Method Name: " + m.getName());
            System.out.println("Return Type: " + m.getReturnType());
            System.out.println("");
        }
    }

    public void printClassFields(String fullClassName) throws ClassNotFoundException {
        Class refDemo = Class.forName(fullClassName);
        for (Field f: refDemo.getDeclaredFields()) {
            System.out.println("Field Name: " + f.getName());
            System.out.println("Modifier: " + Modifier.toString(f.getModifiers()));
            System.out.println("Type: " + f.getType());
            System.out.println("");
        }
    }

    public void printClassConstructors(String fullClassName) throws ClassNotFoundException {
        Class refDemo = Class.forName(fullClassName);
        int counter = 1;
        for (Constructor c: refDemo.getDeclaredConstructors()) {
            System.out.println("Constructor" + counter);
            counter++;

            System.out.println("Modifier: " + Modifier.toString(c.getModifiers()));
            for (Class p : c.getParameterTypes()) {
                System.out.println("Parameter Types: " + p);
            }
            System.out.println("");
        }
    }

    public Object createClassInstanceUsingDefaultConstructor(String fullClassName)
            throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        Class refDemo = Class.forName(fullClassName);
        return refDemo.newInstance();
    }
}
