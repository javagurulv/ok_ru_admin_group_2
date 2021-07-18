package student_alexander_zhukov.lesson_4.level_6;

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
        if (newPrice >= this.maxPrice) {
            this.maxPrice = newPrice;
        }
        else if (newPrice <= this.minPrice) {
            this.minPrice = newPrice;
        }
    }

    public String getPriceInformation() {
        String result = "Company = " + this.companyName + ", ";
        result = result + "Current Price = " + this.currentPrice + ", ";
        result = result + "Min Price = " + this.minPrice + ", ";
        result = result + "Max Price = " + this.maxPrice;
        return result;
    }

    public int getMinPrice() {
        return minPrice;
    }

    public int getMaxPrice() {
        return maxPrice;
    }
}
