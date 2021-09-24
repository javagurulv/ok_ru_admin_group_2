package student_artem_aleksandrov.lesson9.level3;

import java.util.Optional;

public interface ProductDatabase {
    void save(Product product);

    Optional<Product> findByTitle(String productTitle);

}
