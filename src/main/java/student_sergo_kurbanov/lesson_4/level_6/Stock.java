package student_sergo_kurbanov.lesson_4.level_6;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Stock {
    String companyName;
    int currentPrice;
    int minPrice;
    int maxPrice;

    public Stock(String companyName, int currentPrice) {
        this.companyName = companyName;
        this.currentPrice = currentPrice;
        this.minPrice = currentPrice;
        this.maxPrice = currentPrice;
    }

    public void updatePrice(int newPrice) {
        this.currentPrice = newPrice;
        if (this.maxPrice < newPrice) {
            this.maxPrice = newPrice;
            return;
        }
        this.minPrice = newPrice;
    }

    public String getPriceInformation() {
        String result = "Company = " + companyName;
        result += ", Current Price = " + currentPrice;
        result += ", Min Price = " + minPrice;
        result += ", Max Price = " + maxPrice;
        return result;
    }

    public int getMinPrice() {
        return minPrice;
    }

    public int getMaxPrice() {
        return maxPrice;
    }
}
