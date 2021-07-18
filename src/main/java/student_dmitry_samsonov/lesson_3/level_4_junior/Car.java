package student_dmitry_samsonov.lesson_3.level_4_junior;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Car {

    String model;

    Car(String newModel) {
        this.model = newModel;
    }

    String getModel() {
        return this.model;
    }

}
