package student_andrey_domas.lesson3.level5;

public class Dog {

    private String name;
    private String color;
    private int age;

    public Dog(String name) {
        this(name, 1, "green");
    }

    public Dog(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    void voice() {
        System.out.println("Name: " + name + ", age: " + age + ", color: " + color);
    }

    void happyBirthday() {
        age++;
    }

    void changeColor(String newColor) {
        this.color = newColor;
    }
}
