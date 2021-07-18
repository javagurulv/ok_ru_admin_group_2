package student_dmitry_drozdetsky.lesson_3.level_5.Task_19;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Dog {
    String dogName;
    int dogAge;

    Dog(String dogName, int dogAge) {
        this.dogName = dogName;
        this.dogAge = dogAge;
    }
    void voice() {
        System.out.println(this.dogName);
        System.out.println(this.dogAge);
    }
}

class DogDemo {

    public static void main(String[] args) {

        Dog dog = new Dog("Sharik", 11);

        dog.voice();
    }
}
