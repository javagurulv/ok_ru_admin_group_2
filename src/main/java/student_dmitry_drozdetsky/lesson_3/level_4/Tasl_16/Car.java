package student_dmitry_drozdetsky.lesson_3.level_4.Tasl_16;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Car {
    String model;

    Car(String newModel) {
        this.model = newModel;
    }

    public String getModel() {
        return this.model;
    }

}

class CarDemo {

    public static void main(String[] args) {
        Car myCar = new Car("Nissan");
        String carModel = myCar.getModel();
        System.out.println("Car model = " + carModel);
    }

}