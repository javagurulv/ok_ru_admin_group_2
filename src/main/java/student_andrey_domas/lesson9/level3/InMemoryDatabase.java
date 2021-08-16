package student_andrey_domas.lesson9.level3;

import java.util.Arrays;
import java.util.Objects;
import java.util.Optional;

public class InMemoryDatabase implements ProductDatabase {

    private Product products[];

    @Override
    public void save(Product product) {
        if (Objects.isNull(products))
            products = new Product[1];
        else
            products = Arrays.copyOf(products, products.length + 1);
        products[products.length - 1] = product;
    }

    @Override
    public Optional<Product> findByTitle(String productTitle) {
        Product found = null;
        for (Product product: products)
            if (productTitle.equals(product.getTitle())) {
                found = product;
                break;
            }
        return Optional.ofNullable(found);
    }
}
