package student_alexander_zhukov.lesson_3.level_4;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Phone {
    String model;

    Phone(String newModel) {
            this.model = newModel;
    }

    String getModel() {
            return this.model;
    }
}
