package student_andrey_tryapichnikov.lesson_4.level_6;

public class StockTest {
    public static void main(String[] args) {
        var name = "GOOG";
        var initialValue = 15;
        int[] values = {18, 30, 4, 150, 999};
        testStock(name, initialValue, values);
    }

    static void testStock(String name, int initialValue, int[] values) {
        var company = new Stock(name, initialValue);
        String info = company.getPriceInformation();
        System.out.println(info);
        for (int v: values) {
            company.updateValue(v);
            String updatedInfo = company.getPriceInformation();
            System.out.println(updatedInfo);
        }
    }
}
