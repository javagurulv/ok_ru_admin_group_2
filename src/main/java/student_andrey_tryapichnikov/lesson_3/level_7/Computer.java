package student_andrey_tryapichnikov.lesson_3.level_7;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class Computer {

    String manufacturer;
    String model;

    Computer(String manufacturer, String model) {
        this.manufacturer = manufacturer;
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }
}
