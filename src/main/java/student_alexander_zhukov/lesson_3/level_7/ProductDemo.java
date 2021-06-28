package student_alexander_zhukov.lesson_3.level_7;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class ProductDemo {
    public static void main(String[] args) {
        Product myProduct = new Product("Piano");

        myProduct.setRegularPrice(543.7);
        myProduct.setDiscount(34.6);

        myProduct.printInformation();

        Product productHat = new Product("Hat");

        productHat.setRegularPrice(12.4);
        productHat.setDiscount(1.8);

        productHat.printInformation();
    }
}
