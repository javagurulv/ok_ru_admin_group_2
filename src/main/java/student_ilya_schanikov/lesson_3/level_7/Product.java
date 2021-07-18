package student_ilya_schanikov.lesson_3.level_7;

import java.util.Scanner;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Product {
    String name;
    double regularPrice;
    double discount;

    public Product(String productName) {
        this.name = productName;
        System.out.println("Please, enter " + this.name + " regular price:");
        Scanner newRegularPrice = new Scanner(System.in);
        this.regularPrice = newRegularPrice.nextDouble() ;
        System.out.println("Please, enter " + this.name + " discount:");
        Scanner newDiscount = new Scanner(System.in);
        this.discount = newDiscount.nextDouble();
    }

    void printInformation() {
        double actualPrice;
        System.out.println("Product name: " + this.name);
        System.out.println("Regular price: " + this.regularPrice);
        System.out.println("Discount: " + this.discount);
        actualPrice = this.regularPrice - (this.regularPrice * ( this.discount / 100 ));
        System.out.println("Discount price: " + actualPrice);
    }
}

class ProductDemo {
    public static void main(String[] args) {
        Product product1 = new Product("Sausage");
        product1.printInformation();

        Product product2 = new Product("Cheese");
        product2.printInformation();

        }
    }
