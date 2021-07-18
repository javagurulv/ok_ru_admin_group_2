package student_andrey_tryapichnikov.lesson_3.level_7;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class ProductDemo {
    public static void main(String[] args) {
        var product = new Product("pen");
        product.regularPrice = 215.0;
        product.discount = 13.5;
        product.printInformation();
    }
}
