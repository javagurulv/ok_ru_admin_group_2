package student_dmitry_samsonov.lesson_4.level_6_middle;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Stock {
    String name;
    private int price;
    private int minimalPrice;
    private int maximalPrice;
    Stock(String name, int price) {
        this.name = name;
        this.price = price;
        this.minimalPrice = price;
        this.maximalPrice = price;
    }
    void updatePrice(int price) {
        if (price > this.maximalPrice) {
            this.maximalPrice = price;
        }
        if (price < this.minimalPrice) {
            this.minimalPrice = price;
        }
        this.price = price;
    }
    String getPriceInformation() {
        String infoName = "Company = " + this.name;
        String infoPrice = "Current Price = " + this.price;
        String infoMinPrice = "Min Price = " + this.minimalPrice;
        String infoMaxPrice = "Max Price = " + this.maximalPrice;
        String info = infoName + ", " + infoPrice + ", " + infoMinPrice + ", " + infoMaxPrice;
        return info;
    }
    int getMinimalPrice() {
        return this.minimalPrice;
    }
    int getMaximalPrice() {
        return this.maximalPrice;
    }
}
