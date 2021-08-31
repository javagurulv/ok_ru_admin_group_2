package student_dmitry_samsonov.lesson_9_interfaces.level_3_junior;

import java.util.Optional;

public class InMemoryDatabase implements ProductDatabase {
    Product[] products = new Product[0];
    @Override
    public void save(Product product) {
        int length = this.products.length;
        Product[] newProducts = new Product[length + 1];
        for (int index = 0; index < length; index++) {
            newProducts[index] = this.products[index];
        }
        newProducts[length] = product;
        this.products = newProducts;
    }

    @Override
    public Optional<Product> findByTitle(String productTitle) {
        for (Product product: this.products) {
            if (product.getTitle().equals(productTitle)) {
                return Optional.of(product);
            }
        }
        return Optional.ofNullable(null);
    }
}
