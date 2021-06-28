package student_alexander_fateev.lesson3.level_5.task20;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class DogDemo {
    public static void main(String[] args) {
        Dog myDog = new Dog("Dobby", 5);
        myDog.voice();
        myDog.happyBirthday();
        myDog.voice();
    }
}
