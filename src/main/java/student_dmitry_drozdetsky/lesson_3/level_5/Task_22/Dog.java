package student_dmitry_drozdetsky.lesson_3.level_5.Task_22;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Dog {
    String dogName;
    int dogAge;
    String dogColor;

    Dog(String dogName, int dogAge, String dogColor) {
        this.dogName = dogName;
        this.dogAge = dogAge;
        this.dogColor = dogColor;
    }
    void voice() {
        System.out.println(this.dogName);
        System.out.println(this.dogAge);
        System.out.println(this.dogColor);
    }
    void changeColor(String newColor) {
        this.dogColor = newColor;
    }
}

class DogDemo {

    public static void main(String[] args) {

        Dog dog = new Dog("Sharik", 11, "Red");
        dog.voice();
        dog.changeColor("Yellow");
        dog.voice();
    }
}