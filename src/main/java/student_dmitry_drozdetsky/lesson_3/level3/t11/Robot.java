package student_dmitry_drozdetsky.lesson_3.level3.t11;

public class Robot {
    private String name;

    Robot(String name) {
        this.name = name;
    }

    public void sayHello() {
        System.out.println("Hello!");
    }

    public void sayYourName() {
        System.out.println("My name is " + this.name);
    }
}
