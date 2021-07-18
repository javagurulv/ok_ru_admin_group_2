package student_dmitry_samsonov.lesson_3.level_5_middle;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class DogDemo {
    public static void main(String[] args) {
        Dog dog = new Dog("Sharik", 5, "Red");
        dog.voice();
        dog.happyBirthday();
        dog.changeColor("Gray");
        dog.voice();
    }
}
