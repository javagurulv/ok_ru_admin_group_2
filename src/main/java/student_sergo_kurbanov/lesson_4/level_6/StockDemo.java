package student_sergo_kurbanov.lesson_4.level_6;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class StockDemo {
    public static void main(String[] args) {
        Stock google = new Stock("Odnoklassniki", 23);
        String priceInformation = google.getPriceInformation();
        System.out.println(priceInformation);

        google.updatePrice(25);
        google.updatePrice(36);
        google.updatePrice(17);

        priceInformation = google.getPriceInformation();
        System.out.println(priceInformation);
    }
}
