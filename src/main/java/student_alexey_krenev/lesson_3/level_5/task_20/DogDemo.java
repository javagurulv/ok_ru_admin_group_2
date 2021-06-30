package student_alexey_krenev.lesson_3.level_5.task_20;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class DogDemo {
    public static void main(String[] args) {

        Dog myDog = new Dog("Sharik", 5);

        myDog.voice();

        System.out.println("Celebrate happy birthday " + myDog.dogName);
        myDog.happyBirthday();

        myDog.voice();
    }
}
