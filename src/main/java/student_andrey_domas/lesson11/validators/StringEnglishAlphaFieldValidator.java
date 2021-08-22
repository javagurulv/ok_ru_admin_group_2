package student_andrey_domas.lesson11.validators;

import student_andrey_domas.lesson11.ValidationException;

public class StringEnglishAlphaFieldValidator implements FieldValidator {
    @Override
    public void validate(String  str) throws ValidationException {
        if (str != null && str.length() >0 && !str.matches("[a-zA-Z0-9\\s]+"))
            throw new ValidationException("not only English symbols and numbers");
    }
}
