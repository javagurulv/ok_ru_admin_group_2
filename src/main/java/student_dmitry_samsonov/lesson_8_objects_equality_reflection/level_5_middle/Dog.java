package student_dmitry_samsonov.lesson_8_objects_equality_reflection.level_5_middle;

class Dog {
    public static void main(String[] args) throws ClassNotFoundException {
        Class c1 = Class.forName("student_dmitry_samsonov.lesson_8_objects_equality_reflection.level_5_middle.Dog");

        Dog dog = new Dog();
        Class c2 = dog.getClass();

        Class c3 = Dog.class;
        if (c1 == c2 && c2 == c3) {
            System.out.println("Success");
        }
    }
}
