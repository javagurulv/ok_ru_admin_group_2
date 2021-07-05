package student_artem_aleksandrov.lesson3;

public class Robot {
    private String name;

    public Robot() {
    }

    public Robot(String robotName) {
        this.name = robotName;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void sayHello() {
        System.out.println("Hello!");
    }

    public void sayYourName(){
        System.out.println("My name is %s".formatted(this.name));
    }

}
