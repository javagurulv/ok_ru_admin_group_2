package student_alexander_fateev.lesson8.level_2.task12;

/*
Так как классы наследуются по цепочке A -> B -> C,
то сначала вызывается конструктор базового класса (А) и далее вниз по иерархии.
 */
public class MainClass {
    public static void main(String[] args) {
        C c = new C();
    }
}
