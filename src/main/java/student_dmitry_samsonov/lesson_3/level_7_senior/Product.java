package student_dmitry_samsonov.lesson_3.level_7_senior;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Product {
    String name;
    double regularPrice;
    double discount;
    Product(String name) {
        this.name = name;
    }
    double actualPrice() {
        double calculatedDiscount = this.regularPrice * (this.discount / 100);
        return this.regularPrice - calculatedDiscount;
    }
    void printInformation() {

    }

}
