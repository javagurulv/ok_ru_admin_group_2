package student_sergo_kurbanov.lesson_3.level_7;

public class Product {
    private String name;
    private double regularPrice;
    private double discount;

    Product(String name) {
        this.name = name;
    }

    void setPrice(double regularPrice, double discount) {
        this.regularPrice = regularPrice;
        this.discount = discount;
    }

    double actualPrice() {
        return regularPrice - (regularPrice * discount) / 100;
    }

    void printInformation() {
        System.out.printf("\nProduct %s for %.2f$. Price by card %.2f (discount %.1f)", name, regularPrice, actualPrice(), discount);
    }
}
