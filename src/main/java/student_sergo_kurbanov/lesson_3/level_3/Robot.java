package student_sergo_kurbanov.lesson_3.level_3;

class Robot {
    String name;

    public Robot() {
    }

    Robot(String robotName) {
        this.name = robotName;
    }

    public void sayHello() {
        System.out.println("Hello!");
    }

    public void sayYourName() {
        System.out.printf("\nMy name is %s!", name);
    }
}
