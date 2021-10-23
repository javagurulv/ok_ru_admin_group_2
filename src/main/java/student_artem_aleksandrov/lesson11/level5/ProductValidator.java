package student_artem_aleksandrov.lesson11.level5;

import java.util.List;

public interface ProductValidator {

    List<ValidationException> validate(Product product);
}
