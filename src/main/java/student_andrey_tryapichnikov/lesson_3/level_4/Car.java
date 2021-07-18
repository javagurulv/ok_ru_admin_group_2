package student_andrey_tryapichnikov.lesson_3.level_4;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class Car {
    String model;

    public Car (String newModel) {
        this.model = newModel;
    }

    public String getModel() {
        return this.model;
    }

}
