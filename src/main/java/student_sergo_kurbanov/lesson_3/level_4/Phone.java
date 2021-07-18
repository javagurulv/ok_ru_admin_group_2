package student_sergo_kurbanov.lesson_3.level_4;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Phone {
    String model;

    Phone(String bookTitle) {
        this.model = bookTitle;
    }

    String getModel() {
        return this.model;
    }
}
