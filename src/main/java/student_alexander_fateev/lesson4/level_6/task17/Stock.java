package student_alexander_fateev.lesson4.level_6.task17;

class Stock {
    private String companyName;
    private int currentPrice, minPrice, maxPrice;

    Stock(String companyName, int currentPrice) {
        this.companyName = companyName;
        this.currentPrice = currentPrice;
        minPrice = currentPrice;
        maxPrice = currentPrice;
    }

    void updatePrice(int newPrice) {
        currentPrice = newPrice;

        if (currentPrice < minPrice) {
            minPrice = currentPrice;
        }
        else if (currentPrice > maxPrice) {
            maxPrice = currentPrice;
        }
    }

    String getPriceInformation() {
        String stockInfo =  companyName +
                            ", Current Price = " + currentPrice +
                            ", Min Price = " + minPrice +
                            ", Max Price = " + maxPrice;
        return stockInfo;
    }

    int getMaxPrice () {
        return maxPrice;
    }
}
