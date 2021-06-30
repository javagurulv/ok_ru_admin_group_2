package student_andrey_domas.lesson4.level6;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class Stock {

    private String name;
    private int currentPrice;
    private int maxPrice;
    private int minPrice;

    public Stock(String name, int currentPrice) {
        this.name = name;
        this.currentPrice = currentPrice;
        this.maxPrice = currentPrice;
        this.minPrice = currentPrice;
    }

    void updatePrice(int currentPrice) {
        this.currentPrice = currentPrice;
        if (currentPrice > maxPrice)
            maxPrice = currentPrice;
        if (currentPrice < minPrice)
            minPrice = currentPrice;
    }

    String getPriceInformation() {
        return "Company = " + name +
                ", Current Price = " + currentPrice +
                ", Min Price = " + minPrice +
                ", Max Price = " + maxPrice;
    }
}
