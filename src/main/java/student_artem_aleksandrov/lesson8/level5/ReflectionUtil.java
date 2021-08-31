package student_artem_aleksandrov.lesson8.level5;

import java.lang.reflect.*;

public class ReflectionUtil {


    public String getClassAccessModifier(String fullClassName) throws ClassNotFoundException {

        Class providedClass = Class.forName(fullClassName);

        return Modifier.toString(providedClass.getModifiers());
    }

    public String getSuperClassName(String fullClassName) throws ClassNotFoundException {

        Class providedClass = Class.forName(fullClassName);

        return providedClass.getSuperclass().getName();
    }

    public void printClassMethods(String fullClassName) throws ClassNotFoundException {
        // реализуйте этот метод
        Class providedClass = Class.forName(fullClassName);

        for (Method method: providedClass.getDeclaredMethods()) {
            method.getModifiers();
            /*
            Method Name: display
            Modifier: public
            Return Types: void
             */
            System.out.println(("" +
                    "Method Name: %s\n").formatted(method.getName()) +
                    "Modifier: %s\n".formatted(Modifier.toString(method.getModifiers())) +
                    "Return Types: %s\n".formatted(method.getReturnType()));
        }

    }

    public void printClassFields(String fullClassName) throws ClassNotFoundException {
        Class providedClass = Class.forName(fullClassName);

        for (Field field: providedClass.getDeclaredFields()) {
            System.out.println("" +
                    "Field Name: %s\n".formatted(field.getName()) +
                    "Modifier: %s\n".formatted(Modifier.toString(field.getModifiers())) +
                    "Type:%s\n".formatted(field.getType())
            );
        }
    }

    public void printClassConstructors(String fullClassName) throws ClassNotFoundException {
        Class providedClass = Class.forName(fullClassName);

        int count = 1;
        for (Constructor constructor: providedClass.getDeclaredConstructors()) {
            String parameterTypes = "";
            for (Class parameterType: constructor.getParameterTypes()) {
                parameterTypes += parameterType.getName();
            }
            System.out.println("" +
                    "Constructor %d\n".formatted(count) +
                    "Modifier: %s\n".formatted(Modifier.toString(constructor.getModifiers())) +
                    "Parameter Types: %s".formatted(parameterTypes)
            );
            count += 1;
        }

    }

    public Object createClassInstanceUsingDefaultConstructor(String fullClassName) throws ClassNotFoundException,
            NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

        Class providedClass = Class.forName(fullClassName);
        Constructor publicConstructor = null;
        
        for (Constructor constructor: providedClass.getDeclaredConstructors()) {
            if (Modifier.isPublic(constructor.getModifiers())) {
                publicConstructor = constructor;
                break;
            }
        }
        return publicConstructor.newInstance();

    }
}
