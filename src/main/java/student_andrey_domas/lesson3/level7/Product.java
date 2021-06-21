package student_andrey_domas.lesson3.level7;

public class Product {
    private String name;
    double regularPrice;
    double discount;

    public Product(String name) {
        this.name = name;
    }

    /** Расчет актуальной стоимости с учетом скидки **/
    double actualPrice() {
        return regularPrice - (regularPrice / 100) * discount;
    }

    /** Вывод информации о продукте в консоль **/
    void printInformation() {
        System.out.println("regularPrice: $" + regularPrice);
        System.out.println("Discount: " + discount + "%");
        System.out.println("actualPrice: $" + actualPrice());
    }
}
