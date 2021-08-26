package student_alexander_zhukov.lesson_8_objects_equality_reflection.level_5;

class ReflectionExample {
    public static void main(String[] args) {
        String str = new String();
        Class a;
        try {
            a = Class.forName("java.lang.String");
        } catch (ClassNotFoundException e) {
            a = null;
        }

        Class b = str.getClass();
        Class c = String.class;

        System.out.println(a.toString());
        System.out.println(b.toString());
        System.out.println(c.toString());

        System.out.println(a == b);
        System.out.println(b == c);

    }
}
