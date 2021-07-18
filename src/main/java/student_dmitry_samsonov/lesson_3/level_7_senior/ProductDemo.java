package student_dmitry_samsonov.lesson_3.level_7_senior;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class ProductDemo {
    public static void main(String[] args) {
        Product product = new Product("Milk");
        product.regularPrice = 0.95;
        product.discount = 30.0;
        System.out.println("Product: " + product.name + ", price: " + product.regularPrice);
        System.out.println("Discount: " + product.discount + "%, price with discount: " + product.actualPrice());
    }
}
