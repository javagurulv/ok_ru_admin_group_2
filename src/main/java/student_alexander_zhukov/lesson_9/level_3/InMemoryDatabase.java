package student_alexander_zhukov.lesson_9.level_3;

import java.util.Arrays;
import java.util.Objects;
import java.util.Optional;

class InMemoryDatabase implements ProductDatabase {

    private Product[] arrayOfPproducts;

    @Override
    public void save(Product product) {
        if (Objects.isNull(arrayOfPproducts)) {
            arrayOfPproducts = new Product[1];
        } else {
            arrayOfPproducts = Arrays.copyOf(arrayOfPproducts, arrayOfPproducts.length + 1);
        }
        arrayOfPproducts[arrayOfPproducts.length - 1] = product;
    }

    @Override
    public Optional<Product> findByTitle(String productTitle) {
        Product result = null;
        for (Product i: arrayOfPproducts) {
            if (i.getTitle().equals(productTitle)) {
                result = i;
                break;
            }
        }

        return Optional.ofNullable(result);
    }
}
