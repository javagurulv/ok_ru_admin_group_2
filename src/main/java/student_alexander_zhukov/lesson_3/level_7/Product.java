package student_alexander_zhukov.lesson_3.level_7;

class Product {
    String name;
    double regularPrice;
    double discount;

    Product(String name) {
        this.name = name;
    }
    void setRegularPrice(double price) {
        this.regularPrice = price;
    }
    void setDiscount(double discount) {
        this.discount = discount;
    }
    public double actualPrice() {
        return this.regularPrice - this.discount;
    }
    public void printInformation() {
        System.out.println("Product Name: " + this.name);
        System.out.println("Product Regular Price: " + this.regularPrice);
        System.out.println("Product Discount: " + this.discount);
        System.out.println("Product Actual Price: " + this.actualPrice());
        System.out.println(" ");
    }
}
