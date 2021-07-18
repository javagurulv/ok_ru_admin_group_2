package student_alexander_fateev.lesson4.level_6.task17;

import teacher.codereview.CodeReview;
import teacher.codereview.CodeReviewComment;

@CodeReview(approved = true)
class Stock {
    private String companyName;

    @CodeReviewComment(teacher = "Лучше каждое свойство объявлять в новой строке. "
			+ "Так читать и воспринимать код будет легче.")
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
