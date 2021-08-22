package student_andrey_domas.lesson11.validators;

import student_andrey_domas.lesson11.ValidationException;

public class IntMinMaxFieldValidator implements FieldValidator {

    private int min;
    private int max;

    public IntMinMaxFieldValidator(int min, int max) {
        this.min = min;
        this.max = max;
    }

    @Override
    public void validate(Integer i) throws ValidationException {
        if (i == null)
            return;
        if (min > -1 && i < min)
            throw new ValidationException(i + " < " + min);
        if (max > -1 && i > max)
            throw new ValidationException(i + " > " + max);
    }
}
