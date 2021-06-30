package student_andrey_tryapichnikov.lesson_3.level_7;

public class Product {
    private final String name;
    double regularPrice;
    double discount;

    public Product(String name) {
        this.name = name;
    }

    public double actualPrice() {
        return (100 - discount) * 0.01 * regularPrice;
    }

    public void printInformation() {
        var actualPriceCounted = actualPrice();
        System.out.printf("Product: %s\nFull price: %s\nDiscount: %s\nActual price: %s",
                this.name, this.regularPrice, this.discount, actualPriceCounted);
    }
}
