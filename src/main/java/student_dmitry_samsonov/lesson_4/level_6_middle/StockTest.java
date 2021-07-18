package student_dmitry_samsonov.lesson_4.level_6_middle;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class StockTest {
    public static void main(String[] args) {
        Stock google = new Stock("GOOG", 10);
        String priceInformation = google.getPriceInformation();
        System.out.println(priceInformation);

        google.updatePrice(15);
        google.updatePrice(7);
        google.updatePrice(14);

        priceInformation = google.getPriceInformation();
        System.out.println(priceInformation);
        StockTest.stockTest();
        StockTest.stock1Test();
        StockTest.stock2Test();
        StockTest.stock3Test();
        StockTest.stock4Test();
        StockTest.stock5Test();
    }

    static void stockTest(){
        int expectedMin = 5;
        int expectedMax = 99;
        Stock google = new Stock("GOOG", 10);
        google.updatePrice(12);
        google.updatePrice(5);
        google.updatePrice(7);
        google.updatePrice(99);
        google.updatePrice(77);
        if (google.getMinimalPrice() == expectedMin) {
            System.out.println("Test google min = OK");
        } else {
            System.out.println("Test google min = FAIL");
        }
        if (google.getMaximalPrice() == expectedMax) {
            System.out.println("Test google max = OK");
        } else {
            System.out.println("Test google max = FAIL");
        }
    }
    static void stock1Test(){
        int expectedMax = 999;
        Stock google = new Stock("GOOG", 999);
        if (google.getMaximalPrice() == expectedMax) {
            System.out.println("Test stock1 max = OK");
        } else {
            System.out.println("Test stock1 max = FAIL");
        }
    }
    static void stock2Test(){
        int expectedMax = 999;
        Stock google = new Stock("GOOG", 999);
        google.updatePrice(1);
        if (google.getMaximalPrice() == expectedMax) {
            System.out.println("Test stock2 max = OK");
        } else {
            System.out.println("Test stock2 max = FAIL");
        }
    }
    static void stock3Test(){
        int expectedMax = 1000;
        Stock google = new Stock("GOOG", 999);
        google.updatePrice(2);
        google.updatePrice(1000);
        if (google.getMaximalPrice() == expectedMax) {
            System.out.println("Test stock3 max = OK");
        } else {
            System.out.println("Test stock3 max = FAIL");
        }
    }
    static void stock4Test(){
        int expectedMax = 1000;
        Stock google = new Stock("GOOG", 999);
        google.updatePrice(2);
        google.updatePrice(1000);
        google.updatePrice(8);
        if (google.getMaximalPrice() == expectedMax) {
            System.out.println("Test stock4 max = OK");
        } else {
            System.out.println("Test stock4 max = FAIL");
        }
    }
    static void stock5Test(){
        int expectedMax = 27;
        Stock google = new Stock("GOOG", 9);
        google.updatePrice(27);
        if (google.getMaximalPrice() == expectedMax) {
            System.out.println("Test stock5 max = OK");
        } else {
            System.out.println("Test stock5 max = FAIL");
        }
    }
}
