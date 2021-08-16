package student_dmitry_samsonov.lesson_8_single_responsibility_principle_optional.level_1_intern;

class Transaction {

    private final Trader trader;
    private final int amount;

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

    @Override
    public String toString() {
        return this.getTrader() + ", Amount: " + this.getAmount();
    }
}