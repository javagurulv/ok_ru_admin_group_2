package student_artem_khokhlov.lesson_11.level_5_middle;

import java.util.Objects;

public class Product {
    String name;
    Long price;
    String description;

    public Product(String name, Long price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return name.equals(product.name) && price.equals(product.price) && Objects.equals(description, product.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, description);
    }
}
