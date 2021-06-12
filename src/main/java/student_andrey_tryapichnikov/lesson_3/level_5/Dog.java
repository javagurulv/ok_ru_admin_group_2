package student_andrey_tryapichnikov.lesson_3.level_5;

public class Dog {
    private final String name;
    private int age;
    private String color;

    public Dog(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public void happyBirthday() {
        this.age += 1;
    }

    public void changeColor(String newColor) {
        this.color = newColor;
    }

    public void voice() {
        System.out.printf("%s, %s, %s years old\n", this.name, this.color, this.age);
    }

    public void voice18() {
        int BARK_COUNT = 3;
        for (int a = 0; a < BARK_COUNT; a++) System.out.println(this.name);
    }
}
