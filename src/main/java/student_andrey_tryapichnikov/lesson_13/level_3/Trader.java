package student_andrey_tryapichnikov.lesson_13.level_3;

import java.util.Objects;

public class Trader {
    private String name;
    private String city;

    public Trader(String name, String city) {
        this.name = name;
        this.city = city;
    }

    public String getName() {
        return this.name;
    }

    public String getCity() {
        return this.city;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Trader trader = (Trader) o;
        return Objects.equals(getName(), trader.getName()) && Objects.equals(getCity(), trader.getCity());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getCity());
    }

    public String toString() {
        return "Trader:"+this.name + " in " + this.city;
    }
}
