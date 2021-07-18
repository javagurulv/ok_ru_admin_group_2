package student_ilya_schanikov.lesson_3.level_1;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Robot {
    String name;
    public void sayHello() {
        System.out.println("Hello!");
    }

    public void sayYourName() {
        System.out.println("My name is " + this.name);
    }
    public Robot(String robotName) {
        this.name = robotName;
    }
}

class RobotDemo {
    public static void main(String[] args) {
        Robot Robby1 = new Robot("T-800");
        Robby1.sayHello();
        Robby1.sayYourName();

        Robot Robby2 = new Robot("T-1000");
        Robby2.sayHello();
        Robby2.sayYourName();

        Robot Robby3 = new Robot("Electronic");
        Robby3.sayHello();
        Robby3.sayYourName();
        }
    }
