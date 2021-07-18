package student_sergo_kurbanov.lesson_3.level_5;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class DogDemo {
    public static void main(String[] args) {
        Dog dog = new Dog("The Ball");
        dog.speak();

        Dog dogAged = new Dog("Sharik", 4);
        dogAged.voice();

        Dog oldDog = new Dog("Polkan", 8);
        oldDog.voice();
        oldDog.happyBirthday();
        oldDog.voice();

        Dog colorDog = new Dog("Tuzik", 3, "Red");
        colorDog.voice();

        Dog mutantDog = new Dog("Mutant");
        mutantDog.voice();
        mutantDog.changeColor("green");
        mutantDog.voice();
    }
}
