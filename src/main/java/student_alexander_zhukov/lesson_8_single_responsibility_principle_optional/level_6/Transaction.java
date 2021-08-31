package student_alexander_zhukov.lesson_8_single_responsibility_principle_optional.level_6;

class Transaction {

    private Trader trader;
    private int amount;

    Transaction(Trader trader, int amount) {
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
