package student_alexey_krenev.lesson_3.level_5.task_20;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class Dog {
    String dogName;
    int dogAge;

    Dog(String dogName, int dogAge){
        this.dogAge = dogAge;
        this.dogName = dogName;
    }

    void voice(){
        System.out.println("Dog Name " + this.dogName);
        System.out.println("Dog age " + this.dogAge);
    }

    void happyBirthday(){
        this.dogAge = this.dogAge + 1;
    }


}
