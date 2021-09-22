package student_alexander_fateev.lesson8.level_5_6.task19_24;

class DemoClassMain {
    public static void main(String[] args)
            throws ClassNotFoundException, InstantiationException, IllegalAccessException {

        ReflectionUtil test = new ReflectionUtil();

        test.printClassMethods("student_alexander_fateev.lesson8.level_5_6.task19_24.DemoClassPublic");
        test.printClassFields("student_alexander_fateev.lesson8.level_5_6.task19_24.DemoClassPublic");
        test.printClassConstructors("student_alexander_fateev.lesson8.level_5_6.task19_24.DemoClassPublic");
        test.createClassInstanceUsingDefaultConstructor("student_alexander_fateev.lesson8.level_5_6.task19_24.Dog");
    }
}
