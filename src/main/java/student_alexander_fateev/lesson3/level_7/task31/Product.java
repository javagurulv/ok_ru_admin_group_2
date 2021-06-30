package student_alexander_fateev.lesson3.level_7.task31;

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
        return this.regularPrice - ((this.regularPrice/100)*this.discount);
    }

    void printInformation() {
        System.out.println("Product: " + this.name);
        System.out.println("Regular price: " + this.regularPrice);
        System.out.println("Discount: " + this.discount);
    }
}
