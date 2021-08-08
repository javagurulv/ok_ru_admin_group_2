package student_andrey_domas.lesson8.level5;

import student_dmitry_samsonov.lesson_5.level_2_intern.Array;

import java.lang.reflect.*;
import java.util.Arrays;
import java.util.stream.Stream;

public class ReflectionUtil {

    private String modifiers2String(int mod) {
        if (Modifier.isPublic(mod))
            return "public";
        else if (Modifier.isPrivate(mod))
            return "private";
        else if (Modifier.isProtected(mod))
            return "protected";
        else
            return null;
    }

    private String modifiers2String(Member member) {
        int mod = member.getModifiers();
        return modifiers2String(mod);
    }

    private String modifiers2String(Class cls) {
        int mod = cls.getModifiers();
        return modifiers2String(mod);
    }

    public String getClassAccessModifier(String fullClassName) throws ClassNotFoundException {
        Class cls = Class.forName(fullClassName);
        return modifiers2String(cls);
    }

    public String getSuperClassName(String fullClassName) throws ClassNotFoundException {
        Class cls = Class.forName(fullClassName);
        return cls.getSuperclass().getName();
    }

    public void printClassMethods(String fullClassName) throws ClassNotFoundException {
        Class cls = Class.forName(fullClassName);
        for (Method m: cls.getDeclaredMethods()) {
            System.out.println("Method Name: " + m.getName());
            System.out.println("Modifier: " + modifiers2String(m));
            System.out.println("Return Types: " + m.getReturnType().getName() + "\n");
        }
    }

    public void printClassFields(String fullClassName) throws ClassNotFoundException {
        Class cls = Class.forName(fullClassName);
        for (Field f: cls.getDeclaredFields()) {
            System.out.println("Field Name: " + f.getName());
            System.out.println("Modifier: " + modifiers2String(f));
            System.out.println("Return Types: " + f.getType().getName() + "\n");
        }
    }

    public void printClassConstructors(String fullClassName) throws ClassNotFoundException {
        Class cls = Class.forName(fullClassName);
        Constructor[] ctors = cls.getDeclaredConstructors();

        for (int i = 0; i < ctors.length; i++) {
            Constructor ctor = ctors[i];
            System.out.println("Constructor " + (i + 1));
            System.out.println("Modifier: " + modifiers2String(ctor));
            String[] types = Arrays.stream(ctor.getParameterTypes()).map(Class::getName).toArray(String[]::new);
            System.out.println("Parameter Types: " + String.join(", ", types) + "\n");
        }
    }

    public Object createClassInstanceUsingDefaultConstructor(String fullClassName) throws ClassNotFoundException,
            NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class cls = Class.forName(fullClassName);
        return cls.getDeclaredConstructor().newInstance();
    }

}
