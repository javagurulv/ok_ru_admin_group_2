package student_alexander_fateev.lesson8.level_5.task19_20;

class ReflectionUtilTest {
    public static void main(String[] args) throws ClassNotFoundException {
        ReflectionUtilTest test = new ReflectionUtilTest();
        test.testPublic();
        test.testDefault();
        test.testSuper();
    }

    void testPublic () throws ClassNotFoundException {
        String expectedResult = "public";

        ReflectionUtil test = new ReflectionUtil();
        String result = test.getClassAccessModifier("student_alexander_fateev.lesson8.level_5.task19_20.DemoClassPublic");

        if (result.equals(expectedResult)) {
            System.out.println("Public modifier: OK");
        }
        else {
            System.out.println("Public modifier: FAIL");
        }
    }

    void testDefault() throws ClassNotFoundException {
        String expectedResult = "";

        ReflectionUtil test = new ReflectionUtil();
        String result = test.getClassAccessModifier("student_alexander_fateev.lesson8.level_5.task19_20.DemoClassDefault");

        if (result.equals(expectedResult)) {
            System.out.println("Default modifier: OK");
        }
        else {
            System.out.println("Default modifier: FAIL");
        }
    }

    void testSuper() throws ClassNotFoundException {
        String expectedResult = "student_alexander_fateev.lesson8.level_5.task19_20.DemoClassParent";

        ReflectionUtil test = new ReflectionUtil();
        String result = test.getSuperClassName("student_alexander_fateev.lesson8.level_5.task19_20.DemoClassChild");

        if (result.equals(expectedResult)) {
            System.out.println("Get parent class: OK");
        }
        else {
            System.out.println("Get parent: FAIL");
        }
    }
}
