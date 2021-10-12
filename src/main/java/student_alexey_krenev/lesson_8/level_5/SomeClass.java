package student_alexey_krenev.lesson_8.level_5;

class SomeClass {

    public static void main(String[] args) throws ClassNotFoundException {

        String str = new String();

        Class a = Class.forName("java.lang.String");

        System.out.println(a);

        Class b = str.getClass();

        System.out.println(b);

        Class c = String.class;

        System.out.println(c);


        if (a.equals(b) && b.equals(c)) {
            System.out.println("ok");
        }
    }

}
