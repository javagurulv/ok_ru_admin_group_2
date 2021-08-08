package student_andrey_domas.lesson8.level5;

public class ReflectionUtilSandbox {
    public int i;
    private String str;

    ReflectionUtilSandbox() {}
    public ReflectionUtilSandbox(int i) {}
    private ReflectionUtilSandbox(int i, String str) {}

    public void test() {}
    private String testString() { return null; }
    protected int testInt() { return 0; }
    Object obj() { return null; }

    public static void main(String[] args) {
        var rUtils = new ReflectionUtil();
        try {
            rUtils.printClassMethods("student_andrey_domas.lesson8.level5.ReflectionUtilSandbox");
            rUtils.printClassFields("student_andrey_domas.lesson8.level5.ReflectionUtilSandbox");
            rUtils.printClassConstructors("student_andrey_domas.lesson8.level5.ReflectionUtilSandbox");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
