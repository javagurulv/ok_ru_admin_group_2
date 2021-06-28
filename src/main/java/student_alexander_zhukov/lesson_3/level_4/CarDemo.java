package student_alexander_zhukov.lesson_3.level_4;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class CarDemo {
    public static void main(String[] args) {
        Car myCar = new Car("Nissan");
        String carModel = myCar.getModel();
        System.out.println("Car model = " + carModel);
    }

}
