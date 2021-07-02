package student_alexander_fateev.lesson4.level_6.task17;

import student_dmitry_drozdetsky.lesson_2.level_5.PrintText;

class StockTest {
    public static void main(String[] args) {

        //Scenario 1: Изменение цены акции: 999  = Максимальная цена за указанный период: 999
        Stock testStock1 = new Stock("TestCompany", 999);

        if (testStock1.getMaxPrice() == 999) {
            System.out.println("Scenario 1: OK");
        }
        else {
            System.out.println("Scenario 1: FAIL");
        }

        //Scenario 2: Изменение цены акции: 999 -> 1  = Максимальная цена за указанный период: 999
        Stock testStock2 = new Stock("TestCompany", 999);
        testStock2.updatePrice(1);

        if (testStock2.getMaxPrice() == 999) {
            System.out.println("Scenario 2: OK");
        }
        else {
            System.out.println("Scenario 2: FAIL");
        }

        //Scenario 3: Изменение цены акции: 999 -> 2 -> 1000 = Максимальная цена за указанный период: 1000
        Stock testStock3 = new Stock("TestCompany", 999);
        testStock3.updatePrice(2);
        testStock3.updatePrice(1000);

        if (testStock3.getMaxPrice() == 1000) {
            System.out.println("Scenario 3: OK");
        }
        else {
            System.out.println("Scenario 3: FAIL");
        }

        //Scenario 4: Изменение цены акции: 999 -> 2 -> 1000 -> 8 = Максимальная цена за указанный период: 1000
        Stock testStock4 = new Stock("TestCompany", 999);
        testStock4.updatePrice(2);
        testStock4.updatePrice(1000);
        testStock4.updatePrice(8);

        if (testStock4.getMaxPrice() == 1000) {
            System.out.println("Scenario 4: OK");
        }
        else {
            System.out.println("Scenario 4: FAIL");
        }

        //Scenario 5: Изменение цены акции: 9 -> 27 = Максимальная цена за указанный период: 27
        Stock testStock5 = new Stock("TestCompany", 9);
        testStock5.updatePrice(27);

        if (testStock5.getMaxPrice() == 27) {
            System.out.println("Scenario 5: OK");
        }
        else {
            System.out.println("Scenario 5: FAIL");
        }
    }
}
