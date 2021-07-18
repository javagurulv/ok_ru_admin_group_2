package student_alexander_fateev.lesson4.level_6.task17;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class StockDemo {
    public static void main(String[] args) {
        Stock mrg = new Stock("MailRU Group", 100);
        System.out.println(mrg.getPriceInformation());

        //Set of price changes
        mrg.updatePrice(92);
        mrg.updatePrice(77);
        mrg.updatePrice(115);
        mrg.updatePrice(105);

        System.out.println(mrg.getPriceInformation());
    }
}
