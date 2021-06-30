package student_alexey_krenev.lesson_3.level_7;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class LaptopDemo {
    public static void main(String[] args) {

        Laptop newLaptop = new Laptop("Lenovo", 16, 2018);

        System.out.println("Device Name " + newLaptop.deviceName);
        System.out.println("Total ram gb " + newLaptop.ramTotal);
        System.out.println("Year of issue " + newLaptop.yearOfIssue);
    }


}
