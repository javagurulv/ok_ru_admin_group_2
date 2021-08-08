package student_artem_khokhlov.lesson_8.task_4;

import java.util.Objects;

public class Safe {
    public String password;
    public Integer deposit;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Safe safe = (Safe) o;
        return Objects.equals(password, safe.password) && Objects.equals(deposit, safe.deposit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(password, deposit);
    }

    public Safe(String password, Integer deposit) {
        this.password = password;
        this.deposit = deposit;
    }

    @Override
    public String toString() {
        return "Safe{" +
                "password='" + password + '\'' +
                ", deposit=" + deposit +
                '}';
    }
}
