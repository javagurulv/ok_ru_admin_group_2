package student_andrey_tryapichnikov.lesson_3.level_5;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class DogDemo {
    public static void main(String[] args) {
        var dogName = "Fido";
        var dogColor = "Green";
        var dogAge = 3;
        var dog = new Dog(dogName, dogColor, dogAge);
        dog.voice();
        dog.happyBirthday();
        dog.voice();
        dog.changeColor("Orange");
        dog.voice();
    }
}
