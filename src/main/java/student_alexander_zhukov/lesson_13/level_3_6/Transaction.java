package student_alexander_zhukov.lesson_13.level_3_6;

class Transaction {

    private student_alexander_zhukov.lesson_13.level_3_6.Trader trader;
    private int year;
    private int value;

    public Transaction(student_alexander_zhukov.lesson_13.level_3_6.Trader trader, int year, int value) {
        this.trader = trader;
        this.year = year;
        this.value = value;
    }

    public student_alexander_zhukov.lesson_13.level_3_6.Trader getTrader() {
        return this.trader;
    }

    public int getYear() {
        return this.year;
    }

    public int getValue() {
        return this.value;
    }

    public String toString() {
        return "{" + this.trader + ", " +
                "year: "+this.year+", " +
                "value:" + this.value +"}";
    }
}
