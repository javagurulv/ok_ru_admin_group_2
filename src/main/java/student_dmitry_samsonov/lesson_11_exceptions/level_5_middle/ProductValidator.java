package student_dmitry_samsonov.lesson_11_exceptions.level_5_middle;

import java.util.List;

interface ProductValidator {

    List<ValidationException> validate(Product product);

}