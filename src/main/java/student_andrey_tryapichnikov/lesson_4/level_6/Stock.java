package student_andrey_tryapichnikov.lesson_4.level_6;

public class Stock {
    final String companyName;
    int currentValue;
    int minValue;
    int maxValue;

    Stock(String name, int value) {
        this.companyName = name;
        this.currentValue = value;
        this.minValue = value;
        this.maxValue = value;
    }

    void updateValue(int value) {
        this.currentValue = value;
        if (this.minValue > value) this.minValue = value;
        if (this.maxValue < value) this.maxValue = value;
    }

    String getPriceInformation() {
        return "Company = \"%s\", Current Price = %s, Min Price = %s, Max Price = %s".formatted(this.companyName, this.currentValue, this.minValue, this.maxValue);
    }
}
