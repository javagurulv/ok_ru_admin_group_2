package student_alexey_krenev.lesson_4.level_6;

class StockTest {
    public static void main(String[] args) {
        Stock stock = new Stock("GOOG", 10);

        System.out.println(stock.getPriceInformation());

        int[] testDataArray = {12, 5, 7, 99, 77};

        for (int i: testDataArray) {
            stock.updatePrice(i);
        }

        System.out.println(stock.getPriceInformation());
    }
}
