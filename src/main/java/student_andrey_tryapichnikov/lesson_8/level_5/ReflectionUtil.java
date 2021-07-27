package student_andrey_tryapichnikov.lesson_8.level_5;

import java.lang.reflect.Modifier;

class ReflectionUtil {
    public String getClassAccessModifier(String fullClassName) {
        try {
            var reflectedClass = Class.forName(fullClassName);
            var modifiers = reflectedClass.getModifiers();
            return Modifier.toString(modifiers);
        } catch (ClassNotFoundException e) {
            return e.toString();
        }
    }

    public String getSuperClassName(String fullClassName) {
        try {
            var reflectedClass = Class.forName(fullClassName);
            var superclassName = reflectedClass.getSuperclass();
            return superclassName.getName();
        } catch (ClassNotFoundException e) {
            return e.toString();
        }
    }
}
