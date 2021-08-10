package student_andrey_domas.lesson_8_single_responsibility_principle_optional;

public class Transaction {

    private Trader trader;
    private int amount;

    public Transaction(Trader trader, int amount) {
        this.trader = trader;
        this.amount = amount;
    }

    public Trader getTrader() {
        return trader;
    }

    public int getAmount() {
        return amount;
    }

    public String toString() {
        return "Transaction: " + trader + ", " + amount;
    }
}