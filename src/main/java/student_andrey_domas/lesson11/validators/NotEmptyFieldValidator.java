package student_andrey_domas.lesson11.validators;

import student_andrey_domas.lesson11.ValidationException;

public class NotEmptyFieldValidator implements FieldValidator {
    @Override
    public void validate(String str) throws ValidationException {
        if (str == null)
            throw new ValidationException("is empty");
    }

    @Override
    public void validate(Integer i) throws ValidationException {
        if (i == null)
            throw new ValidationException("is empty");
    }
}
