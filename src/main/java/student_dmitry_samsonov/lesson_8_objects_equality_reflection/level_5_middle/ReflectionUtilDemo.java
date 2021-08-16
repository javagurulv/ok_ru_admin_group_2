package student_dmitry_samsonov.lesson_8_objects_equality_reflection.level_5_middle;

class ReflectionUtilDemo {
    public static void main(String[] args) throws ClassNotFoundException {
        ReflectionUtil reflectionUtil = new ReflectionUtil();
        reflectionUtil.printClassMethods("student_dmitry_samsonov.lesson_8_objects_equality_reflection.level_5_middle.ReflectionUtil");
        reflectionUtil.printClassFields("student_dmitry_samsonov.lesson_8_objects_equality_reflection.level_5_middle.ReflectionUtil");
        reflectionUtil.printClassConstructors("student_dmitry_samsonov.lesson_8_objects_equality_reflection.level_5_middle.ReflectionUtil");
    }
}
