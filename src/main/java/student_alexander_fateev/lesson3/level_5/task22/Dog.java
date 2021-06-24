package student_alexander_fateev.lesson3.level_5.task22;

public class Dog {
    String dogName;
    String dogColor;
    int dogAge;

    Dog (String dogName, String dogColor, int dogAge) {
        this.dogName = dogName;
        this.dogColor = dogColor;
        this.dogAge = dogAge;
    }

    void voice() {
        System.out.println("Dog name is " + this.dogName);
        System.out.println("Dog color is " + this.dogColor);
        System.out.println("Dog age is " + this.dogAge);
    }

    void changeColor(String newColor) {
        this.dogColor = newColor;
    }
}
