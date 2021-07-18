package student_sergo_kurbanov.lesson_3.level_7;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class Computer {

    String manufacturer;
    String model;

    Computer(String manufacturer, String model) {
        this.manufacturer = manufacturer;
        this.model = model;
    }

    String getManufacturer() {
        return manufacturer;
    }

    String getModel() {
        return model;
    }
}
