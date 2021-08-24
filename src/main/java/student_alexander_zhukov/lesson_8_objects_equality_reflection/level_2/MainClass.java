package student_alexander_zhukov.lesson_8_objects_equality_reflection.level_2;

class A {
    public A() {
        System.out.println("Class A Constructor");
    }
}

class B extends A {
    public B() {
        System.out.println("Class B Constructor");
    }
}

class C extends B {
    public C() {
        System.out.println("Class C Constructor");
    }
}

public class MainClass {
    public static void main(String[] args) {
        C c = new C();
        // В дочерних классах сначала вызывается дефолтный конструктор родительского класса super()
    }
}
