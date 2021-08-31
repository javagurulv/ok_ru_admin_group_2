package student_dmitry_samsonov.lesson_9_interfaces.level_3_junior;

import java.util.Optional;

interface ProductDatabase {
    // Это не функциональный интерфейс, потому что тут больше одного метода

    void save(Product product);

    Optional<Product> findByTitle(String productTitle);

}