package student_alexander_fateev.lesson3.level_1.task1_6;

public class Robot {
    String name;

    public Robot(String robotName) {
        this.name = robotName;
    }

    public void sayHello() {
        System.out.println("Hello");
    }

    public void sayYourName() {
        System.out.println("My name is " + this.name);
    }
}
