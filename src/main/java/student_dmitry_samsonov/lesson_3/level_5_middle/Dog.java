package student_dmitry_samsonov.lesson_3.level_5_middle;

public class Dog {
    private final String name;
    int age;
    String color;

    public Dog(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }
    void voice() {
        for (int i=0; i<3; i++) {
            System.out.println("Name: " + this.name + ", age: " + this.age + ", color: " + this.color);
        }
    }
    void happyBirthday() {
        this.age++;
    }
    void changeColor(String newColor) {
        this.color = newColor;
    }
    public String getName() {
        return this.name;
    }
    public String bark() {
        return "gav-gav-gav";
    }
}
