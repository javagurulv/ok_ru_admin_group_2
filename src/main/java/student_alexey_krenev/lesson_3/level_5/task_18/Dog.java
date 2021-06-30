package student_alexey_krenev.lesson_3.level_5.task_18;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Dog {
    String dogName;

    public Dog(String dogName) {
        this.dogName = dogName;
    }


    void voice(){
        System.out.println(this.dogName);
        System.out.println(this.dogName);
        System.out.println(this.dogName);
    }


}
