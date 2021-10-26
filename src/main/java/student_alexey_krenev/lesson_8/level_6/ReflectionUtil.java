package student_alexey_krenev.lesson_8.level_6;


import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

class ReflectionUtil {

    public String getClassAccessModifier(String fullClassName)  throws ClassNotFoundException {

        Class myClass = Class.forName(fullClassName);
        int mod = myClass.getModifiers();
        return java.lang.reflect.Modifier.toString(mod);
    }


    public void printClassMethods(String fullClassName) throws ClassNotFoundException {

        Class myClass = Class.forName(fullClassName);

        for (Method i: myClass.getDeclaredMethods()) {
            System.out.println("Modifier: " + Modifier.toString(i.getModifiers()));
            System.out.println("Method Name: " + i.getName());
            System.out.println("Return Type: " + i.getReturnType());
            System.out.println("");
        }
    }

    public void printClassFields(String fullClassName) throws ClassNotFoundException {
        Class myClass = Class.forName(fullClassName);
        for (Field i: myClass.getDeclaredFields()) {
            System.out.println("Field Name: " + i.getName());
            System.out.println("Modifier: " + Modifier.toString(i.getModifiers()));
            System.out.println("Type: " + i.getType());
            System.out.println("");
        }
    }

}
