package student_alexey_krenev.lesson_8.level_5;



class ReflectionUtil {

    public String getClassAccessModifier(String fullClassName)  throws ClassNotFoundException {

        Class myClass = Class.forName(fullClassName);
        int mod = myClass.getModifiers();
        return java.lang.reflect.Modifier.toString(mod);

    }


}
