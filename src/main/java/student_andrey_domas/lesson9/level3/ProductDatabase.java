package student_andrey_domas.lesson9.level3;

import java.util.Optional;

public interface ProductDatabase {

    void save(Product product);

    Optional<Product> findByTitle(String productTitle);

}