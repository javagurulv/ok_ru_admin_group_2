package student_andrey_domas.lesson3.level7;

import teacher.codereview.CodeReview;
import teacher.codereview.CodeReviewComment;

@CodeReview(approved = true)
class Computer {

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }

    @CodeReviewComment(teacher = "Свойства класса лучше объявлять на самом верху.")
    String manufacturer;
    String model;

    Computer(String manufacturer, String model) {
        this.manufacturer = manufacturer;
        this.model = model;
    }

}
