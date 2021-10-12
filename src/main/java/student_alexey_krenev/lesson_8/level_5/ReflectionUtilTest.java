package student_alexey_krenev.lesson_8.level_5;



class ReflectionUtilTest {

    public static void main(String[] args) throws ClassNotFoundException {

        ReflectionUtilTest reflectionUtilTest = new ReflectionUtilTest();


        reflectionUtilTest.getClassAccessModifierTest("java.lang.String");

    }

    void getClassAccessModifierTest(String className) throws ClassNotFoundException {
        ReflectionUtil reflectionUtil = new ReflectionUtil();

        String str = reflectionUtil.getClassAccessModifier(className);

        if (str.equals("public final")){
            System.out.println("getClassAccessModifierTest ok");
        }
    }

}
