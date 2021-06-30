package student_andrey_domas.lesson3.level7;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class ProductDemo {
    public static void main(String[] args) {
        Product p1 = new Product("AK-74");
        p1.regularPrice = 1300;
        p1.discount = 15;
        p1.printInformation();
    }
}
