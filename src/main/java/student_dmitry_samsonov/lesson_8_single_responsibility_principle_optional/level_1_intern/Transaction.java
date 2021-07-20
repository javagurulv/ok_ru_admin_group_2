package student_dmitry_samsonov.lesson_8_single_responsibility_principle_optional.level_1_intern;

class Transaction {

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
        return this.getTrader() + ", Amount: " + this.getAmount();
    }
}