package student_andrey_domas.lesson11;

import student_andrey_domas.lesson11.validators.annotations.ValidatorRuleNotEmpty;
import student_andrey_domas.lesson11.validators.annotations.ValidatorRuleIntMinMax;
import student_andrey_domas.lesson11.validators.annotations.ValidatorRuleStringEnglish;
import student_andrey_domas.lesson11.validators.annotations.ValidatorRuleStringLength;

import java.util.Objects;

public class Product {

    @ValidatorRuleNotEmpty
    @ValidatorRuleStringLength(min = 3, max = 100)
    @ValidatorRuleStringEnglish
    private String title;

    @ValidatorRuleNotEmpty
    @ValidatorRuleIntMinMax(min = 1)
    private Integer price;    // указана в центах

    @ValidatorRuleStringLength(max = 2000)
    @ValidatorRuleStringEnglish
    private String description;

    public Product(String title,
                   Integer price,
                   String description) {
        this.title = title;
        this.price = price;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Product product = (Product) o;
        return Objects.equals(title, product.title) &&
                Objects.equals(price, product.price) &&
                Objects.equals(description, product.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, price, description);
    }

    @Override
    public String toString() {
        return "Product{" +
                "title='" + title + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                '}';
    }
}