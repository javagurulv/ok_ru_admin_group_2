package student_andrey_domas.lesson11;

import java.util.List;

/**
 * Validates fields of instance of T.
 *
 */
public interface Validator<T> {
    List<ValidationException> validate(T instance);
}
