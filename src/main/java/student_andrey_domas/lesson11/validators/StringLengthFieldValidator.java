package student_andrey_domas.lesson11.validators;

import student_andrey_domas.lesson11.ValidationException;

public class StringLengthFieldValidator implements FieldValidator {

    private int min;
    private int max;

    public StringLengthFieldValidator(int min, int max) {
        this.min = min;
        this.max = max;
    }

    @Override
    public void validate(String str) throws ValidationException {
        if (str == null)
            return;
        int length = str.length();
        if (length < min)
            throw new ValidationException("length " + length + " < " + min);
        if (length > max)
            throw new ValidationException("length " + length + " > " + max);
    }
}
