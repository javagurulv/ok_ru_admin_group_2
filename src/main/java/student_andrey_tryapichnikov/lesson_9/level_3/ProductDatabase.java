package student_andrey_tryapichnikov.lesson_9.level_3;

import java.util.Optional;

public interface ProductDatabase{
        void save(Product product);
        Optional<Product> findByTitle(String productTitle);
}
