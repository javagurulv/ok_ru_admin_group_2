package student_artem_aleksandrov.lesson8.level2;

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

class MainClass {
    public static void main(String[] args) {
        C c = new C();
        // По цепочке запускаются конструкторы всех родительских классов. Super в данном случае не требуется,
        // так как в конструкторы не передаются параметры

    }
}