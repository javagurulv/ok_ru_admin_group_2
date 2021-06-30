package student_andrey_domas.lesson3.level5;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class DogDemo {
    public static void main(String[] args) {
        Dog putinDog = new Dog("Klutin");

        putinDog.voice();
        putinDog.happyBirthday();
        putinDog.voice();

        putinDog.changeColor("red");
        putinDog.voice();
    }
}
