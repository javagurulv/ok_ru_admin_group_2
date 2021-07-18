package student_alexander_zhukov.lesson_4.level_6;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class StockTest {
    public static void main(String[] args) {
        StockTest stock = new StockTest();

        stock.testN1();
        stock.testMax1();
        stock.testMax2();
        stock.testMax3();
        stock.testMax4();
        stock.testMax5();
    }

    public void testN1() {
        Stock mail = new Stock("MAIL", 10);

        mail.updatePrice(12);
        mail.updatePrice(5);
        mail.updatePrice(7);
        mail.updatePrice(99);
        mail.updatePrice(77);

        testResult(mail.getMaxPrice() == 99 && mail.getMinPrice() == 5, "testN1");
    }

    public void testMax1() {
        Stock mail = new Stock("MAIL", 10);

        mail.updatePrice(999);

        testResult(mail.getMaxPrice() == 999, "testMax1");
    }

    public void testMax2() {
        Stock mail = new Stock("MAIL", 10);

        mail.updatePrice(999);
        mail.updatePrice(1);

        testResult(mail.getMaxPrice() == 999, "testMax2");
    }

    public void testMax3() {
        Stock mail = new Stock("MAIL", 10);

        mail.updatePrice(999);
        mail.updatePrice(2);
        mail.updatePrice(1000);

        testResult(mail.getMaxPrice() == 1000, "testMax3");
    }

    public void testMax4() {
        Stock mail = new Stock("MAIL", 10);

        mail.updatePrice(999);
        mail.updatePrice(2);
        mail.updatePrice(1000);
        mail.updatePrice(8);

        testResult(mail.getMaxPrice() == 1000, "testMax4");
    }

    public void testMax5() {
        Stock mail = new Stock("MAIL", 10);

        mail.updatePrice(9);
        mail.updatePrice(27);

        testResult(mail.getMaxPrice() == 27, "testMax5");
    }

    public void testResult(boolean result, String testName) {
        if (result) {
            System.out.println("Stock test - " + testName + " = OK");
        } else {
            System.out.println("Stock test - " + testName + " = FAIL");
        }
    }
}
