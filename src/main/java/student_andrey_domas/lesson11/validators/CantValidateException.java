package student_andrey_domas.lesson11.validators;

import student_andrey_domas.lesson11.ValidationException;

public class CantValidateException extends ValidationException {
    public CantValidateException() {
        super("Can't validate field");
    }
}
