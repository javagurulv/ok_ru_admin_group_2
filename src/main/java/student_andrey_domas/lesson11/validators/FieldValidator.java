package student_andrey_domas.lesson11.validators;

import student_andrey_domas.lesson11.ValidationException;

public interface FieldValidator {
    default void validate(String str) throws ValidationException {
        throw new CantValidateException();
    }
    default void validate(Integer i) throws ValidationException {
        throw new CantValidateException();
    }
}
