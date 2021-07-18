package student_andrey_tryapichnikov.lesson_3.level_3;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class Robot {
    String name;
    String color;

    public Robot(String name, String color) {
        this.name = name;
        this.color = color;
    }

    static String colorize(String text, String color) {
        return String.format("\033[38;5;%sm%s\033[39m", color, text);
    }

    public void sayHello() {
        var hello = colorize("Hello", this.color);
        System.out.println(hello);
    }

    public void sayYourName() {
        var introduction = colorize("My name is %s\n", this.color);
        System.out.printf(introduction, this.name);
    }
}
