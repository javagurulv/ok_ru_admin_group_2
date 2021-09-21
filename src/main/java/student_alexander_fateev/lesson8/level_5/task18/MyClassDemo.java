package student_alexander_fateev.lesson8.level_5.task18;

class MyClassDemo {
    public static void main(String[] args) throws ClassNotFoundException {
        MyClass test = new MyClass(10);

        Class demo1 = Class.forName("student_alexander_fateev.lesson8.level_5.task18.MyClass");

        Class demo2 = test.getClass();

        Class demo3 = MyClass.class;

        if (demo1.equals(demo2) && demo1.equals(demo3)) {
            System.out.println("All objects are equal!");
        }
        else {
            System.out.println("Something goes wrong");
        }
    }
}
