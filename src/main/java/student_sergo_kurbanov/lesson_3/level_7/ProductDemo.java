package student_sergo_kurbanov.lesson_3.level_7;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class ProductDemo {
    public static void main(String[] args) {
        Product product = new Product("slippers");
        product.setPrice(12.99, 20.2);
        product.printInformation();
    }
}
