package student_andrey_tryapichnikov.lesson_3.level_7;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class ComputerDemo {

    public static void main(String[] args) {
        Computer dell = new Computer("Dell", "XXX-1");
        String manufacturer = dell.getManufacturer();
        String model = dell.getModel();
        System.out.println("Computer manufacturer = " + manufacturer);
        System.out.println("Computer model = " + model);
    }

}
