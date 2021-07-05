package student_artem_aleksandrov.lesson3;

public class Dog {
    private String name;
    int age = -1;

    String color;

    public Dog(String name) {
        this.name = name;
    }
    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return this.color;
    }

    void changeColor(String newColor) {
        this.color = newColor;
    }
    void happyBirthday() {
        this.age = age + 1;
    }

    public void voice() {
        for (int i = 0; i < 3; i++) {
            if (this.age >= 0) {
                System.out.println(this.name + " " + this.age + " Color: " + this.color);
            }
            else {
                System.out.println(this.name);
            }
        }
    }
}