package student_alexander_fateev.lesson8.level_5.task19_20;

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
}
