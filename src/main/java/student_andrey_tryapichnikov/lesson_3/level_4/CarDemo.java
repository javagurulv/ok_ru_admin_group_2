package student_andrey_tryapichnikov.lesson_3.level_4;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class CarDemo {

    public static void main(String[] args) {
        Car myCar = new Car("Nissan");
        String carModel = myCar.getModel();
        System.out.println("Car model = " + carModel);
    }

}
