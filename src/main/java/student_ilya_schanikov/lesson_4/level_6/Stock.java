package student_ilya_schanikov.lesson_4.level_6;

import java.util.Scanner;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Stock {
    String stockName;
    int currentPrice;
    int minPrice;
    int maxPrice;

    public Stock(String newStockName, int newCurrentPrice) {
        this.stockName = newStockName;
        this.currentPrice = newCurrentPrice;
        this.minPrice = this.currentPrice;
        this.maxPrice = this.currentPrice;

    }

    void updatePrice(int updatedPrice) {
        this.currentPrice = updatedPrice;
        if (updatedPrice >= this.maxPrice) {
            this.maxPrice = updatedPrice;
        } else if (updatedPrice <= this.minPrice) {
            this.minPrice = updatedPrice;
        }
    }

    void getPriceInformation() {
        System.out.println("Company = " + this.stockName + ", Current Price = " + this.currentPrice + ", Min Price = " + this.minPrice + ", Max Price = " + this.maxPrice);
    }

}

class StockTest {
    public static void main(String[] args) {
        Stock stock1 = new Stock("GOOG", 10);
        stock1.getPriceInformation();
        stock1.updatePrice(12);
        stock1.updatePrice(12);
        stock1.updatePrice(5);
        stock1.updatePrice(7);
        stock1.updatePrice(99);
        stock1.updatePrice(77);
        stock1.getPriceInformation();
    }
}
